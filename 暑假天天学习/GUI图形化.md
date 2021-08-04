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

## 三种布局

### 1.流式布局

```JAVA
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
```

### 2.边框布局

```
import java.awt.*;

public class 边框布局 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button east=new Button("east");
        Button west=new Button("west");
        Button south=new Button("south");
        Button north=new Button("north");
        Button center=new Button("center");
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.setSize(200,200);
        frame.setVisible(true);
        
    }
}
```

### 3.表格布局

```
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
```



## test

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

## 文字域监听器

```
package 监听器事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 输入监听 {
    public static void main(String[] args) {
        TestMyFrame myFrame = new TestMyFrame();
        myFrame.setVisible(true);
        myFrame.setBounds(200,200,500,500);
        closing(myFrame);
    }
    private static void closing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class TestMyFrame extends Frame{
    public TestMyFrame() {
        TextField textField=new TextField();
        add(textField);
        textField.addActionListener(new actionListener());
    }
}
class actionListener implements ActionListener {
    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
     TextField textField=(TextField) e.getSource();
        System.out.println(textField.getText());
    }
}
```

## 简易计算器

```
      Operation operation;
        String op;
        Scanner scanner=new Scanner(System.in);
//
        System.out.println("输入a");
        double a=scanner.nextDouble();
//
        System.out.println("输入符号");
        op=scanner.next();
//
        System.out.println("输入b");
        double b=scanner.nextDouble();
//
        operation= OpFactory.creatOp(op);
        //子类可以调用父类方法，所以当 operation= OpFactory.creatOp(op)后，还能使用operation的setNUMA方法
        operation.setNumA(a);
        operation.setNumB(b);
        System.out.println(operation.getresult());
```
