/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package keyseeker;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class KeySeeker extends JFrame{

    private JLabel lb1;
    private JTextField txt1,txt2;
    private JPanel panel;
    private JButton btn1, btn2;
    private JTextArea txtA;


    public KeySeeker(){

        Container pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.WHITE);

        txtA = new JTextArea();
        lb1 = new JLabel("Número:");
        btn1 = new JButton("Tomo tu número");
        btn2 = new JButton("¿A qué no lo encuentro?");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        txt1 = new JTextField(10);
        txt2 = new JTextField(99);

        pantalla.add(lb1); pantalla.add(txt1);
        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(txt2);


    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){

            int clave, clave1=9 ;
            


            if(eventos.getSource()==btn1){

                clave1 = Integer.parseInt(txt1.getText());
                txt1.setText("");
            }


            if(eventos.getSource()==btn2){

                for(clave=0; clave<clave1; clave++){

                    clave=+1;
                     txt2.setText(", "+clave);
                }
             
            }

        }
    }


}
