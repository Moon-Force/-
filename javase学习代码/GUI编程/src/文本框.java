import javax.swing.*;
import java.awt.*;

class TestText extends JFrame {
    public TestText(){
        Container container=this.getContentPane();
     JTextArea ja=new JTextArea(50,500);
     JScrollPane jscp=new JScrollPane(ja);

      container.add(jscp);
        this.setVisible(true);
        this.setBounds(20,20,500,500);
    }

    public static void main(String[] args) {
        new TestText();
    }
}
