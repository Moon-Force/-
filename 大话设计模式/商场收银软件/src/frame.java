import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myframe extends Frame {
    TextField TextField1;
    TextField TextField2;
    TextField TextField3;
    public Myframe(){
        TextField1=new TextField(10);
        TextField2=new TextField(10);
       TextField3=new TextField(10);
       Label Label1=new Label("单价");
       Label Label2=new Label("数量");
       Label Label3=new Label("总计");
       Button button=new Button("=");
       button.addActionListener();
       setLayout(new FlowLayout());
       add(Label1);   add(TextField1);
       add(Label2);   add(TextField2);
       add(button);
       add(Label3);   add(TextField3);
       setVisible(true);
       pack();
    }
}
class  buttonActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
