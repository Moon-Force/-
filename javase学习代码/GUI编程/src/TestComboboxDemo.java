import javax.swing.*;
import java.awt.*;

public class TestComboboxDemo extends JFrame {
    public  TestComboboxDemo(){
        Container container=this.getContentPane();
      JComboBox jComboBox=new JComboBox();
      jComboBox.addItem(null);
      jComboBox.addItem("ÎÒ");
      jComboBox.addItem("ta");
      container.add(jComboBox,BorderLayout.WEST);

//      ÁÐ±í¿ò
      JPanel jPanel = new JPanel();
      String[] str={"1","2","3000"};
      JList list=new JList(str);
      jPanel.add(list);
      container.add(jPanel,BorderLayout.SOUTH);
      this.setVisible(true);
      this.setBounds(0,0,500,500);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TestComboboxDemo();
    }
}
