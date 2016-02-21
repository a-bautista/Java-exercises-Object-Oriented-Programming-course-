
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Cuadro extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;


public void createGUI(){
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container ventana = getContentPane();
    ventana.setLayout(new FlowLayout () );

    panel = new JPanel();
    panel.setPreferredSize(new Dimension (300,200));
    panel.setBackground(Color.yellow);
    ventana.add(panel);

    button = new JButton("Haz Click");
    ventana.add(button);
    button.addActionListener(this);

   }


public void actionPerformed (ActionEvent event){ //método

    Graphics papel = panel.getGraphics(); //en panel pone el gráfico
    papel.drawLine(0,0,100,100);

   }

}
