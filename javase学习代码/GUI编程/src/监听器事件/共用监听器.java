package �������¼�;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ���ü����� {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button button=new Button("start");
        Button button2=new Button("stop");
        button2.setActionCommand("��Ϸ��ʼ��");
        MyAction5 MyAction=new MyAction5();
        button.addActionListener( MyAction);
        button2.addActionListener(MyAction);
        frame.add(button,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);

        closing(frame);
        frame.setSize(520,520);
        frame.setVisible(true);
    }
    private static void closing(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class MyAction5 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
     if("��Ϸ��ʼ��".equals(e.getActionCommand())){
         System.out.println("gg��");
     }
     else{
         System.out.println("start");
     }
    }
}
