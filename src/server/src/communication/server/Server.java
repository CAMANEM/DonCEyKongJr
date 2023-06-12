package communication.server;

import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public final class Server {
    static private final Server instance;

    static {
        try {
            instance = new Server();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final ServerSocket serverSocket;
    private Socket socket;
    private InputStreamReader din;
    private OutputStreamWriter dout;

    private Server() throws IOException {
        this.serverSocket = new ServerSocket(3333);
        System.out.println("waiting for connection...");

    }

    public static Server getInstance() throws IOException {
        if (instance == null) {
            try {
                return new Server();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return instance;
        }

    }

    public int WriteToClient(JSONObject input) throws IOException {
        this.socket = serverSocket.accept();
        System.out.println("Client connected!");
        this.dout = new OutputStreamWriter(socket.getOutputStream());
        System.out.println("writing...");
        //JsonObject yeison = Json.createObjectBuilder().add("pipo","piporin").add("pepe", 30).build();

        System.out.println("JSON:" + "\n");
        System.out.println(input.toString() + "\n");
        dout.write(input.toString());
        System.out.println("JSON Written to client!");
        dout.flush();
        dout.close();
        //this.dout = new OutputStreamWriter(s.getOutputStream());
        return 0;
    }

    public int ReadFromClient() throws IOException {
        this.socket = serverSocket.accept();
        System.out.println("Client connected!");
        this.din = new InputStreamReader(socket.getInputStream());
        System.out.println("Reading JSON...");
        int data = din.read();
        //System.out.println(data);
        String InJson = "";
        while (data != -1) {
            InJson += (char) data;
            //System.out.print((char)data);
            data = din.read();
        }
        System.out.println("JSON read!");
        System.out.println(InJson);
        din.close();
        //this.din = new InputStreamReader(s.getInputStream());
        return 0;
    }

    public void CloseSockets() throws IOException {
        socket.close();
        serverSocket.close();
    }
}
