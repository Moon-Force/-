package 监听器事件;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class textlisten {
    public static void main(String[] args) {
        Myframework MY= new Myframework();
         windowClosing.windowclosing(MY);
    }

}
class windowClosing{
    public static void windowclosing(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
class Myframework extends Frame {
    public Myframework(){
        TextField textField=new TextField();
//        textField.setEchoChar('*'); 把输入字符变成*
        add(textField);

        textactionListener myactionListener=new textactionListener();
        textField.addActionListener(myactionListener);
        setSize(500,500);
        setVisible(true);
    }
}
class textactionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField  tempfield=(TextField)e.getSource();
        System.out.println(tempfield.getText());
//        清空文本域
        tempfield.setText("");
    }
}
