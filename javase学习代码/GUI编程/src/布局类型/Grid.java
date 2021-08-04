package 布局类型;

import java.awt.*;
//行列布局
public class Grid {
    public static void main(String[] args) {
        Frame frame=new Frame("布局类型GridLayout");
        Button button=new Button("button");
        Button button1=new Button("button1");
        Button button2=new Button("button2");
        Button button3=new Button("button3");
        Button button4=new Button("button4");
        frame.setLayout(new GridLayout(3,2));
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
//          frame.pack();自动排列布局
        frame.pack();
        frame.setVisible(true);

    }
}
