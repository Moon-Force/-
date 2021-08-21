package udp聊天;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceive {
    public static void main(String[] args) throws Exception {
//        打开端口
       DatagramSocket socket=new DatagramSocket(6666);
  while(true){
//      创建数据包
      byte[] bytes=new byte[500];
      DatagramPacket datagramPacket=new DatagramPacket(bytes,0,bytes.length);
//      接受数据
     socket.receive(datagramPacket);
     byte[] bytes1=datagramPacket.getData();
//      把子节变字符
     String msg=new String(bytes1,0,bytes1.length);
      System.out.println(msg);
      if (msg.equals("bye")){
          break;
      }
  }
}
}
