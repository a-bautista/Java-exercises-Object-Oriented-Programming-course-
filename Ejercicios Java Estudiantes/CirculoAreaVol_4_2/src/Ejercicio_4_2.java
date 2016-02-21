

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Ejercicio_4_2 extends JFrame{


    private JButton btn1;

    public void createGUI(){

        Container ventana = getContentPane(); /*El getContentPane es un método
                                           * mientras que el container
                                           * es un tipo de variable
                                           * gráfico.
                                           */
        ventana.setLayout(new FlowLayout ());
        
        ventana.setBackground(Color.white);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        btn1 = new JButton(" Haga click para conocer los resultados");
        btn1.setSize(30, 35);
        btn1.setBackground(Color.red);
        

        btn1.addActionListener(new Eventos());
        ventana.add(btn1);


    }
 
    
    public class Eventos implements ActionListener {
        
        
        public void actionPerformed( ActionEvent e){

            final double radio = 7.5;

            double areA = 0;

            double volumeN = 0;

            double circuF = 0;

            areA = Math.PI * Math.pow(radio, 2);

            circuF = Math.PI * 2 * radio;

            volumeN = (4* Math.PI /3) * Math.pow(radio, 3);

            if (e.getSource()==btn1){

               JOptionPane.showMessageDialog(null, "El resultado del área \n de un círculo es: \n "+areA);

               JOptionPane.showMessageDialog(null, "El resultado del volumen \n de un círculo es: \n "+volumeN);

               JOptionPane.showMessageDialog(null, "El resultado de la circunferencia \n de un círculo es: \n "+circuF);


            }
        } 
    }

}
