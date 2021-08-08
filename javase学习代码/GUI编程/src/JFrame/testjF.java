package JFrame;

import javax.swing.*;
import java.awt.*;

public class testjF {
    public static void main(String[] args) {
        new jframe().init();
    }
}
class jframe extends JFrame{
 public  void init() {
     setVisible(true);
     setBounds(100,100,500,500);
     JLabel label=new JLabel("hello");
     label.setHorizontalAlignment(SwingConstants.CENTER);
     add(label);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     Container container = this.getContentPane();
     container.setBackground(Color.blue);
 }
    }

