package calculator.nogui;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorSocketStreamClient {

    public static void main(String[] args) {
        try {
            // Every client needs to be executed in a rand thread
            System.out.println("*** CLIENT ***");
            System.out.println("Creating new client socket...");
            Socket s = new Socket();
            System.out.println("Establishing connection...");
            InetSocketAddress isa = new InetSocketAddress(CalculatorSocketStreamServer.SERVER_HOST, CalculatorSocketStreamServer.SERVER_PORT);
            s.connect(isa);
            InputStream is = s.getInputStream();
            OutputStream os = s.getOutputStream();
            Scanner sc = new Scanner(System.in);
            int op;
            do {
                System.out.print("Enter first number: ");
                op = sc.nextInt();
                os.write(op);
                System.out.print("Enter second number: ");
                op = sc.nextInt();
                os.write(op);
                System.out.print("Enter operation\n1) Add\n2) Substract\n3) Multiply\n4) Divide\n5) Module\n0) Exit\n:");
                op = sc.nextInt();
                os.write(op);
                System.out.println(is.read());
            } while (op != 0);
            System.out.println("Closing client socket...");
            s.close();
            System.out.println("Done!");
        } catch (IOException ex) {
            Logger.getLogger(CalculatorSocketStreamClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
