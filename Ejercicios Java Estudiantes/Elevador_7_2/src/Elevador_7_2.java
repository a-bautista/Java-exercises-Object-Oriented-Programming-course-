/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Elevador_7_2 extends JFrame {

    private JButton btn1, btn2;
    private JPanel panel;
    private Container pantalla;
    private int x=1,y=0 ,w=0,z=0;



    public Elevador_7_2(){

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());

        setSize(170,370);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,330));
        panel.setBackground(Color.white);

        btn1 = new JButton("Subir");
        btn2 = new JButton("Bajar");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        pantalla.add(panel);
        pantalla.add(btn1);
        pantalla.add(btn2);


    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){

            Graphics papel = getGraphics();

 

            if(eventos.getSource()==btn1){


                    w=300-20*(x-y);
                    z=250-20*(x-y);

                    papel.setColor(Color.white);
                    papel.fillRect(50, 30, 70, 315);


                    papel.setColor(Color.black);
                    papel.fillRect(50, 30, 70, w); //300-x =40 se le debe sumar 60

                    papel.setColor(Color.white);
                    papel.fillRect(50, 30, 70, z);
       
                x+=1;
                
                 //no pongas x=y; no es recomendable igualar 2 variables en este tipo de acción
                }
            


            if(eventos.getSource()==btn2){

             

                    y+=1;
                    papel.setColor(Color.black);
                    papel.fillRect(50, 30, 70, w+20);

/*El negro está antes porque se dibuja primero y luego se dibuja el blanco.
 * El blanco solapa a la parte negra del rectángulo.
 */

                    papel.setColor(Color.white);
                    papel.fillRect(50, 30, 70, z+20);

              


                

            }

        }

    }
}

