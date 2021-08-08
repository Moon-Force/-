package ´°¿Ú¼àÌý;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class windowaction {
    public static void main(String[] args) {
  new WindowFrame();
    }
}
class  WindowFrame extends Frame {
    public WindowFrame() {
        setBackground(Color.green);
        setBounds(100, 100, 200, 200);
        setVisible(true);
        addWindowListener(new MyWindowListener());
//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//
//            }
//        })
//    }

    }

    class MyWindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
