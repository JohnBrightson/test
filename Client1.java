import javax.swing.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Client1 {
    public static void main(String args[]) throws Exception {

        System.out.println("Client Waiting for image");

        // Directly read from local file instead of socket
        BufferedImage bImage = ImageIO.read(new File("image1.jpg"));

        System.out.println("Image received");
        System.out.println("Image Size: " + (new File("image1.jpg").length()/1024) + "KB");

        JFrame f = new JFrame("Server");
        ImageIcon icon = new ImageIcon(bImage);
        JLabel l1 = new JLabel();

        l1.setIcon(icon);
        f.add(l1);
        f.pack();
        f.setVisible(true);
    }
}