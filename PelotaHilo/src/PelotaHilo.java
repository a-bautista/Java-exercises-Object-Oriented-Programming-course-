/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class PelotaHilo extends JFrame {

    private JButton btn1, btn2, btn3, btn4;
    private JPanel panel1, panel2;
    private Pelota pelota1, pelota2;

    public PelotaHilo(){

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());       

        btn1 = new JButton("iniciar 1");
        pantalla.add(btn1);
        btn1.addActionListener(new Eventos());

        btn2 = new JButton("iniciar 2");
        pantalla.add(btn2);
        btn2.addActionListener(new Eventos());

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(100,100));
        panel1.setBackground(Color.white);
        pantalla.add(panel1);

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(100,100));
        panel2.setBackground(Color.white);
        pantalla.add(panel2);

        btn3 = new JButton("detener 1");
        pantalla.add(btn3);
        btn3.addActionListener(new Eventos());

        btn4 = new JButton("detener 2");
        pantalla.add(btn4);
        btn4.addActionListener(new Eventos());


    }


    public class Eventos implements ActionListener{

        public void actionPerformed (ActionEvent e){

            if((e.getSource() == btn1)) {

                pelota1 = new Pelota(panel1);
                pelota1.start();
            }

            if(e.getSource()==btn2){

                pelota2 = new Pelota(panel2);
                pelota2.start();
            }

            if(e.getSource()==btn3){

                pelota1.detenerPorFavor();
            }

            if(e.getSource()==btn4){

                pelota2.detenerPorFavor();
            }
        }
    }

    public class Pelota extends Thread{

        private JPanel panel;
        private int x = 7, cambioX = 7;
        private int y = 0, cambioY = 2;
        private final int diametro =10;
        private final int anchura = 100, altura = 100;
        boolean seguirRebotando;

        public Pelota(JPanel elPanel){

            panel = elPanel;
        }

        public void run(){

            seguirRebotando = true;

            while (seguirRebotando){

            mover();

            rebotar();     /*
                            * Métodos para la clase pelota donde todos se llevan a cabo una vez
                            * que se oprime el botón iniciar.
                            */

            dibujar();

            retrasar();

            eliminar();


            }

        }


        private void mover(){

            x = x + cambioX;
            y = y + cambioY;

        }

        private void rebotar(){

            if(x <= 0 || x >= anchura){

                cambioX = -cambioX;

            }

            if(y <= 0 || y>=altura){

                cambioY= -cambioY;
            }
        }

        private void retrasar(){

            try{

                Thread.sleep(50);
            }
            catch(InterruptedException e){
                return;
            }
        }

        public void dibujar(){

            Graphics papel = panel.getGraphics();
            papel.setColor(Color.red);
            papel.fillOval(x, y, diametro, diametro);
        }

        private void eliminar(){

            Graphics papel = panel.getGraphics();
            papel.setColor(Color.white);
            papel.fillOval(x, y, diametro, diametro);
        }

        public void detenerPorFavor(){

            seguirRebotando = false;

        }
    }


    public static void main(String args[]){

        PelotaHilo h = new PelotaHilo();

        h.setVisible(true);
        h.setSize(500,500);
    }

}
