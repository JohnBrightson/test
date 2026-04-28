import java.io.*;
import java.net.*;

public class Client002 {
    public static void main(String[] args) {

        try {
            // Connect to server
            Socket s = new Socket("localhost", 1234);
            System.out.println("Connected to server");

            // Input and Output streams
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(s.getInputStream()));

            PrintWriter pw = new PrintWriter(
                    s.getOutputStream(), true);

            // Send message to server
            pw.println("Hello Server");

            // Receive response from server
            String response = br.readLine();
            System.out.println("Message from server: " + response);

            // Close connection
            s.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}