package panel组件;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel extends JFrame{
    public static void main(String[] args) {
        Frame frame=new Frame("布局的概念");

        Panel panel=new Panel();
//        设置布局
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0x21F10A));
//        PANEL设置坐标相当于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(0x0A0AF1));
        frame.add(panel);
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        父类用不了子类方法
//        JFrame是Frame子类
//监听器
         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}
