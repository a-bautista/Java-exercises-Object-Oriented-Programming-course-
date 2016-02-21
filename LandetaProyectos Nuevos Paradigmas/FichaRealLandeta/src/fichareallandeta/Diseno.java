/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fichareallandeta;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Diseno extends JFrame {


    JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7,
           lb8, lb9, lb10, lb11, lb12, lb13,
           lb14,lb15,lb16,lb17,lb18,lb19,lb20, lb21;
           

    JTextField txt1, txt2, txt3, txt4, txt5, txt6,
               txt7, txt8, txt9, txt10,txt11, txt12,
               txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20;

    JButton btn1, btn2, btn3;

    Container pantalla;

    GridBagLayout grid = new GridBagLayout();

    GridBagConstraints grid2 = new GridBagConstraints();

    Font f = new Font("Arial",Font.BOLD,13);


    public Diseno(){

        pantalla = getContentPane();
        pantalla.setLayout(grid);
  

        lb1 = new JLabel ("Registro del alumno: ");
        lb2 = new JLabel ("Nombre: ");
        lb3 = new JLabel ("Nivel-Grado y Grupo: ");
        lb4 = new JLabel ("Número interno del estudiante: ");
        lb5 = new JLabel ("Mes a pagar: ");

        lb1.setFont(f);
        lb2.setFont(f);
        lb3.setFont(f);
        lb4.setFont(f);
        lb5.setFont(f);

        lb5.setForeground(Color.BLUE);
        lb4.setForeground(Color.BLUE);
        lb3.setForeground(Color.BLUE);
        lb2.setForeground(Color.BLUE);
        lb1.setForeground(Color.BLUE);

        txt1 = new JTextField(30);
        txt2 = new JTextField(30);
        txt3 = new JTextField(30);
        txt4 = new JTextField(30);
        txt5 = new JTextField(30);

        lb6 = new JLabel ("Línea de captura REFERENCIA ");
        lb7 = new JLabel ("Fecha Límite de Pago ");
        lb8 = new JLabel ("A pagar ");

        lb9 = new JLabel ("No.FOLIO");

        lb10 = new JLabel ("Instituto Cultural Panamericano de Toluca, S.C.");
        lb11 = new JLabel ("www.panamericanodetoluca.edu.mx");
        lb12 = new JLabel ("(722)219 80 21 y (722) 219 80 28");
        lb13 = new JLabel ("Mariano Zúñiga 638, Colonia Hípico");
        lb14 = new JLabel ("R.F.C.: ICP-920327K58");
        lb15 = new JLabel ("Metepec, Méx. C.P. 52156");
        lb16 = new JLabel ("BBVA Bancomer");
        lb17 = new JLabel ("No.de CONVENIO");
        lb18 = new JLabel ("También puede realizar su pago vía electrónica con cargo a cualquier tarjeta");
        lb19 = new JLabel ("de crédito o cuenta de cheques Bancomer accesando a la página:");
        lb20 = new JLabel ("www.bescuelas.com.mx");
        lb21 = new JLabel ("ORIGINAL");


        txt6 = new JTextField(30);
        txt7 = new JTextField(30);
        txt8 = new JTextField(30);
        txt9 = new JTextField(30);
        txt10 = new JTextField(30);
        txt11 = new JTextField(30);
        txt12 = new JTextField(30);
        txt13 = new JTextField(30);
        txt14 = new JTextField(30);
        txt15 = new JTextField(30);
        txt16 = new JTextField(30);
        txt17 = new JTextField(30);
        txt18 = new JTextField(30);
        txt19 = new JTextField(30);

        btn1 = new JButton ("Imagen");
        btn2 = new JButton ("Comenzar");
        btn3 = new JButton ("segunda opcion");


        grid2.weightx=1;
        grid2.weighty=1;
        grid2.fill=GridBagConstraints.BOTH;

        ImageIcon ii = new ImageIcon("");

        plantilla (btn1,1,1,2,2);


        plantilla(lb1,3,1,1,1);
        plantilla(txt1,4,1,2,1);

        plantilla(lb9,1,3,1,1);  /*plantilla de folio*/
        plantilla(txt2,2,3,1,1);
        plantilla(txt19,2,14,1,1);

        plantilla(lb10,1,5,2,1); //mega etiqueta
        plantilla(lb11,1,6,2,1); //mega etiqueta
        plantilla(lb12,1,7,2,1); //mega etiqueta
        plantilla(lb13,1,8,2,1); //mega etiqueta
        plantilla(lb14,1,9,2,1); //mega etiqueta
        plantilla(lb15,1,10,2,1); //mega etiqueta

        plantilla(lb16,1,12,2,1);
        plantilla(lb17,1,14,1,1);

        plantilla(lb2,3,2,1,1);
        plantilla(txt3,4,2,2,1);

        plantilla(lb3,3,3,1,1);
        plantilla(txt4,4,3,2,1);

        plantilla(lb4,3,4,1,1);
        plantilla(txt5,4,4,2,1);

        plantilla(lb5,3,5,1,1);
        plantilla(txt6,4,5,2,1);

        plantilla(lb6,3,7,1,1);
        plantilla(txt7,3,8,1,1);
        plantilla(txt10,3,9,1,1);
        plantilla(txt11,3,10,1,1);
        plantilla(txt12,3,11,1,1);


        plantilla(lb7,4,7,1,1);
        plantilla(txt8,4,8,1,1);
        plantilla(txt13,4,9,1,1);
        plantilla(txt14,4,10,1,1);
        plantilla(txt15,4,11,1,1);

        plantilla(lb8,5,7,1,1);
        plantilla(txt9,5,8,1,1);
        plantilla(txt16,5,9,1,1);
        plantilla(txt17,5,10,1,1);
        plantilla(txt18,5,11,1,1);

        plantilla(lb18,3,12,3,1);
        plantilla(lb19,3,13,3,1);
        plantilla(lb20,3,14,3,1);
        plantilla(lb21,5,14,1,1);


        setVisible(true);
        setSize(720,300);

    }



    public void plantilla(Component obj, int x, 
                                         int y,
                                         int anchura, 
                                         int altura){


        grid2.gridx = x;
        grid2.gridy = y;
        grid2.gridwidth = anchura;
        grid2.gridheight = altura;

        grid.setConstraints(obj,grid2) ;
        pantalla.add(obj);


    }


}
