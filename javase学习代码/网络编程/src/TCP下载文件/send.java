package TCP下载文件;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class send {
    public static void main(String[] args) throws Exception {
         Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9999);
          OutputStream os=socket.getOutputStream();
         FileInputStream filein=new FileInputStream(new File("小姐.jpg"));
          int len;
          byte[] bytes=new byte[1024];
          while((len=filein.read(bytes))!=-1){
              os.write(bytes,0,len);
          }
          socket.shutdownOutput();
          InputStream inp=socket.getInputStream();
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          int len2;
          byte[] bytes2=new byte[1024];
          while((len2=inp.read(bytes2))!=-1){
              baos.write(bytes2,0,len2);
          }
        System.out.println(baos.toString());
        }
}
