
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;

public class JuegoDados extends JFrame {


    private Random aleatorio;
    private JTextField txt1, txt2;
    private JButton btn1;
    private Container pantalla;

    public JuegoDados(){

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        setSize(210,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txt1 = new JTextField(15);
        txt2 = new JTextField(15);

        btn1 = new JButton("Tirada");
        btn1.addActionListener(new Eventos());

        aleatorio = new Random();

        pantalla.add(btn1);
        pantalla.add(txt1);
        pantalla.add(txt2);

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){

            int dado1, dado2;

            if(eventos.getSource()==btn1){

                dado1= aleatorio.nextInt(6)+1;
                dado2= aleatorio.nextInt(6)+1;

                txt1.setText(""+dado1+" y "+dado2);


                if(dado1==dado2){
                    txt2.setText("¡Felicidades, ganaste!");
                }else{
                    txt2.setText("Perdiste, vuelve a intentar");
                }

            }



        }
    }


}
