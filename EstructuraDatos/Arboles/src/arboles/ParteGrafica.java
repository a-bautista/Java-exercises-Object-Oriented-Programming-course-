/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arboles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ParteGrafica extends JFrame{

    Arbol poner=new Arbol();

    JLabel lb1,lb2;
    JTextField txt1;
    JTextArea txtA1;
    JButton btn1,btn2,btn3,btn4;
    Container pantalla;

    GridLayout rec= new GridLayout(4,2);

    ParteGrafica(){
        setTitle("Arboles");
        pantalla=getContentPane();
        pantalla.setLayout(rec);

        lb1=new JLabel("Dato");
        lb2=new JLabel("Arbol");

        btn1=new JButton("Insertar");
        btn2=new JButton("Profundida");
        btn3=new JButton("Anchura");
        btn4=new JButton("Salir");

        txt1= new JTextField(10);
        txtA1= new JTextArea();

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());

        pantalla.add(lb1); pantalla.add(txt1);
        pantalla.add(lb2); pantalla.add(txtA1);
        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);

        setSize(400,600);
        setVisible(true);
    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent x){
          if(x.getSource()==btn1){

            poner.Insertar(Integer.parseInt(txt1.getText()));

            txt1.setText("");
            txt1.requestFocus();
          }
          if(x.getSource()==btn2){
              
              //txtA1.setText(poner.LecturaProfundidad(poner.raiz));
                txtA1.setText(poner.Lectura());

          }
          if(x.getSource()==btn3){

          }
          if(x.getSource()==btn4){
            System.exit(0);
          }
        }
    }
}
