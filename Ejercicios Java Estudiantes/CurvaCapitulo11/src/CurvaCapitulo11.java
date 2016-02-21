

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;

public class CurvaCapitulo11 extends JFrame {


    int a, b, c, d;

    private JSlider aDeslizante, bDeslizante, cDeslizante, dDeslizante;
    private JTextField Atxt1, Btxt2, Ctxt3, Dtxt4;
    private JPanel panel;
    private int altura = 350, anchura = 350;
    private Container ventana;



    public void createGUI(){

        

        ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
     
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        aDeslizante = new JSlider(-5,5);
        aDeslizante.addChangeListener(new Eventos());
        ventana.add(aDeslizante);

        Atxt1 = new JTextField(10);
        ventana.add(Atxt1);

        bDeslizante = new JSlider(-5,5);
        bDeslizante.addChangeListener(new Eventos());
        ventana.add(bDeslizante);

        Btxt2 = new JTextField(10);
        ventana.add(Btxt2);

        cDeslizante = new JSlider(-5,5);
        cDeslizante.addChangeListener(new Eventos());
        ventana.add(cDeslizante);

        Ctxt3 = new JTextField(10);
        ventana.add(Ctxt3);

        dDeslizante = new JSlider(-5,5);
        dDeslizante.addChangeListener(new Eventos());
        ventana.add(dDeslizante);

        Dtxt4 = new JTextField(10);
        ventana.add(Dtxt4);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(anchura,altura));
        panel.setBackground(Color.WHITE);
        ventana.add(panel);


    }


    public class Eventos implements ChangeListener{


         public void stateChanged(ChangeEvent evento){


            a = aDeslizante.getValue();
            b = bDeslizante.getValue();
            c = cDeslizante.getValue();
            d = dDeslizante.getValue();


            Atxt1.setText("a = "+ Integer.toString(a));
            Btxt2.setText("b = "+ Integer.toString(b));
            Ctxt3.setText("c = "+ Integer.toString(c));
            Dtxt4.setText("d = "+ Integer.toString(d));

            dibujar();
        }

  }


        private void dibujar(){

            Graphics papel = panel.getGraphics();
            papel.setColor(Color.WHITE);
            papel.fillRect(0, 0, anchura, altura);

            double x,y, sigueX, sigueY, pixelY, siguePixelY;

            int pixelX, siguePixelX;

            papel.setColor(Color.BLACK);

            for (pixelX = 0; pixelX <= anchura; pixelX++){

                x = escalarX(pixelX);
                y = laFuncion(x);

                pixelY = escalarY(y);
                siguePixelX = pixelX+1;

                sigueX = escalarX(siguePixelX);
                sigueY = laFuncion(sigueX);

                siguePixelY =  escalarY(sigueY);
                papel.drawLine(pixelX, (int) pixelY, siguePixelX, (int)siguePixelY);
            }

        }

        private double laFuncion(double x){

            return a *x*x*x + b*x*x +c*x +d;
        }

        private double escalarX(int pixelX){

            double xInicial = -5, xFinal = 5;
            double xEscala = anchura / (xFinal-xInicial);
            return (pixelX-(anchura/2))/xEscala;
        }

        private double escalarY(double pixelY){
            double yInicial = -5, yFinal = 5;
            int coordPixel;
            double yEscala = altura/(yFinal-yInicial);
            coordPixel = (int) (-yFinal * yEscala) + (int) (altura/2);


            return coordPixel;
        }
    }

