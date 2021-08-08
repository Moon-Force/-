package »­±Ê;

import java.awt.*;

public class paint {
    public static void main(String[] args) {
     new Mypaint().LoadFrame();
    }
}
class Mypaint extends Frame{
    public void LoadFrame(){
        setVisible(true);
        setBounds(100,100,1000,1000);
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillOval(100,100,100,100);
        g.fillRect(300,300,300,300);
    }

}
