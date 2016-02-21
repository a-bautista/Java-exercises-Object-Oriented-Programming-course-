

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class CirculosComparacion extends JFrame {

    private JTextField txt1;
    private JSlider sl1, sl2;
    private JPanel panel;
    private Container pantalla;

   public CirculosComparacion(){


        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());

        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        txt1 = new JTextField(20);

        sl1 = new JSlider(JSlider.VERTICAL);
        sl2 = new JSlider (JSlider.VERTICAL);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(280,180));
        panel.setBackground(Color.white);

        sl1.addChangeListener(new Eventos());
        sl2.addChangeListener(new Eventos());

        pantalla.add(sl1);    pantalla.add(sl2);
        pantalla.add(panel);  pantalla.add(txt1);




    }


    public class Eventos implements ChangeListener{

        public void stateChanged(ChangeEvent eventos){


            Graphics papel = panel.getGraphics();

            int redVal, blueVal;


            redVal = sl1.getValue();
            blueVal = sl2.getValue();


            papel.setColor(Color.white);  //sirve para borrar
            papel.fillOval(0, 0, 200, 200);

            papel.setColor(Color.red);
            papel.fillOval(30, 40, redVal, redVal);

            papel.setColor(Color.blue);
            papel.fillOval(80, 60, blueVal, blueVal);


            if(redVal > blueVal){
                txt1.setText("El rojo es mayor que el azul");
                

            }else if(redVal < blueVal){
                txt1.setText("El azul es mayor que el rojo");

            }else{
                txt1.setText("Son iguales los círculos");

            }
            

        }
    }


}
