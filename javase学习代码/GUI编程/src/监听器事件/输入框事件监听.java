package 监听器事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class 输入框事件监听 {
    public static void main(String[] args) {
        myFrame frame =  new myFrame();
        frame.setVisible(true);
        frame.setSize(200,200);
        closing(frame);
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
class myFrame extends Frame{
    public myFrame(){
//        创建一个文字域
        TextField textField=new TextField();
        add(textField);
        textField.addActionListener(new textFieldActionListener());
    }
}
class textFieldActionListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
//        向下转型
        TextField field=(TextField)e.getSource();
     //得到文字域的信息
        System.out.println(field.getText());
    }
}