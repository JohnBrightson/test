import java.net.*;
class Clientdns12{
public static void main(String[] args)throws Exception{
try(DatagramSocket client=new DatagramSocket()){
byte[] sendbyte=System.console().readLine("Enter DOMAIN NAME or IP address: ").getBytes();
DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,InetAddress.getByName("127.0.0.1"),1309);
client.send(sender);
byte[] receivebyte=new byte[1024];
DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
client.receive(receiver);
System.out.println("Result: "+new String(receiver.getData()).trim());
}}}