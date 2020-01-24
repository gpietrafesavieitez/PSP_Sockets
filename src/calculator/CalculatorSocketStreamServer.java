package calculator;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorSocketStreamServer {

    protected static final String SERVER_HOST = "localhost";
    protected static final int SERVER_PORT = 5555;

    public static void main(String[] args) {
        try {
            // For attend more requests need to create a loop to start listening clients again
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
            OutputStream os = s.getOutputStream();
            int op = -1;
            while (op != 0) {
                int f1 = is.read();
                System.out.println(f1);
                int f2 = is.read();
                System.out.println(f2);
                op = is.read();
                System.out.println(op);
                switch (op) {
                    case 1:
                        os.write(f1 + f2);
                        break;
                    case 2:
                        os.write(f1 - f2);
                        break;
                    case 3:
                        os.write(f1 * f2);
                        break;
                    case 4:
                        os.write(f1 / f2);
                        break;
                    case 5:
                        os.write(f1 % f2);
                        break;
                }
            }
            System.out.println("Closing socket...");
            s.close();
            System.out.println("Closing server socket...");
            ss.close();
            System.out.println("Done!");
        } catch (IOException ex) {
            Logger.getLogger(CalculatorSocketStreamServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
