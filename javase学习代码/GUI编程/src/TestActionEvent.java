import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame();
       Button button= new Button("点击我");
       MYaction mYaction=new MYaction();
     button.addActionListener(mYaction);
       frame.add(button,BorderLayout.CENTER);
       frame.pack();
       frame.setVisible(true);
       frame.setSize(400,400);
       Windowclose(frame);
    }
//     关闭事件
    private static void Windowclose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
//事件监听
class MYaction implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("gg");
    }
}
