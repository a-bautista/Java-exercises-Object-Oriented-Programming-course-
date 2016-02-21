

package fichadepago;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class GRidbaglayout extends JFrame {


    JLabel lb1, lb2, lb3;
    JButton btn1;
    JTextField txt1, txt2, txt3;
    Container pantalla;

    GridBagLayout grid = new GridBagLayout();
    GridBagConstraints grid2 = new GridBagConstraints();  //condiciones de cómo va a caer

    public GRidbaglayout(){

        pantalla = getContentPane();
        pantalla.setLayout(grid);

        lb1 = new JLabel ("Alumno: ");
        lb2 = new JLabel ("Expediente: ");
        lb3 = new JLabel ("Vigencia: ");

        txt1 = new JTextField(30);
        txt2 = new JTextField(30);
        txt3 = new JTextField(30);

        btn1 = new JButton ("Imagen");



        grid2.weightx=1;
        grid2.weighty=1;
        grid2.fill=GridBagConstraints.BOTH;

        plantilla(btn1,1, 1, 1, 4); // x, y, anchura, altura
                                    //todo está en proporción de 1
        plantilla(txt1,2,2,2,1);

        plantilla(lb1,2,1,1,1);

        plantilla(lb2,2,3,1,1);

        plantilla(lb3,3,3,1,1);

        plantilla(txt2,2,4,1,1);

        plantilla(txt3,3,4,1,1);

        setVisible(true)

;

    }


    public void plantilla(Component obj, int coord_x,
                                         int coord_y,
                                         int anchura,
                                         int altura){

       grid2.gridx = coord_x;
       grid2.gridy = coord_y;

       grid2.gridheight = altura;
       grid2.gridwidth  = anchura;

       grid.setConstraints(obj, grid2);
       pantalla.add(obj);



    }






}
