package panel���;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestPanel extends JFrame{
    public static void main(String[] args) {
        Frame frame=new Frame("���ֵĸ���");

        Panel panel=new Panel();
//        ���ò���
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0x21F10A));
//        PANEL���������൱��frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(0x0A0AF1));
        frame.add(panel);
        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        �����ò������෽��
//        JFrame��Frame����
//������
         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}
