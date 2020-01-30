package PSP_Sockets_1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketStreamClient{
    
    public static void main(String[] args){
        try{
            System.out.println("*** CLIENT ***");
            System.out.println("Creating new client socket...");
            Socket s = new Socket();
            System.out.println("Establishing connection...");
            InetSocketAddress isa = new InetSocketAddress(SocketStreamServer.SERVER_HOST, SocketStreamServer.SERVER_PORT);
            s.connect(isa);
            OutputStream os = s.getOutputStream();
            System.out.println("Sending message...");
            String mensaje = "message from the client";
            os.write(mensaje.getBytes());
            System.out.println("Message sent.");
            System.out.println("Closing client socket...");
            s.close();
            System.out.println("Done!");
        }catch(IOException ex){
            Logger.getLogger(SocketStreamClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}