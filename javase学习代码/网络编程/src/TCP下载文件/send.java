package TCP�����ļ�;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class send {
    public static void main(String[] args) throws Exception {
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),9999);
        OutputStream os=socket.getOutputStream();
        try (FileInputStream fileInputStream = new FileInputStream(new File("С��.jpg"))) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                os.write(bytes,0, len);
            }
            socket.shutdownOutput();
          InputStream inputStream = socket.getInputStream();
          ByteArrayOutputStream baos = new ByteArrayOutputStream();
          int len1;
          byte[] byte2=new byte[1024];
          while((len1=inputStream.read(byte2))!=-1){
              baos.write(byte2,0,len1);
          }
            System.out.println( baos.toString());
        }catch (Exception e){
            System.out.println("û�д��ļ�");
        }finally {
            socket.close();
            os.close();
        }
        }

}
