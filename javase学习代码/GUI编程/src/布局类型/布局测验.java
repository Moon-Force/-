package 布局类型;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//测试图片
//https://gitee.com/moon-force/picgo/raw/master/img/image-20210801200541866.png
public class 布局测验 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        frame.setLayout(new GridLayout(2,1));
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
//上面两个
        Panel panel1=new Panel(new BorderLayout());
        Button button=new Button("one");
        panel1.add(button,BorderLayout.EAST);
        Button button1=new Button("two");
        panel1.add(button1,BorderLayout.WEST);
//

//
        Panel panel2=new Panel(new GridLayout(2,1));
        Button button2=new Button("3");
        Button button3=new Button("4");
        panel2.add(button2);
        panel2.add(button3);
        panel1.add(panel2,BorderLayout.CENTER);
        frame.add(panel1);
//下面左右两个
        Panel panel3=new Panel(new BorderLayout());
        Button but1=new Button("1");
        Button but2=new Button("2");
        panel3.add(but1,BorderLayout.WEST);
        panel3.add(but2,BorderLayout.EAST);
//下面4个
        Panel panel4=new Panel(new GridLayout(2,2));
       for(int i=0;i<4;i++){
           panel4.add(new Button("name:"+i));
       }
       panel3.add(panel4,BorderLayout.CENTER);
       frame.add(panel3);
    }
}
