package µ¥Ñ¡¿ò;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButtondemo extends JFrame {
    public JButtondemo(){
        Container container=this.getContentPane();
        JRadioButton radioButton=new JRadioButton("JRadioButton");
        JRadioButton radioButton1=new JRadioButton("JRadioButton1");

        ButtonGroup group=new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton1);
        container.add(radioButton,BorderLayout.SOUTH);
        container.add(radioButton1,BorderLayout.WEST);
        this.setVisible(true);
        this.setBounds(100,100,500,500);

    }

    public static void main(String[] args) {
        new JButtondemo();
    }
}
