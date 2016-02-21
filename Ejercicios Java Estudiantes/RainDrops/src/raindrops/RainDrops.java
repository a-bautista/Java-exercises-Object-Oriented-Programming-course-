/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package raindrops;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;


public class RainDrops extends JFrame {


    private JPanel panel;

    private JLabel lb1;

    private JTextField txt1;

    private JSlider slider;

    private Random aleatorio;

    private javax.swing.Timer temporizador;  /*Se declaró de esta manera ya que
                                              * el programa está haciendo uso de
                                              * de 2 bibliotecas que son javax.swing
                                              * y java.util. Si no estuviera la biblioteca
                                              * java.util entonces se pondría
                                              * private Timer temporizador.
                                              */


    public void createGUI(){

     Container ventana = new Container();

     ventana = getContentPane();

     ventana.setLayout(new FlowLayout());

     setDefaultCloseOperation(EXIT_ON_CLOSE);

     aleatorio = new Random ();  //inicialización de este objeto

     panel = new JPanel();
     panel.setPreferredSize(new Dimension(200,200));

     panel.setBackground(Color.WHITE);

     ventana.add(panel);


     txt1 = new JTextField(10);
     ventana.add(txt1);
     lb1 = new JLabel("Intervalo de tiempo");


     //Parte Importante

     ventana.add(lb1);
     slider = new JSlider(JSlider.HORIZONTAL,10,2000,1000);
     ventana.add(slider);

     slider.addChangeListener(new Eventos());


     txt1.setText(Integer.toString(slider.getValue()));

     temporizador = new javax.swing.Timer(1000, (new Eventos()));
     
     temporizador.start();
     

  
 }


public class Eventos implements ActionListener, ChangeListener {

    public void actionPerformed(ActionEvent x){


        int z, y, tamano;

        Graphics papel = panel.getGraphics();  /* Papel es el objeto en el cual
                                                * se le instanciarán los métodos del
                                                * objeto panel.
                                                */
        z = aleatorio.nextInt(200);
        y = aleatorio.nextInt(200);
        tamano = aleatorio.nextInt(20);

        papel.fillOval(z, y, tamano, tamano);


    }


    public void stateChanged(ChangeEvent e){

        int timeGap = slider.getValue();

        txt1.setText(Integer.toString(timeGap));

        temporizador.setDelay(timeGap);


      }
   }

}
