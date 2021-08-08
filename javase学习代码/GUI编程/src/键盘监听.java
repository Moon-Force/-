import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ¼üÅÌ¼àÌý {
     public static void main(String[] args) {
          new KeyFrame();
     }
}
class  KeyFrame extends Frame{
     public KeyFrame(){
          setVisible(true);
          setBounds(100,100,500,500);
          addKeyListener(new KeyAdapter() {
               @Override
               public void keyPressed(KeyEvent e) {
                    int kbcode=e.getKeyCode();
                    if(kbcode==KeyEvent.VK_UP){
                         System.out.println("up");
                    }
               }
          });
          addWindowListener(new WindowAdapter() {
               @Override
               public void windowClosing(WindowEvent e) {
                    System.exit(0);
               }
          });
     }
}