package 布局类型;

import java.awt.*;

public class 边框布局 {
    public static void main(String[] args) {
        Frame frame=new Frame();
        Button east=new Button("east");
        Button west=new Button("west");
        Button south=new Button("south");
        Button north=new Button("north");
        Button center=new Button("center");
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(north,BorderLayout.NORTH);
        frame.add(center,BorderLayout.CENTER);
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}
