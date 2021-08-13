package TCP实现聊天;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class send {
    public static void main(String[] args) {
        Socket socket=null;
        OutputStream OS=null;
        try {
            InetAddress IP=InetAddress.getByName("127.0.0.1");
            int port=9999;
            socket=new Socket(IP, port);
            OS=socket.getOutputStream();
            OS.write("你好世界".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(OS != null){
                try{
                    OS.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if(socket!=null){
                try {
                    socket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
