package 布局类型;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 表格布局 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button Button=new Button("1.1");
        Button Button1=new Button("1.2");
        Button Button2=new Button("2.1");
        Button Button3=new Button("2.2");
        frame.setLayout(new GridLayout(2,2));
        frame.add( Button);
        frame.add(Button1);
        frame.add(Button2);
        frame.add(Button3);
        frame.setVisible(true);
        closing(frame);
    }
    public static void closing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
