import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class out {
    public static void main(String[] args) throws IOException {
        String str="2021/8/4";
       FileOutputStream out = new FileOutputStream("D:\\8.4.txt");
        byte[] bytes=new byte[500];
        bytes=str.getBytes();
        out.write(bytes);
    }
}
