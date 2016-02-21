/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class TestCola extends JFrame {

 JLabel lb1, lb2, lb3;
    JTextField txt1, txt2, txt3;
    JButton btn1, btn2, btn3, btn4;

    Container pantalla;

    GridLayout grid=new GridLayout(5,2);
    Cola c;

TestCola(){

    setTitle("Colas");
    pantalla=getContentPane();
    pantalla.setLayout(grid);

    lb1=new JLabel("Tamaño: ");
    lb2=new JLabel("Entrada: ");
    lb3=new JLabel("Salida: ");

    txt1=new JTextField(10);
    txt2=new JTextField(10);
    txt3=new JTextField(10);

    btn1=new JButton("Inicializa");
    btn2=new JButton("Mete");
    btn3=new JButton("Saca");
    btn4=new JButton("Salir");

    btn1.addActionListener(new Eventos());
    btn2.addActionListener(new Eventos());
    btn3.addActionListener(new Eventos());
    btn4.addActionListener(new Eventos());

    pantalla.add(lb1);
    pantalla.add(txt1);
    pantalla.add(lb2);
    pantalla.add(txt2);
    pantalla.add(lb3);
    pantalla.add(txt3);
    pantalla.add(btn1);
    pantalla.add(btn2);
    btn2.setEnabled(false);
    pantalla.add(btn3);
    btn3.setEnabled(false);
    pantalla.add(btn4);

    setSize(400,600);
    setVisible(true);

}

public class Eventos implements ActionListener{
    
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==btn1){
            c=new Cola(Integer.parseInt(txt1.getText()));
            btn2.setEnabled(true);
            btn3.setEnabled(true);
        }
        if(e.getSource()==btn2){
            c.Mete(Integer.parseInt(txt2.getText()));
            txt2.setText("");
            txt2.requestFocus();
        }
        if(e.getSource()==btn3){
            txt3.setText(""+c.Saca());
        }
	if(e.getSource()==btn4){
	  System.exit(0);
         }
     }

  }


}
