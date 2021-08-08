package Í¼Æ¬»­±Ê;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIcondemo extends JFrame {
       public ImageIcondemo(){
           JLabel jLabel=new JLabel("imageicon");
           URL url=ImageIcondemo.class.getResource("Í¼Æ¬°´Å¥/gg.png");
           ImageIcon imageIcon=new ImageIcon(url);
           jLabel.setIcon(imageIcon);
           jLabel.setHorizontalAlignment(SwingConstants.CENTER);

           Container container =getContentPane();
           container.add(jLabel);
           setVisible(true);
           setDefaultCloseOperation(EXIT_ON_CLOSE);
           setBounds(100,100,500,500);
       }

    public static void main(String[] args) {
        new ImageIcondemo();
    }
}
