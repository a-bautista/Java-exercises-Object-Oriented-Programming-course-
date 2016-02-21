
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ExeSet extends JFrame{


    private JLabel lb1, lb2, lb3, lb4;
    private JTextField txt1, txt2, txt3, txt4;
    private JButton btn1, btn2,btn3;
   

    public void createGUI(){

       
        Container ventana = new Container();
        ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        ventana.setBackground(Color.WHITE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        lb1 = new JLabel("Escribe tus segundos : ");
        txt1 = new JTextField(10);

        lb2 = new JLabel("Horas :");
        txt2 = new JTextField(10);

        lb3 = new JLabel("Minutos : ");
        txt3 = new JTextField(10);
        
        
        lb4 = new JLabel("Segundos : ");
        txt4 = new JTextField(10);

        btn1 = new JButton("Conversión en horas/mins/segs ");
        btn2 = new JButton("Conversión inversa ");
        
        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        
        ventana.add(btn1);
        ventana.add(btn2);

        ventana.add(lb1);
        ventana.add(lb2);
        ventana.add(lb3);
        ventana.add(lb4);

        ventana.add(txt1);
        ventana.add(txt2);
        ventana.add(txt3);
        ventana.add(txt4);

      }


  public class Eventos implements ActionListener{

      public void actionPerformed(ActionEvent x){


          Resuelve oc = new Resuelve();

          int segundos, minutos, horas, sec;
          

     if(x.getSource()==btn1)
        {
              

          segundos = Integer.parseInt(txt1.getText());

          sec = segundos % 60;

          horas = segundos / 60;

          minutos = horas % 60;

          horas = horas / 60;

          txt2.setText(""+horas);

          txt3.setText(""+minutos);

          txt4.setText(""+sec);

        }
          
     if (x.getSource()==btn2)
        {

         int hours, minutes, segs;


         hours = Integer.parseInt(txt2.getText());
         minutes = Integer.parseInt(txt3.getText());
         segs = Integer.parseInt(txt4.getText());

         txt1.setText(""+oc.primerPaso(hours, minutes, segs));

         }

       }
    }
}
