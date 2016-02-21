
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio_4_4 extends JFrame{



    private JLabel lb1, lb2, lb3, lb4, lb5;

    private JTextField txt1, txt2, txt3, txt4, txt5;

    private JButton btn1;



    public void CreateGUI(){

      Container cuadro = getContentPane();

      cuadro.setLayout(new FlowLayout ());

      cuadro.setBackground(Color.white);

      setDefaultCloseOperation(EXIT_ON_CLOSE);


      lb1 = new JLabel("Calificacion 1");
      lb2 = new JLabel("Calificacion 2");
      lb3 = new JLabel("Calificacion 3");
      lb4 = new JLabel("Respuesta");

      btn1 = new JButton("Respuesta");

      txt1 = new JTextField (10);
      txt2 = new JTextField (10);
      txt3 = new JTextField (10);
      txt4 = new JTextField (10);

      cuadro.add(lb1);
      cuadro.add(txt1);
      
      cuadro.add(lb2);
      cuadro.add(txt2);
      
      cuadro.add(lb3);
      cuadro.add(txt3);



      cuadro.add(lb4);
      cuadro.add(txt4);

      cuadro.add(btn1);

      btn1.addActionListener(new Eventos());


    }


public class Eventos implements ActionListener{



    public void actionPerformed (ActionEvent e){


        double variaB, variaB_2, variaB_3;


        if(e.getSource()==btn1){

           /* objeT = txt1.getText();
            variaB = Double.parseDouble(objeT);
            *
            * En lugar de dos líneas y una variable más te las ahorras
            * con la línea de abajo.
            */

            variaB = Double.parseDouble(txt1.getText());

            variaB_2 = Double.parseDouble(txt2.getText());

            variaB_3 = Double.parseDouble(txt3.getText());

            txt4.setText(""+((variaB+variaB_2+variaB_3)/3));

            /*Ya no se necesita otra variable para guardar el resltado.
             *
             */
        }

      }

   }

}
