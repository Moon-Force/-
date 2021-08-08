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