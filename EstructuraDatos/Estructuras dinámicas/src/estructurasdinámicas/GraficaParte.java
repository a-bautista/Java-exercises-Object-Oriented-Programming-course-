/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package estructurasdinámicas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GraficaParte extends JFrame{

    Lista instanciar= new Lista();
    JLabel lb1,lb2;
    JTextField txt1;
    JTextArea txtA1;
    JButton btn1, btn2, btn3, btn4,btn5,btn6,btn7, btn8;

    Container pantalla;
    GridLayout grid=new GridLayout(6,2);

    GraficaParte(){
        setTitle("Listas Programa");
        pantalla=getContentPane();
        pantalla.setLayout(grid);

        lb1=new JLabel("Numero");
        lb2=new JLabel("Salida");

        txt1=new JTextField();
        txtA1= new JTextArea();

        btn1= new JButton("InsertaPrimero");
        btn2= new JButton("InsertaUltimo");
        btn3= new JButton("BorraPrimero");
        btn4= new JButton("BorraUltimo");
        btn5= new JButton("Despliega la lista");
        btn6= new JButton("Ordenar");
        btn7= new JButton("Limpiar lista");
        btn8= new JButton("Salir");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());
        btn5.addActionListener(new Eventos());
        btn6.addActionListener(new Eventos());
        btn7.addActionListener(new Eventos());
        btn8.addActionListener(new Eventos());

        pantalla.add(lb1); pantalla.add(txt1);
        pantalla.add(lb2); pantalla.add(txtA1);
        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);
        pantalla.add(btn5); pantalla.add(btn6);
        pantalla.add(btn7); pantalla.add(btn8);

        setSize(600,600);
        setVisible(true);
    }

 public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent e){
            if (e.getSource()==btn1){
                try{

                //instanciar.InsertaNodoPrimero(Integer.parseInt(txt1.getText()));
                instanciar.InsertaNodoPrimero(Integer.parseInt(txt1.getText()));
                txt1.setText("");
                txt1.requestFocus();
            }catch(Exception b){
                JOptionPane.showMessageDialog(null,"No se ingresó un número");
            }
        }
            if(e.getSource()==btn2){
                try{

               // instanciar.InsertaNodoUltimo(Integer.parseInt(txt1.getText()));
                instanciar.InsertaNodoUltimo(Integer.parseInt(txt1.getText())); //llamadas a los métodos
                txt1.setText("");
                txt1.requestFocus();
            }catch(Exception a){
                JOptionPane.showMessageDialog(null,"No se ingresó un número");
            }
        }
            if(e.getSource()==btn3){
                instanciar.BorrarPrimerNodo();
            }
            if(e.getSource()==btn4){
                instanciar.BorrarUltimoNodo();
            }
            if(e.getSource()==btn5){
                txtA1.setText(instanciar.Imprimir());//sintaxis para mostrar elementos

            }
            if(e.getSource()==btn6){

            }
            if(e.getSource()==btn7){//limpia la lista
                instanciar.Limpiar();
            }
            if(e.getSource()==btn8){
                System.exit(0);
            }
        }
    }

}
