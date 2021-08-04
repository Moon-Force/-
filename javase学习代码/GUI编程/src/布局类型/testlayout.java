package 布局类型;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class testlayout {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setSize(200,200);
        Button button=new Button("button");
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
//        流式界面
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(button);
        frame.setResizable(false);


    }
}
