package Q2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("MyFrame");
        setSize(400, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
