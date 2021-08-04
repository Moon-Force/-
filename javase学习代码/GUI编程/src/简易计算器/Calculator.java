package ¼òÒ×¼ÆËãÆ÷;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Calculator extends Frame {
    TextField num1;
    TextField num2;
    TextField num3;
    public void Frame(){
      num1=new TextField(10);
      num2=new TextField(10);
      num3=new TextField(10);
     Label label1=new Label("+");
     Button button=new Button("=");
     button.addActionListener(new MyCalulatorListener(this));
        setLayout(new FlowLayout());
        add(num1);
        add(label1);
        add(num2);
        add(button);
        add(num3);
        pack();
        setVisible(true);
    }
}
