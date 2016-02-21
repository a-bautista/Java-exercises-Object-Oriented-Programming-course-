
package fichadepago;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


public class Grid_layout extends JFrame {

    private JLabel lb1, lb2, lb3, lb4,lb5,lb6;
    private JTextField txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9;
    private JButton btn1, btn2, btn3;
    Container ventana;

    GridLayout grid = new GridLayout(8,3);

        public Grid_layout(){

            ventana = getContentPane();
            ventana.setLayout(grid);
            this.setTitle("Ejemplo del GridLayout"); //el this se pudo haber omitido

            lb1 = new JLabel ("Número de Estudiante");
            lb2 = new JLabel ("Nombre");
            lb3 = new JLabel ("Carrera");
            lb4 = new JLabel ("Cuenta");
            lb5 = new JLabel ("Fecha");
            lb6 = new JLabel ("Importe");

            txt1 = new JTextField(10);
            txt2 = new JTextField(10);
            txt3 = new JTextField(10);
            txt4 = new JTextField(10);
            txt5 = new JTextField(10);
            txt6 = new JTextField(10);
            txt7 = new JTextField(10);
            txt8 = new JTextField(10);
            txt9 = new JTextField(10);

            txt1.addActionListener(new Eventos());
            txt2.addActionListener(new Eventos());
            txt3.addActionListener(new Eventos());
            txt4.addActionListener(new Eventos());
            txt5.addActionListener(new Eventos());
            txt6.addActionListener(new Eventos());
            txt7.addActionListener(new Eventos());
            txt8.addActionListener(new Eventos());
            txt9.addActionListener(new Eventos());


            btn1 = new JButton("Calcula");
            btn2 = new JButton ("Impime");
            btn3 = new JButton ("Guardar");

            btn1.addActionListener(new Eventos());
            btn2.addActionListener(new Eventos());
            btn3.addActionListener(new Eventos());


            ventana.add(lb1);
            ventana.add(lb2);
            ventana.add(lb3);

            ventana.add(txt1);
            ventana.add(txt2);
            ventana.add(txt3);

            ventana.add(lb4);
            ventana.add(lb5);
            ventana.add(lb6);


            ventana.add(txt4);
            ventana.add(txt5);
            ventana.add(txt6);
            ventana.add(txt7);
            ventana.add(txt8);
            ventana.add(txt9);

            ventana.add(btn1);
            ventana.add(btn2);
            ventana.add(btn3);

            setVisible(true);

    }


     public class Eventos implements ActionListener{

         public void actionPerformed(ActionEvent evento){  /*la variable evento lleva
                                                             la acción de click
                                                            *
                                                            */
         if(evento.getSource()==txt1){
             txt2.requestFocus();
         }

         if(evento.getSource()==txt2){

             txt3.requestFocus();
             }
         if(evento.getSource()==txt3){

             txt4.requestFocus();
         }

         if(evento.getSource()==txt4){
             txt5.requestFocus();
         }

         if(evento.getSource()==txt5){
             txt6.requestFocus();
         }
         if(evento.getSource()==txt6){
             txt7.requestFocus();
         }
         if(evento.getSource()==txt7){
             txt8.requestFocus();
         }
         if(evento.getSource()==txt8){
             txt9.requestFocus();
         }
         if(evento.getSource()==btn1){

             Calcula obje = new Calcula();
             txt9.setText(obje.Prueba());
         }                                  /*el método prueba del ojeto obje va
                                             * a devolver un resultado y lo va a poner
                                             * en la caja de texto 9
                                             */
       }




    }


}
