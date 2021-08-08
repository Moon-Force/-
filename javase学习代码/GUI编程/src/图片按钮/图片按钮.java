package Õº∆¨∞¥≈•;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

class JButton1 extends JFrame {
    public  JButton1(){
        Container container=this.getContentPane();
        URL url=JButton1.class.getResource("gg.png");
        Icon icon=new ImageIcon(url);
        JButton jButton=new JButton();
        jButton.setIcon(icon);
        jButton.setToolTipText("Õº∆¨±Í«©");
        container.add(jButton);
        setVisible(true);
        setBounds(100,100,500,500);
    }

    public static void main(String[] args) {
        new JButton1();
    }
}
