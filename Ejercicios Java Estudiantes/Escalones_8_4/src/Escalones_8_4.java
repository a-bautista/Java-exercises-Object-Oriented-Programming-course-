/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;


public class Escalones_8_4 extends JFrame{

    private JPanel panel;
    private JButton btn1;
    private Container pantalla;
    


    public Escalones_8_4(){

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());

        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1 = new JButton("Iniciar");
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(3000,300));
        panel.setBackground(Color.white);

        btn1.addActionListener(new Eventos());

        pantalla.add(panel);
        pantalla.add(btn1);


    }


    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){

            Graphics papel = getGraphics();

            papel.setColor(Color.white);
            papel.fillRect(0, 0, 250, 300);

            String val;
            int  val2;
            
            val=JOptionPane.showInputDialog("¿De cuanto será tu pirámide?");
            val2=Integer.parseInt(val);
          
            int z, w;

            for (int conta1 = 0; conta1<val2; conta1++){

                w=50+(conta1*35);


                papel.setColor(Color.black);

                papel.drawRect(50, w, 20, 20);



                for (int conta2 = 1; conta2<=conta1; conta2++){

                    z=50+(conta2*35);

                    papel.setColor(Color.black);

                    papel.drawRect(z,w, 20, 20);

                }


            }


        }
    }
}
