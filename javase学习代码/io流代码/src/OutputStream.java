import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        String str="hyt520";
        FileOutputStream out=new FileOutputStream("D:\\out.txt");
//        BufferedOutputStream c=new BufferedOutputStream(out);
        byte[] bytes=new byte[500];
        bytes=str.getBytes();
//       bufferedOutputStream.writr(bytes);¸ü¿ìËÙ

        out.write(bytes);
    }
}
