
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Ejercicio_6_4 extends JFrame {

    private int anchura=5, longitud=20;
    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3;
    private JPanel panel;
    private JSlider slider1, slider2;


    public Ejercicio_6_4(){

        Container pantalla = new Container();
        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension (200,200));
        panel.setBackground(Color.WHITE);

        lb1 = new JLabel("Volumen de la alberca:");
        lb2 = new JLabel("Profundidades");
        lb3 = new JLabel("Extremo derecho\n (poco profundo)");
        lb4 = new JLabel("Extremo izquierdo\n(profundo)");

        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);

        slider1 = new JSlider(JSlider.HORIZONTAL,1,20,5);
        slider2 = new JSlider(JSlider.HORIZONTAL,1,40,20);

        txt2.setText(Integer.toString(slider1.getValue()));
        txt3.setText(Integer.toString(slider2.getValue()));

        btn1 = new JButton("Calcula el volumen");
        btn2 = new JButton("Dibuja la alberca");
        btn3 = new JButton("Restaurar");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());

        slider1.addChangeListener(new Eventos());
        slider2.addChangeListener(new Eventos());

        pantalla.add(panel);

        pantalla.add(lb1);       pantalla.add(txt1);
        pantalla.add(lb2);       pantalla.add(lb3);
        pantalla.add(txt2);      pantalla.add(slider1);
        pantalla.add(lb4);       pantalla.add(txt3);
        pantalla.add(slider2);   pantalla.add(btn1);
        pantalla.add(btn2);      pantalla.add(btn3);


    }

    public class Eventos implements ActionListener, ChangeListener{

        public void actionPerformed(ActionEvent eventos){


            double volumen, promedio;     
            int sl1 = slider1.getValue();
            int sl2 = slider2.getValue();


            if(eventos.getSource()==btn1){

                promedio =(Double.parseDouble(txt2.getText())+Double.parseDouble(txt3.getText()))/2;

                volumen = promedio*anchura*longitud;


                txt1.setText(""+volumen);
                
            }

            if(eventos.getSource()==btn2){

               Graphics objeto = panel.getGraphics();

               Alberca dot = new Alberca();

               dot.linea_arriba(objeto);

               dot.linea_izquierda(objeto, sl2);

               dot.linea_derecha(objeto, sl1);

               dot.linea_abajo(objeto, sl2, sl1);

               
            }
            if(eventos.getSource()==btn3){
                repaint();
                txt1.setText(" ");
            }


        }

        public void stateChanged(ChangeEvent eventos){

            Graphics papel = panel.getGraphics();
   
            txt2.setText(Integer.toString(slider1.getValue()));

            txt3.setText(Integer.toString(slider2.getValue()));


        }
    }

}
