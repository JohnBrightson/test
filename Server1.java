import java.net.*;

public class Server1 {
    public static void main(String args[]) throws Exception {

        ServerSocket server = new ServerSocket(4000);
        System.out.println("Server is running.");

        Socket socket = server.accept();

        System.out.println("Reading image from disk.");
        Thread.sleep(1000);

        System.out.println("Sending image to Client.");
        Thread.sleep(1000);

        System.out.println("Image sent to client.");

        socket.close();
        server.close();
    }
}