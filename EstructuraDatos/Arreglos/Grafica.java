/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Grafica extends JFrame{

    JLabel lb1;
    JTextField txt1;
    JButton btn1, btn2;
    JTextArea txtA1;
    Container pantalla;
    int arreglo[]=new int [10];
    int cont=0;

    GridLayout grid=new GridLayout(3,2);

    Grafica(){ //esto le da vida a la pantalla
        setTitle("Manejo de Vectores");

        pantalla=getContentPane();

        pantalla.setLayout(grid);

        lb1 = new JLabel("Dato");
        txt1 = new JTextField(10);

        txtA1 = new JTextArea();
        btn1 = new JButton("Ingresa Dato");
        btn2= new JButton("Grafica");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        pantalla.add(lb1); pantalla.add(txt1); //esto ya le agrega la vida a los botones
        pantalla.add(btn1); pantalla.add(btn2);

        pantalla.add(txtA1);
        setSize(400,400);
        setVisible(true);

    }

    public class Eventos implements ActionListener{ //le da vida a los botones, qué se hará

        public void actionPerformed(ActionEvent e){


            if(e.getSource()==btn1){//mete datos
                MeteDatos();
              }
            else if(e.getSource()==btn2){
                Imprimir();
            }
          }

    }


public void MeteDatos(){//método

    try{

    arreglo[cont]=Integer.parseInt(txt1.getText());
    //se convierte el texto a binario y se introduce el numero al arreglo
    cont++;
    txt1.setText(""); //se limpia lo que se escribió
    txt1.requestFocus();

    }catch(Exception error){
        //el error que marcara ya no se mostrará en la consola sino en la pantalla
        JOptionPane.showMessageDialog(null,"Ocurrio un error"+error.toString());


    }
}

public void Imprimir(){

    String r="Forma\n\n";
    int d;

    for (int i=0; i<cont; i++){   //for (int j=0; j<=cont; j++){
       d=arreglo[i];
       r=r+d+"\t"; //se concatenaron caracteres
       for (int j=1; j<=d; j++){
           r=r+"*";
       }
        r=r+"\n";

        }
    txtA1.setText(r); //con esto imprime en el textarea
    }


}





