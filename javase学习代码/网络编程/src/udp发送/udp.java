package udp����;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class udp {
    public static void main(String[] args) throws Exception {
//        �����ܵ�
       DatagramSocket socket=new DatagramSocket();
//       ������
       InetAddress address=InetAddress.getByName("localhost");
       String msg="ѧϰʹ�ҿ���";
       DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,address,9090);
//       ͨ���ܵ����Ͱ�
       socket.send(datagramPacket);
    }
}
