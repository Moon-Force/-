import javax.swing.*;
import java.awt.*;

class IconDemo extends JFrame implements  Icon {
    private  int width,height;
    public static void main(String[] args) {
         new IconDemo().init();
    }
    public IconDemo(){};
    public IconDemo(int width, int height) {
      this.width = width;
      this.height = height;
    }
    public void init(){

        IconDemo icon = new IconDemo(15,15);
        JLabel jLabel = new JLabel("ICON",icon,SwingConstants.CENTER);
        Container container=this.getContentPane();
        container.add(jLabel);
        setVisible(true);
        setBounds(100,100,500,500);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
           g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}
