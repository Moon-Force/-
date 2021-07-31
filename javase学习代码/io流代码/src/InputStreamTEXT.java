import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author tao
 * @version 1.0
 */
//思路把byte 变成 string
public class InputStreamTEXT {
    public static void main(String[] args) throws IOException {
        String str=new String();
        InputStream in=new FileInputStream(new File("D:\\520.txt"));
        byte[] bytes=new byte[500];
        int i=0;
//        这个方法是从此输入流中将最多 in.length 个字节的数据读入一个 byte 数组中
        while((i=in.read(bytes))!=-1){
            System.out.println(i);
//            从第0位开始，到i 把bytes变成string
            str+=new String(bytes,0,i);
        }
        System.out.println(str);
        in.close();
    }

}
