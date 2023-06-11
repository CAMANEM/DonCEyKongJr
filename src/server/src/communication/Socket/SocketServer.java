package communication.Socket;

import javax.json.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    static private SocketServer instance;

    static {
        try {
            instance = new SocketServer();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ServerSocket ss;
    private Socket s;
    private InputStreamReader din;
    private OutputStreamWriter dout;

    private SocketServer() throws IOException {
        this.ss = new ServerSocket(3333);
        System.out.println("waiting for connection...");

    }

    public static SocketServer getInstance() throws IOException {
        if(instance == null){
            try {
                return new SocketServer();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{return instance;}

    }

    public int WriteToClient(JsonObject input) throws IOException {
        this.s=ss.accept();
        System.out.println("Client connected!");
        this.dout = new OutputStreamWriter(s.getOutputStream());
        System.out.println("writing...");
        //JsonObject yeison = Json.createObjectBuilder().add("pipo","piporin").add("pepe", 30).build();

        System.out.println("JSON:"+"\n");
        System.out.println(input.toString()+"\n");
        dout.write(input.toString());
        System.out.println("JSON Written to client!");
        dout.flush();
        dout.close();
        //this.dout = new OutputStreamWriter(s.getOutputStream());
        return 0;
    }

    public int ReadFromClient() throws IOException {
        this.s=ss.accept();
        System.out.println("Client connected!");
        this.din = new InputStreamReader(s.getInputStream());
        System.out.println("Reading JSON...");
        int data = din.read();
        //System.out.println(data);
        String InJson = "";
        while (data != -1) {
            InJson += (char)data ;
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


        s.close();
        ss.close();
    }

}
