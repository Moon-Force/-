package TCP下载文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(9999);
    Socket socket=serverSocket.accept();
    InputStream is=socket.getInputStream();
    FileOutputStream FileOutputStream=new FileOutputStream("嘉人.jpg");
    int len;
    byte[] bytes=new byte[1024];
    while ((len=is.read(bytes))!=-1){
        FileOutputStream.write(bytes,0,len);
    }
    OutputStream out=socket.getOutputStream();
    out.write("接受完毕".getBytes());
    socket.close();
    serverSocket.close();
    is.close();
    FileOutputStream.close();
}
}
