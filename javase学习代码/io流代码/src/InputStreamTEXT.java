import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author tao
 * @version 1.0
 */
//˼·��byte ��� string
public class InputStreamTEXT {
    public static void main(String[] args) throws IOException {
        String str=new String();
        InputStream in=new FileInputStream(new File("D:\\520.txt"));
        byte[] bytes=new byte[500];
        int i=0;
//        ��������ǴӴ��������н���� in.length ���ֽڵ����ݶ���һ�� byte ������
        while((i=in.read(bytes))!=-1){
            System.out.println(i);
//            �ӵ�0λ��ʼ����i ��bytes���string
            str+=new String(bytes,0,i);
        }
        System.out.println(str);
        in.close();
    }

}
