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

    JLabel lb1, lb2, lb3, lb4,lb5;
    JTextField txt1, txt2, txt3, txt4, txt5;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    JTextArea txtA1;

    Container pantalla;

    GridLayout grid=new GridLayout(8,2);
    Cola c;

TestCola(){

    setTitle("Colas");
    pantalla=getContentPane();
    pantalla.setLayout(grid);

    lb1=new JLabel("Tamaño: ");
    lb2=new JLabel("Entrada: ");
    lb3=new JLabel("Salida: ");

    lb4=new JLabel("No. de elementos");
    lb5=new JLabel("Números impresos");

    txt1=new JTextField(10);
    txt2=new JTextField(10);
    txt3=new JTextField(10);

    txt4= new JTextField(10);
    txt5= new JTextField(10);
    txtA1= new JTextArea();

    btn1=new JButton("Inicializa");
    btn2=new JButton("Mete");
    btn3=new JButton("Saca");
    btn4=new JButton("Salir");

    btn6=new JButton("Imprimir");
    btn7=new JButton("Sacar todos");

    btn1.addActionListener(new Eventos());
    btn2.addActionListener(new Eventos());
    btn3.addActionListener(new Eventos());
    btn4.addActionListener(new Eventos());

    btn6.addActionListener(new Eventos());
    btn7.addActionListener(new Eventos());

    pantalla.add(lb1);
    pantalla.add(txt1);
    pantalla.add(lb2);
    pantalla.add(txt2);
    pantalla.add(lb3);
    pantalla.add(txt3);
    pantalla.add(lb4);
    pantalla.add(txt4);
    pantalla.add(lb5);
    pantalla.add(txtA1);
    pantalla.add(btn1);
    pantalla.add(btn2);
    btn2.setEnabled(false);
    pantalla.add(btn3);
    btn3.setEnabled(false);
    
    pantalla.add(btn6);
    btn6.setEnabled(false);
    pantalla.add(btn7);
    btn7.setEnabled(false);
    pantalla.add(btn4);

    setSize(400,600);
    setVisible(true);

}

public class Eventos implements ActionListener{
    
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==btn1){
            c=new Cola(Integer.parseInt(txt1.getText()));
            btn1.setEnabled(false);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
        }
        if(e.getSource()==btn2){
            c.Mete(Integer.parseInt(txt2.getText()));
            txt4.setText(Integer.toString(c.num));
            txt2.setText("");
            txt2.requestFocus();
        }
        if(e.getSource()==btn3){
            txt3.setText(Integer.toString(c.Saca()));
            //txt3.setText("");
            txt4.setText(Integer.toString(c.num));
        }
	if(e.getSource()==btn4){
	  System.exit(0);
         }

       /* if (e.getSource()==btn5){
            txt4.setText(Integer.toString(c.num));
        }*/

        if(e.getSource()==btn6){
            txtA1.setText(c.Imprimir());
        }
       if(e.getSource()==btn7){
           txt3.setText(Integer.toString(c.SacarTodos()));
           txt3.setText("");
           txt4.setText("");
           txtA1.setText("Cero valores");
       }

     }

  }


}
