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
    private BufferedReader br;

    private SocketServer() throws IOException {
        this.ss = new ServerSocket(3333);
        System.out.println("waiting for connection...");
        this.s=ss.accept();
        System.out.println("Client connected!"+s);
        this.din = new InputStreamReader(s.getInputStream());
        this.dout = new OutputStreamWriter(s.getOutputStream());
        this.br = new BufferedReader(new InputStreamReader(System.in));
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

    public int Write_to_Client() throws IOException {
        System.out.println("writing...");
        JsonObject yeison = Json.createObjectBuilder().add("pipo","piporin").add("pepe", 30).build();

        System.out.println("JSON:"+"\n");
        System.out.println(yeison.toString()+"\n");
        System.out.println("Writing JSON...");
        dout.write(yeison.toString());
        dout.flush();
        System.out.println("JSON Written to client!");
        s.close();
        //ss.close();
        return 0;
    }

}
