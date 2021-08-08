import javax.swing.*;
import java.awt.*;

class JScrolldemo extends JFrame {
     public  JScrolldemo(){
     Container container=this.getContentPane();
     JTextArea textArea=new JTextArea(50,50);
     textArea.setText("»¶Ó­ÌÎ");
     JScrollPane scrollPane=new JScrollPane( textArea);
     container.add(scrollPane);
     setVisible(true);
     setBounds(10,10,500,500);
     }

    public static void main(String[] args) {
        new JScrolldemo();
    }
}
