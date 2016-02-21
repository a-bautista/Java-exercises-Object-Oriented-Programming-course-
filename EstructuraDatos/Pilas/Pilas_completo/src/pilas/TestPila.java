/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TestPila extends JFrame {
        Pila p;
    JLabel lb1, lb2, lb3;
    JTextField txt1, txt2, txt3;
    JButton btn1, btn2, btn3,btn4;
    Container pantalla;

    GridLayout grid=new GridLayout(5,2);


    TestPila(){
        setTitle("Programa de Pilas");
        pantalla=getContentPane();
        pantalla.setLayout(grid);
        lb1=new JLabel("Tamaño");
        lb2=new JLabel("Mete el Dato");
        lb3=new JLabel("El valor es: ");
        txt1= new JTextField(10);
        txt2= new JTextField(10);
        txt3= new JTextField(10);
        btn1= new JButton("Inicializar");
        btn2= new JButton("Mete");
        btn3= new JButton("Saca");
        btn4= new JButton("Salir");


        //btn2.enableInputMethods(false);
        btn3.setEnabled(false);//se inicializan los botones a apagado
        btn2.setEnabled(false);



        btn1.addActionListener(new Eventos());
        btn2.addActionListener( new Eventos());
        btn3.addActionListener( new Eventos());
        btn4.addActionListener( new Eventos());



        pantalla.add(lb1);  pantalla.add(txt1);
        pantalla.add(lb2);  pantalla.add(txt2);
        pantalla.add(lb3);  pantalla.add(txt3);
        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);

        setSize(400,400);
        setVisible(true);

    }

    public class Eventos implements ActionListener{ //al momento de darle a inicializar se crea el arreglo que es el boton


        public void actionPerformed(ActionEvent e){
            if(e.getSource()==btn1){
                p=new Pila(Integer.parseInt(txt1.getText())); //va al tamaño de la pila
                btn1.setEnabled(false);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
            }
            if (e.getSource()==btn2){
                p.Meter(Integer.parseInt(txt2.getText()));
                txt2.setText(""); //
                txt2.requestFocus();
            }
            if(e.getSource()==btn3){
                //txt3.setText(""+p.Saca());
                /*otra tecnica */
                txt3.setText(Integer.toString(p.Saca()));// convierte datos a string

            }
            if(e.getSource()==btn4){
                System.exit(0); //se cierra la aplicación
            }
        }

     }

}
