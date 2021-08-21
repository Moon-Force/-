package udp聊天;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class Udpsender {
    public static void main(String[] args) throws IOException {
//        打开一个端口
    DatagramSocket socket=new DatagramSocket(8888);
//        字节流转化为字符流
      BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       while(true){
//           字符流转换成字符串
          String msg=reader.readLine();
//          字符串转化成字节
         byte[] bytes=msg.getBytes();
//         创建打包
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",6666));
           socket.send(packet);
           if(msg.equals("bye")) {
               break;
           }
       }
        socket.close();
    }
}
