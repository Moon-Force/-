package Frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

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
      frame.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.exit(0);
          }
      });
//        frame.addWindowListener(new WindowListener() {
//            @Override
//            public void windowOpened(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowClosing(WindowEvent e) {
//      System.exit(0);
//            }
//
//            @Override
//            public void windowClosed(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowIconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeiconified(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowActivated(WindowEvent e) {
//
//            }
//
//            @Override
//            public void windowDeactivated(WindowEvent e) {
//
//            }
//        });

    }
}
