package histo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
 
public class Grafica extends JFrame {
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
        lb1.setForeground(Color.BLACK);
        lb1.setFont(new Font("Arial",Font.BOLD,14)); 
        txt1 = new JTextField(10);
        txt1.setBackground(Color.BLUE);
        txt1.setFont(new Font("Arial",Font.BOLD,14));
        txt1.setForeground(Color.WHITE);
        txtA1 = new JTextArea();
        txtA1.setBackground(Color.YELLOW);
        txtA1.setForeground(Color.BLUE);
        txtA1.setFont(new Font("Arial",Font.BOLD,14));

        btn1 = new JButton("Ingresa Dato");
        btn1.setFont(new Font("Arial",Font.BOLD,14));
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.red);
        btn2= new JButton("Grafica");
        btn2.setBackground(Color.GREEN);
        btn2.setForeground(Color.BLACK);
        btn2.setFont(new Font("Arial",Font.BOLD,14));

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        pantalla.add(lb1); pantalla.add(txt1); //esto ya le agrega la vida a los botones
        pantalla.add(btn1); pantalla.add(btn2);

        pantalla.add(txtA1);
        setSize(400,400);
        setVisible(true);

    }
public class Eventos implements ActionListener{ //le da vida a los botones, quÃ© se harÃ¡

        public void actionPerformed(ActionEvent e){


            if(e.getSource()==btn1){//mete datos
                MeteDatos();
              }
            else if(e.getSource()==btn2){
                Imprimir();
            }
          }

    }


public void MeteDatos(){//mÃ©todo

    try{

    arreglo[cont]=Integer.parseInt(txt1.getText());
    //se convierte el texto a binario y se introduce el numero al arreglo
    cont++;
    txt1.setText(""); //se limpia lo que se escribiÃ³
    txt1.requestFocus();

    }catch(Exception error){
        //el error que marcara ya no se mostrarÃ¡ en la consola sino en la pantalla
        JOptionPane.showMessageDialog(null,"Ocurrio un error"+error.toString());


    }
}

public void Imprimir(){

    String r="Forma\n\n";
    int d, max=0;

    for (int k=0; k<cont; k++){
        if(arreglo[k]>max){
            max=arreglo[k];
        }
    } //me busca el numero más grande



    for (int j=0; j<max; j++){
        for (int i=0; i<cont; i++){
            if(arreglo[i]<=max && arreglo[i]+j>=max){  //condición maestra
                r=r+"\t*";

            }else{
                r=r+"\t";
            }
        }
        r=r+"\n";
    }
   for(int w=0; w<cont; w++){
       d=arreglo[w];
       r=r+"\t"+d;
   }
    txtA1.setText(r); //con esto imprime en el textarea
    }
}
