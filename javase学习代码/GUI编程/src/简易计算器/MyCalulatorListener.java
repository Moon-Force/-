package ¼òÒ×¼ÆËãÆ÷;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalulatorListener implements ActionListener {
Calculator clculator=null;

    public MyCalulatorListener(Calculator calculator) {
        this.clculator=calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   int n1=Integer.parseInt(clculator.num1.getText());
   int n2=Integer.parseInt(clculator.num2.getText());
        clculator.num3.setText(""+(n2+n1));
        clculator.num1.setText("");
        clculator.num2.setText("");
    }
}
