//Clase 01 con Landeta

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Ficha extends JFrame {


    private int numest;
    public String carrera;
    public String nom;

    private JButton btn1, btn2;
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txt1, txt2, txt3, txt4;
    private Container ventana;
    private FlowLayout flow = new FlowLayout();



    public Ficha(){      //constructor = método ya dará los parámetros por default

        numest=0;       //no necesita tipo alguno ya que se modifica por default a la clase
        carrera="";
        nom="";
        ventana = getContentPane();
        ventana.setLayout(flow);

        lb1 = new JLabel("No: ");
        lb2 = new JLabel ("Nombre: ");
        lb3 = new JLabel ("Importe: ");
        lb4 = new JLabel ("Ficha de Pago: ");

        txt1 = new JTextField(10);  btn1=new JButton("botón 1");
        txt2 = new JTextField(10);  btn2= new JButton ("botón 2");
        txt3 = new JTextField (10);
        txt4 = new JTextField (10);

        ventana.add(lb1);  ventana.add(txt1);
        ventana.add(lb2);  ventana.add(txt2);
        ventana.add(lb3);  ventana.add(txt3);
        ventana.add(lb4);  ventana.add(txt4);

        ventana.add(btn1);
        ventana.add(btn2);

        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE); /*aquí no necesita (JFrame.EXIT_ON_CLOSE)
                                                  * PORQUE YA SE HEREDÓ todo porque en la clase
                                                  * está JFrame
                                                  */
        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

         }
   
    
    public class Eventos implements ActionListener { /*clase abstracta = una clase que está escrita
                                                      *  y desempeña una función pero que NO es llamada
                                                      * directamente del main
                                                      */
       
        public void actionPerformed (ActionEvent e){
            
            if (e.getSource() == btn2){
                System.exit(0);
            }
            
        }
        
    }

 
}
