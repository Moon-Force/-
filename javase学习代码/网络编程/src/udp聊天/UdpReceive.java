package udp����;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceive {
    public static void main(String[] args) throws Exception {
//        �򿪶˿�
       DatagramSocket socket=new DatagramSocket(6666);
  while(true){
//      �������ݰ�
      byte[] bytes=new byte[500];
      DatagramPacket datagramPacket=new DatagramPacket(bytes,0,bytes.length);
//      ��������
     socket.receive(datagramPacket);
     byte[] bytes1=datagramPacket.getData();
//      ���ӽڱ��ַ�
     String msg=new String(bytes1,0,bytes1.length);
      System.out.println(msg);
      if (msg.equals("bye")){
          break;
      }
  }
}
}
