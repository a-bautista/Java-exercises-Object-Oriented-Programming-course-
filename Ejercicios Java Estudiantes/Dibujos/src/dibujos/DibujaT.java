
package dibujos;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class DibujaT extends JFrame {

    private JButton btn1, btn2, btn3;
    private JPanel panel;
    Container ventana;
    //GridLayout caja = new GridLayout(2, 1);

    public void createGUI() {

        ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(500, 500));
        panel.setBackground(Color.WHITE);

        btn1 = new JButton("Crea triángulos");

        btn2 = new JButton("Crea casas");

        btn3 = new JButton("Borrar");


        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());

        ventana.add(panel);
        ventana.add(btn1);
        ventana.add(btn2);
        ventana.add(btn3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }

    public class Eventos implements ActionListener {

        public void actionPerformed(ActionEvent x) {

            int posX;
            int posY;
            int ancho;
            int altura;

            if (x.getSource() == btn1) {

                Trabajo objet = new Trabajo();  //este objeto sólo trabaja en este botón porque aquí fue instanciado.

                Graphics papel = panel.getGraphics();

                ancho = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ancho el triangulo?"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("¿De cuánto es la altura del triángulo?"));


                objet.dibujaTriangulo(papel, 10, 30, ancho, altura); /*10 y 30 son las coordenadas
                 * del panel.
                 */


                JOptionPane.showMessageDialog(null, "El área del triángulo es: " + objet.calculaareas(ancho, altura));

            }

            if (x.getSource() == btn2) {

                Trabajo objet2 = new Trabajo();

                //posX = Integer.parseInt(JOptionPane.showInputDialog("¿En dónde quieres la posición de inicio en x?"));

                //posY = Integer.parseInt(JOptionPane.showInputDialog("¿En dónde quieres la posición de inicio en y?"));

                ancho = Integer.parseInt(JOptionPane.showInputDialog("¿Cuál es el ancho de la techo?"));

                altura = Integer.parseInt(JOptionPane.showInputDialog("¿De cuánto es la altura del techo?"));

                Graphics papel2 = panel.getGraphics();

                objet2.dibujaCasa(papel2, 80, 80, ancho, altura);


            }

            if (x.getSource() == btn3) {

                repaint();

            }





        }
    }
}
