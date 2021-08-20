package udp发送;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp {
    public static void main(String[] args) throws Exception {
//        开启管道
       DatagramSocket socket=new DatagramSocket();
//       创建包
       InetAddress address=InetAddress.getByName("localhost");
       String msg="学习使我快乐";
       DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,address,9090);
//       通过管道发送包
       socket.send(datagramPacket);
    }
}
