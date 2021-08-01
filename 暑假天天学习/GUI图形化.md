# GUI编程

## 1.组件

- 窗口
- 弹窗
- 面板
- 文本框
- 列表框
- 按钮
- 图片
- 监听事件
- 鼠标事件
- 键盘事件

### 2.简介

Gui的核心技术：Swing AWT(Abstract Window Toolkit)

### 代码


## 组件和容器

### 1.Frame

~~~java
import java.awt.*;

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
    }
}
~~~

#### myframe

```java
package Frame;
import java.awt.*;
public class myFrame {
    public static void main(String[] args) {
  MyFrame1 myFrame=new MyFrame1(100,100,100,100,Color.red);
    }
}
class MyFrame1 extends Frame {
    static int id=0;
  MyFrame1(int x,int y,int w,int h,Color color){
      super("我的"+(++id)+"界面");
      setVisible(true);
      setBounds(x,y,w,h);
      setBackground(color);
      setResizable(false);
  }
}
```

### 2.Panel 

```
ackage Panel;
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

         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
         });
    }
}
```

### test

![image-20210801200541866](https://gitee.com/moon-force/picgo/raw/master/img/image-20210801200541866.png)

## 事件监听器

```java
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
       Button button= new Button("点击我");
       MYaction mYaction=new MYaction();
     button.addActionListener(mYaction);
       frame.add(button,BorderLayout.CENTER);
       frame.pack();
       frame.setVisible(true);
       frame.setSize(400,400);
       Windowclose(frame);
    }
//     关闭事件
    private static void Windowclose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
//事件监听
class MYaction implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("gg");
    }
}
```

