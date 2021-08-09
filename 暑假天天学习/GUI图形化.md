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

## 画笔

```
import java.awt.*;

public class paint {
    public static void main(String[] args) {
     new Mypaint().LoadFrame();
    }
}
class Mypaint extends Frame{
    public void LoadFrame(){
        setVisible(true);
        setBounds(100,100,1000,1000);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(100,100,100,100);
        g.fillRect(300,300,300,300);
    }

}
```

为什么只调用了loadframe就会一起调用paint方法

```java
package 鼠标监听事件;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class 画笔鼠标监听 {
    public static void main(String[] args) {
   new MyFrame("1");
    }
}
class MyFrame extends Frame{
    ArrayList PointarrayList;
    public MyFrame(String title){
        super(title);
        PointarrayList = new ArrayList<>();
        setVisible(true);
        setBounds(0,0,1000,1000);
        this.addMouseListener(new Mouaction());
        windowClosing.closing(this);
    }
    private class Mouaction extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame MyFrame=(MyFrame)e.getSource();
           PointarrayList.add(new Point(e.getX(),e.getY()));
           MyFrame.repaint();
        }
    }


    @Override
    public void paint(Graphics g) {
        Iterator Iterator=PointarrayList.iterator();
        while(Iterator.hasNext()){
            Point point= (Point) Iterator.next();
            g.setColor(Color.GREEN);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    private class windowClosing{
        private static void closing(Frame frame){
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }
}

```

## 键盘监听器

```
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 键盘监听 {
     public static void main(String[] args) {
          new KeyFrame();
     }
}
class  KeyFrame extends Frame{
     public KeyFrame(){
          setVisible(true);
          setBounds(100,100,500,500);
          addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent e) {
                    int kbcode=e.getKeyCode();
                    if(kbcode==KeyEvent.VK_UP){
                         System.out.println("up");
                    }
               }
          });
          addWindowListener(new WindowAdapter() {
               @Override
               public void windowClosing(WindowEvent e) {
                    System.exit(0);
               }
          });
     }
}
```

## 弹窗

```
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialogdemo extends JFrame {
     public Dialogdemo(){
          setVisible(true);
          setSize(700,500);
          Container container=this.getContentPane();
//          绝对布局
          container.setLayout(null);
//          按钮
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          JButton jButton = new JButton("点击弹出对话框");
          jButton.setBounds(30,30,200,200);
          jButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
               new  Dialogdemo1();
               }
          });
          container.add(jButton);
     }

     public static void main(String[] args) {
           new Dialogdemo();
     }
}
class Dialogdemo1 extends JDialog{
     public Dialogdemo1(){
          setVisible(true);
          setBounds(100,100,500,500);
          Container container=this.getContentPane();
          container.setLayout(null);
          container.add(new Label("666"));
     }
}
```

## Icon图标显示

```
import javax.swing.*;
import java.awt.*;

class IconDemo extends JFrame implements  Icon {
    private  int width;
    private  int height;
    public IconDemo(){}
    public IconDemo(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void init(){
        IconDemo icon = new IconDemo(100,200);
        JLabel label=new JLabel("icontest",icon,SwingConstants.CENTER);
        Container container=getContentPane();
        container.add(label);
        setVisible(true);
        setBounds(100,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
           new IconDemo().init();
    }
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
          g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
```

## 文本域滑动面板

```
import javax.swing.*;
import java.awt.*;

class JScrolldemo extends JFrame {
     public  JScrolldemo(){
         Container container=this.getContentPane();

         JTextArea textArea=new JTextArea(50,50);
         textArea.setText("欢迎学习");
         JScrollPane scrollPane=new JScrollPane(textArea);
         container.add(scrollPane);
         this.setVisible(true);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setBounds(100,100,300,500);
     }

    public static void main(String[] args) {
        new JScrolldemo();
    }
}
```

## 图片按钮 

```
package 图片按钮;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

class JButton1 extends JFrame {
    public  JButton1(){
        Container container=this.getContentPane();
        URL url=JButton1.class.getResource("gg.png");
        Icon icon=new ImageIcon(url);
        JButton button=new JButton();
        button.setIcon(icon);
        button.setToolTipText("图片按钮");
        container.add(button);
        this.setVisible(true);
        this.setBounds(100,100,600,600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButton1();
    }
}
```

## 单选框

```
import javax.swing.*;
import java.awt.*;

class RadioButtonTest extends JFrame {
    public  RadioButtonTest(){
        Container container=this.getContentPane();
        JRadioButton radioButton=new JRadioButton("radiobut");
        JRadioButton radioButton1=new JRadioButton("radiobut1");
        ButtonGroup group =new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton1);
        container.add(radioButton,BorderLayout.WEST);
        container.add(radioButton1,BorderLayout.SOUTH);
        setVisible(true);
        setBounds(100,100,500,500);

    }

    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
```

## 多选框

```
import javax.swing.*;
import java.awt.*;

public class checkboxtest extends JFrame {
    public checkboxtest(){
        Container container=this.getContentPane();
        Checkbox checkbox=new Checkbox("1");
        Checkbox checkbox1=new Checkbox("2");
        container.add(checkbox1,BorderLayout.WEST);
        container.add(checkbox,BorderLayout.SOUTH);
        setVisible(true);
        setBounds(100,100,500,600);
    }

    public static void main(String[] args) {
        new checkboxtest();
    }
}
```

## 下拉框(JComboBox)和列表框

```
import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo extends JFrame {
    public  TestComboboxDemo(){
        Container container=this.getContentPane();
      JComboBox jComboBox=new JComboBox();
      jComboBox.addItem(null);
      jComboBox.addItem("我");
      jComboBox.addItem("ta");
      container.add(jComboBox,BorderLayout.WEST);

//      列表框
      JPanel jPanel = new JPanel();
      String[] str={"1","2","3000"};
      JList list=new JList(str);
      jPanel.add(list);
      container.add(jPanel,BorderLayout.SOUTH);
      this.setVisible(true);
      this.setBounds(0,0,500,500);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemo();
    }
}
```

## 文本框

```
import javax.swing.*;
import java.awt.*;

class TestText extends JFrame {
    public TestText(){
        Container container=this.getContentPane();
        JTextField TextField=new JTextField("hello");
        JTextField TextField1=new JTextField("world",20);
        container.add(TextField,BorderLayout.WEST);
        container.add(TextField1,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setBounds(20,20,500,500);
    }

    public static void main(String[] args) {
        new TestText();
    }
}
```

## 密码框

```
import javax.swing.*;
import java.awt.*;

class TestText extends JFrame {
    public TestText(){
        Container container=this.getContentPane();
      JPasswordField jp=new JPasswordField();
      jp.setEchoChar('*');
      container.add(jp);
        this.setVisible(true);
        this.setBounds(20,20,500,500);
    }

    public static void main(String[] args) {
        new TestText();
    }
}
```

## 文本域

```
import javax.swing.*;
import java.awt.*;

class TestText extends JFrame {
    public TestText(){
        Container container=this.getContentPane();
     JTextArea ja=new JTextArea(50,500);
     JScrollPane jscp=new JScrollPane(ja);

      container.add(jscp);
        this.setVisible(true);
        this.setBounds(20,20,500,500);
    }

    public static void main(String[] args) {
        new TestText();
    }
}
```

