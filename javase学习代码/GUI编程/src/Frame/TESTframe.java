package Frame;

import java.awt.*;

public class TESTframe {
    public static void main(String[] args) {
        Frame frame = new Frame("�ҵĵ�һ��ͼ�ν���");
//        ���ÿɼ���
        frame.setVisible(true);
//        ���ô��ڴ�С
        frame.setSize(400,400);
//        ���ñ�����ɫ
        frame.setBackground(new Color(248, 17, 17));
//     �����ĳ�ʼλ��
        frame.setLocation(200,200);
//      ���ô�С�̶�
        frame.setResizable(false);
    }
}
