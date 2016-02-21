
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class EjemploEstrellas extends JFrame{

    private JPanel panel;
    private JButton btn1;
    private Container pantalla;
    private Random aleatorio;

    public EjemploEstrellas(){

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setBackground(Color.white);

        btn1 = new JButton("Empezar");
        btn1.addActionListener(new Eventos());

        aleatorio = new Random();

        pantalla.add(panel);
        pantalla.add(btn1);

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){

            Graphics papel = panel.getGraphics();

            papel.setColor(Color.BLACK); //este Black es obligatorio porque así se pone  negro el panel
            papel.fillRect(0, 0, 200, 200);
            papel.setColor(Color.YELLOW);

            int x,y;

            if(eventos.getSource()==btn1){

                for(int i = 0; i<=30; i++){

                    x=aleatorio.nextInt(200);
                    y=aleatorio.nextInt(200);

                    papel.fillOval(x, y, 10, 10);

                }

            }
        }
    }


}
