package udp����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Udpsender {
    public static void main(String[] args) throws IOException {
//        ��һ���˿�
    DatagramSocket socket=new DatagramSocket(8888);
//        �ֽ���ת��Ϊ�ַ���
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       while(true){
//           �ַ���ת�����ַ���
          String msg=reader.readLine();
//          �ַ���ת�����ֽ�
         byte[] bytes=msg.getBytes();
//         �������
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",6666));
           socket.send(packet);
           if(msg.equals("bye")) {
               break;
           }
       }
        socket.close();
    }
}
