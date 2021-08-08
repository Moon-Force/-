import javax.swing.*;
import java.awt.*;

class RadioButtonTest extends JFrame {
    public  RadioButtonTest(){
        Container container=this.getContentPane();
        JRadioButton radioButton=new JRadioButton("radiobut");
        JRadioButton radioButton1=new JRadioButton("radiobut1");
        ButtonGroup group =new ButtonGroup();
        group.add(radioButton);
        group.add(radioButton1);
        container.add(radioButton,BorderLayout.WEST);
        container.add(radioButton1,BorderLayout.SOUTH);
        setVisible(true);
        setBounds(100,100,500,500);

    }

    public static void main(String[] args) {
        new RadioButtonTest();
    }
}
