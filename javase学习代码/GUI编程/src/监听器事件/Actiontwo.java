package 监听器事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Actiontwo {
    public static void main(String[] args) {
        Frame frame=new Frame("66");
        Button button=new Button("start");
        Button button1=new Button("stop");
        button1.setActionCommand("一切都结束了");
        Myaction1 myaction=new Myaction1();
        button1.addActionListener(myaction);
        button.addActionListener(myaction);
        frame.add(button1,BorderLayout.EAST);
        frame.add(button,BorderLayout.WEST);
        frame.setVisible(true);
        frame.setSize(400,500);
        windowcloing(frame);

    }
   private static void windowcloing(Frame frame){
      frame.addWindowListener(new WindowAdapter() {
          @Override
          public void windowClosing(WindowEvent e) {
              System.out.println("程序gg了");
              System.exit(0);
          }
      });
    }
}

class  Myaction1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        if ("一切都结束了".equals(e.getActionCommand()))
        {
            System.out.println("msg:"+e.getActionCommand());
            System.exit(0);
        }
        else
        System.out.println("msg:"+e.getActionCommand());
    }
}