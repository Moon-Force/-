package udp·¢ËÍ;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udpserver {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket(9090);
        byte[] bytes=new byte[500];
       DatagramPacket datagramPacket = new DatagramPacket(bytes,0, bytes.length);
        socket.receive(datagramPacket);
        System.out.println(datagramPacket.getAddress().getHostName());
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
    }
}
