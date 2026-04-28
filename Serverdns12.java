import java.net.*;
class Serverdns12{
public static void main(String[] args)throws Exception{
System.out.println("Server Ready\nPress Ctrl+C to Quit");
try(DatagramSocket server=new DatagramSocket(1309)){
byte[] receivebyte=new byte[1024];
DatagramPacket receiver=new DatagramPacket(receivebyte,1024);
server.receive(receiver);
String s=new String(receiver.getData()).trim();
String[] ip={"142.250.183.46","142.250.183.46"};
String[] name={"www.google.com","www.youtube.com"};
byte[] sendbyte;
for(int i=0;i<ip.length;i++){
if(s.equals(ip[i])) sendbyte=name[i].getBytes();
else if(s.equals(name[i])) sendbyte=ip[i].getBytes();
else continue;
server.send(new DatagramPacket(sendbyte,sendbyte.length,receiver.getAddress(),receiver.getPort()));
break;
}
}}}