
package tarea1;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.*;
import java.awt.event.*;

public class Graphics extends JFrame{

    private JButton btn1, btn3;
    private JPanel panel;
    private JLabel lb1, lb2, lb3,lb4,lbSlope, lbDistance, lbEquation;
    private JTextField txt1, txt2, txt3,txt4, txtSlope, txtDistance, txtEcuRect;
    Container ventana;


    public void createGUI() {

        ventana = getContentPane();
        ventana.setLayout(new FlowLayout());


        panel = new JPanel();
        panel.setPreferredSize(new Dimension(490, 510));
        panel.setBackground(Color.WHITE);

        btn1 = new JButton("Crea línea");
        btn3 = new JButton("Borrar");

        lb1 = new JLabel("X1");
        lb2 = new JLabel("Y1");
        lb3 = new JLabel("X2");
        lb4 = new JLabel("Y2");
        lbDistance = new JLabel("Distancia de punto (x1,y1) y punto (x2,y2):");
        lbSlope= new JLabel("Pendiente:");
        lbEquation= new JLabel("Ecuación de la recta dados dos puntos:");

        txt1=new JTextField(20);
        txt2=new JTextField(20);
        txt3=new JTextField(20);
        txt4=new JTextField(20);
        txtSlope=new JTextField(20);
        txtDistance=new JTextField(20);
        txtEcuRect=new JTextField(20);


        btn1.addActionListener(new Eventos());
      
        btn3.addActionListener(new Eventos());

        ventana.add(lb1);
        ventana.add(txt1);

        ventana.add(lb2);
        ventana.add(txt2);

        ventana.add(lb3);
        ventana.add(txt3);

        ventana.add(lb4);
        ventana.add(txt4);

        ventana.add(lbSlope);
        ventana.add(txtSlope);

        ventana.add(lbDistance);
        ventana.add(txtDistance);

        ventana.add(lbEquation);
        ventana.add(txtEcuRect);


        ventana.add(panel);
        ventana.add(btn1);
        ventana.add(btn3);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

    }

    public class Eventos implements ActionListener {

        public void actionPerformed(ActionEvent x) {

            

            if (x.getSource() == btn1) {

                
                Recta rec = new Recta();

                Graphics2D papel = (Graphics2D) panel.getGraphics();

                txtDistance.setText(""+ rec.calculaDistancia(Double.parseDouble(txt1.getText()),Double.parseDouble(txt2.getText()),
                        Double.parseDouble(txt3.getText()), Double.parseDouble(txt4.getText())));

                txtSlope.setText(""+rec.calculaPendiente(Double.parseDouble(txt1.getText()),Double.parseDouble(txt2.getText()),
                        Double.parseDouble(txt3.getText()), Double.parseDouble(txt4.getText())));

                txtEcuRect.setText(""+rec.calculaEcuRectaDosPuntos(Double.parseDouble(txt1.getText()),Double.parseDouble(txt2.getText()),
                        Double.parseDouble(txt3.getText()), Double.parseDouble(txt4.getText())));

                rec.dibujaLinea(papel,Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),
                        Integer.parseInt(txt3.getText()), Integer.parseInt(txt4.getText()));

            }


            if (x.getSource() == btn3) {

                repaint();
                txtDistance.setText("");
                txtSlope.setText("");
                txtEcuRect.setText("");
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");
                txt4.setText("");

            }

        }
    }
}

