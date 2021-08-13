package TCP µœ÷¡ƒÃÏ;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) {
        ServerSocket serverSocket=null;
        Socket sersocket =null;
        InputStream is=null;
        ByteArrayOutputStream baos=null;
        try {
       serverSocket=new ServerSocket(9999);
       sersocket=serverSocket.accept();
       is=sersocket.getInputStream();
       baos=new ByteArrayOutputStream();
       byte[] buffer=new byte[1024];
       int len;
       while((len=is.read(buffer))!=-1){
           baos.write(buffer,0,len);
       }
            System.out.println(baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
       if(baos != null){
           try {
               baos.close();
           }catch (IOException e) {
               e.printStackTrace();
           }
       }
       if(is!=null){
           try{
               is.close();
           }catch (IOException e){
               e.printStackTrace();
           }
       }
            if(sersocket !=null){
                try{
                    sersocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(serverSocket!=null){
                try{
                    serverSocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
