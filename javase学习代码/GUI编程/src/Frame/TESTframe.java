package Frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TESTframe {
    public static void main(String[] args) {
        Frame frame = new Frame("我的第一个图形界面");
//        设置可见性
        frame.setVisible(true);
//        设置窗口大小
        frame.setSize(400,400);
//        设置背景颜色
        frame.setBackground(new Color(248, 17, 17));
//     弹出的初始位置
        frame.setLocation(200,200);
//      设置大小固定
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
