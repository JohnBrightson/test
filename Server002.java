import java.io.*;
import java.net.*;

public class Server002 {
    public static void main(String[] args) {

        try {
            // Create server socket on port 1234
            ServerSocket ss = new ServerSocket(1234);
            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            // Accept client connection
            Socket s = ss.accept();
            System.out.println("Client connected");

            // Input and Output streams
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter pw = new PrintWriter(
                    s.getOutputStream(), true);

            // Read message from client
            String msg = br.readLine();
            System.out.println("Message from client: " + msg);

            // Send response to client
            pw.println("Hello Client");

            // Close connection
            s.close();
            ss.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}