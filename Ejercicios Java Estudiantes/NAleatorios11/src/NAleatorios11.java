
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;

public class NAleatorios11 extends JFrame{


    private JTextArea txtA1;
    private JButton btn1;
    private JTextField txt1, txt2;
    private JLabel lb1, lb2;
    private JSlider slider;
    private Random random;


    public NAleatorios11(){

        Container pantalla = new Container();
        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());


        setDefaultCloseOperation(EXIT_ON_CLOSE);

        random = new Random();

        btn1 = new JButton("Iniciar");
        btn1.addActionListener(new Eventos());

        lb1 = new JLabel("Ceros");
        lb2 = new JLabel("Unos");

        txt1 = new JTextField(100);
        txt2 = new JTextField(10);

        txtA1 = new JTextArea();

        pantalla.add(txtA1);
        pantalla.add(btn1);
        pantalla.add(lb1);

        pantalla.add(txt1);
        pantalla.add(txt2);

        pantalla.add(lb2);
        


    }

    public class Eventos implements ActionListener{


        public void actionPerformed (ActionEvent evento){


            int numero;
            String r;

           
                if(evento.getSource()==btn1){

                for(int j=0; j<10; j++){

                    numero = random.nextInt(2);

                    r = ""+numero;

                    txt1.setText(r);

                    System.out.println(j);
                    //txt1.setText(Integer.toString(numero)); //guarda el último número


                }

            }
        }
    }

}

