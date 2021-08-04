import java.io.*;

public class BufferInputStream {
    public static void main(String[] args) throws IOException {
 String str =new String();
 InputStream in=new FileInputStream("D:\\520.txt");
 BufferedInputStream BufferInputStream=new BufferedInputStream(in);
 byte[] bytes=new byte[500];
 int i=0;
 while((i=BufferInputStream.read(bytes))!=-1){
     str+=new String(bytes,0,i);
 }
 System.out.println(str);
 in.close();
 BufferInputStream.close();
    }
}
