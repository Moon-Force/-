package Frame;
import java.awt.*;
public class myFrame {
    public static void main(String[] args) {
  MyFrame1 myFrame=new MyFrame1(100,100,100,100,Color.red);
    }
}
class MyFrame1 extends Frame {
    static int id=0;
  MyFrame1(int x,int y,int w,int h,Color color){
      super("我的"+(++id)+"界面");
      setVisible(true);
      setBounds(x,y,w,h);
      setBackground(color);
      setResizable(false);
  }
}
