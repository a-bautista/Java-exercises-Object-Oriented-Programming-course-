/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package grafos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GrafosGrafica extends JFrame{

    Insets insets_prueba;
    JTextField txt1, txt2,txt3,txt4;
    JLabel lb1, lb2,lb3,lb4;
    JButton btn1, btn2;
    Container ventana;

    BorderLayout border=new BorderLayout();
    int figura=0;

    Panel p=new Panel();//es el que va a sustituir a pantalla


    //tipos de grid
    //GridBagLayout
    //SetLayout
    //GridLayout

    GrafosGrafica(){
        setTitle("Grafos");
        this.setLayout(border);//se usa el this para referir a la propia clase

        lb1= new JLabel("Etiqueta 1");
        lb2= new JLabel("Etiqueta 2");
        lb3= new JLabel("Etiqueta 3");
        lb4= new JLabel("Etiqueta 4");

        txt1= new JTextField(10);
        txt2= new JTextField(10);
        txt3= new JTextField(10);
        txt4= new JTextField(10);
        btn1= new JButton("botón 1");
        btn2= new JButton("boton 2");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

        p.add(lb1); p.add(txt1); 
        p.add(lb2); p.add(txt2); 
        p.add(lb3); p.add(txt3);
        p.add(lb4); p.add(txt4);
        p.add(btn1); p.add(btn2);
         
        this.add("South",p);
        setSize(900,500);
        setVisible(true);

    }

    public void paint(Graphics g){//en éste método siempre se dibuja algo

        super.paint(g); //habla con el padre JFrame

        if(insets_prueba==null){
            insets_prueba=getInsets();
        }
        g.translate(insets_prueba.left, insets_prueba.top);

        switch(figura){

            case 1:
               g.setColor(Color.red);

               g.drawLine(10,50,100,300); //g se creó de la nada
               break;

            case 2:
               g.setFont(new Font("Arial",Font.BOLD,14));
               g.drawString("Alex", 100, 300);
               break;
               
            case 3:

                g.drawRect(10, 50, 100, 500);
               // g.draw3DRect(WIDTH, WIDTH, WIDTH, figura, rootPaneCheckingEnabled)
                g.draw3DRect(30, 40, 300, 400, false);
                g.drawArc(100, 480, 700, 900, ABORT, ABORT);

                break;

            case 4:
                g.setColor(Color.BLUE);
                g.fillRect(80, 90, 400, 600);


                break;
            case 5:
                g.fillRect(10, 50, 300, 200);
                g.clearRect(50, 100, 200, 150);
                //g.drawChars("hola", 100, 200, 300, 400);
                break;
            case 6:

              g.drawOval(100, 100, 200, 700);
              break;

            case 7:

              Polygon xor=new Polygon();

              xor.addPoint(70, 120);
              xor.addPoint(50, 70);
              xor.addPoint(20, 100);
              xor.addPoint(80, 60);
              g.drawPolygon(xor);
                break;

        }

       validate();//se refrescan los objetos una vez pintados
        
    }


    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent a){
            if(a.getSource()==btn1){
                figura++;
                repaint();// llama al método paint
              
            }
        }
    }


}
