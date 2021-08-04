package 布局类型;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 流式布局 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button button1=new Button("but1");
        Button button2=new Button("but2");
        Button button3=new Button("but3");
        Button button4=new Button("but4");
        //设置为流式布局
//        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.setLayout(new FlowLayout());
        frame.setBounds(0,0,1000,1000);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        button4.addActionListener(new MYaction1());
        frame.setVisible(true);
        windowClosing(frame);
    }
    private static void windowClosing(Frame frame){
         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}
class MYaction1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("监听到了");
    }
}
