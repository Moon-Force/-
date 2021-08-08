package 鼠标监听事件;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class 画笔鼠标监听 {
    public static void main(String[] args) {
   new MyFrame("1");
    }
}
class MyFrame extends Frame{
    ArrayList PointarrayList;
    public MyFrame(String title){
        super(title);
//        创建数组
        PointarrayList = new ArrayList<>();
        setVisible(true);
        setBounds(0,0,1000,1000);
        this.addMouseListener(new Mouaction());
        windowClosing.closing(this);
    }
    private class Mouaction extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame MyFrame=(MyFrame)e.getSource();
           PointarrayList.add(new Point(e.getX(),e.getY()));
           MyFrame.repaint();
        }
    }


    @Override
    public void paint(Graphics g) {
        Iterator Iterator=PointarrayList.iterator();
        while(Iterator.hasNext()){
            Point point= (Point) Iterator.next();
            g.setColor(Color.GREEN);
            g.fillOval(point.x,point.y,10,10);
        }
    }
    private class windowClosing{
        private static void closing(Frame frame){
            frame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }
}
