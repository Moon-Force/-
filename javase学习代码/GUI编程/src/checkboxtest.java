import javax.swing.*;
import java.awt.*;

public class checkboxtest extends JFrame {
    public checkboxtest(){
        Container container=this.getContentPane();
        Checkbox checkbox=new Checkbox("1");
        Checkbox checkbox1=new Checkbox("2");
        container.add(checkbox1,BorderLayout.WEST);
        container.add(checkbox,BorderLayout.SOUTH);
        setVisible(true);
        setBounds(100,100,500,600);
    }

    public static void main(String[] args) {
        new checkboxtest();
    }
}
