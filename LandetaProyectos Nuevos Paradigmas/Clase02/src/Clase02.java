
/*Ejercicio de Landeta
 * hecho con la sintaxis del libro
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Clase02 extends JFrame {


    private JButton btn1, btn2;
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txt1, txt2, txt3, txt4;


    public void createGUI(){ //método

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout () );
        ventana.setBackground(Color.red);



        lb1 = new JLabel ("Label 1");
        lb2 = new JLabel ("Label 2");
        lb3 = new JLabel ("Label 3");
        lb4 = new JLabel ("Label 4");

        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);
        txt4 = new JTextField(10);

        btn1 = new JButton("Haz click");
        btn2 = new JButton ("Salir");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        ventana.add(lb1);    ventana.add(txt1);
        ventana.add(lb2);   ventana.add(txt2);

        ventana.add(lb3);    ventana.add(lb4);
        ventana.add(txt3);   ventana.add(txt4);

        ventana.add(btn1);   ventana.add(btn2);
   
    }

    
    public class Eventos implements ActionListener {  //clase abstracta


        public void actionPerformed(ActionEvent e){  //método


        if (e.getSource()==btn1){
            JOptionPane.showMessageDialog(null, "hola");
            }

          if (e.getSource()==btn2){
            System.exit(0);
            }


        }


    }

}
