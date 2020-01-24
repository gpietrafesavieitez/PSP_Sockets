package example;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SocketStreamServer{
    
    protected static final String SERVER_HOST = "localhost";
    protected static final int SERVER_PORT = 5555;
    
    public static void main(String[] args){
        try{
            System.out.println("*** SERVER ***");
            System.out.println("Creating new server socket...");
            ServerSocket ss = new ServerSocket();
            System.out.println("Binding...");
            InetSocketAddress isa = new InetSocketAddress(SERVER_HOST, SERVER_PORT);
            ss.bind(isa);
            System.out.println("Listening on port: " + SERVER_PORT);
            Socket s = ss.accept();
            System.out.println("Connection accepted from: " + s.getRemoteSocketAddress());
            InputStream is = s.getInputStream();
            byte[] mensaje = new byte[25];
            is.read(mensaje);
            System.out.println("Read message: " + new String(mensaje));
            System.out.println("Closing socket...");
            s.close();
            System.out.println("Closing server socket...");
            ss.close();
            System.out.println("Done!");
        }catch(IOException ex){
            Logger.getLogger(SocketStreamServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}