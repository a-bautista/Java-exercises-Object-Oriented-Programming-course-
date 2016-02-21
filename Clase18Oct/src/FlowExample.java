

import java.awt.*;
import javax.swing.*;

public class FlowExample {
    private JFrame f;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JLabel lb1;
    private JTextField txt1;

    public FlowExample() {
        f = new JFrame("GUI example");
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");
        txt1=new JTextField(10);
        lb1=new JLabel("Prueba:");
    }

    public void Muestra() {
        f.setLayout(new FlowLayout());
        //f.setLayout(new GridLayout(7,1));
        f.add(b1);
        f.add(txt1);
        f.add(b2);
        f.add(lb1);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.pack();
        f.setSize(400,200);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        FlowExample guiWindow = new FlowExample();
        guiWindow.Muestra();
    }

}
