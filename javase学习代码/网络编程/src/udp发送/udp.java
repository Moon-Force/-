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
     String str="ף��ѧϰ����";
     InetAddress ip=InetAddress.getByName("localhost");
     int port=9090;
     DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(),0,str.getBytes().length,ip,9090);
//       ͨ���ܵ����Ͱ�
       socket.send(datagramPacket);
    }
}
