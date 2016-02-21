
/**
 *
 * @author alexbr
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class EsferaHerencia extends JFrame{
    
    protected int x = 100, y = 100;
    protected JButton btn1;



    public void EsferaHerencia(){

        Container pantalla = new Container();

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        pantalla.setSize(400,400);
        pantalla.setVisible(true);
        

        btn1 = new JButton("nuevo");
        btn1.addActionListener(new Eventos());
        pantalla.add(btn1);

    }

    public void setX(int nuevaX){

        x=nuevaX;
    }

    public void setY(int nuevaY){

        y= nuevaY;
    }

    public void mostrar(Graphics papel){

        papel.drawOval(x, y, 20, 20);
    }


    public class Eventos implements ActionListener{


        public void actionPerformed(ActionEvent evento){

            if(evento.getSource()==btn1){
                System.out.println("hola");
            }


        }
    }
}
