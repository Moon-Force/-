import java.io.*;

public class BufferInputStream {
    public static void main(String[] args) throws IOException {
        String str=new String();
        InputStream in=new FileInputStream(new File("D:\\520.txt"));
//     BufferedInputStream   ¸ü¿ìËÙ
        BufferedInputStream bufferedInputStream=new BufferedInputStream(in);
        byte[] bytes=new byte[500];
         int i=0;
         while ((i=bufferedInputStream.read(bytes))!=-1){
             str+=new String(bytes,0,i);
         }
        System.out.println(str);
    }
}
