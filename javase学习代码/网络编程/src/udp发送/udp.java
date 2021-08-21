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
     String str="祝你学习快乐";
     InetAddress ip=InetAddress.getByName("localhost");
     int port=9090;
     DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),0,str.getBytes().length,ip,9090);
//       通过管道发送包
       socket.send(datagramPacket);
    }
}
