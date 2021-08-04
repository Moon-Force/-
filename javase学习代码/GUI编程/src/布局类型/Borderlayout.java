package 布局类型;

import java.awt.*;

public class Borderlayout {
    public static void main(String[] args) {
        Frame frame=new Frame("布局类型.Borderlayout");
        Button east=new Button("East");
        Button west=new Button("West");
        Button south=new Button("South");
        Button north=new Button("North");
        Button center=new Button("Center");
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(center,BorderLayout.CENTER);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}
