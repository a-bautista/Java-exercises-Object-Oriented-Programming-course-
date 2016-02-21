import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class GraficoFecha extends JFrame {

        GridLayout gl = new GridLayout(4,1);
        JButton btn1, btn2, btn3;
        Container pantalla;

        com.toedter.calendar.JCalendar ty;


        public GraficoFecha(){

            pantalla=getContentPane();

            pantalla.setLayout(gl);

            //rt = new de.wannawork.jcalendar.JCalendarPanel();

            ty = new com.toedter.calendar.JCalendar();

            btn1 = new JButton("Fecha 1");

            btn2 = new JButton("Fecha 2");

            btn3 = new JButton("Fecha 3");


            btn1.addActionListener(new Eventos());
            btn2.addActionListener(new Eventos());
            btn3.addActionListener(new Eventos());


            pantalla.add(btn1);
            pantalla.add(btn2);
            pantalla.add(btn3);
            pantalla.add(ty);

          setSize(400,500);

          setVisible(true);
        }



        public class Eventos implements ActionListener {

            public void actionPerformed(ActionEvent events){

                if(events.getSource()==btn1){

                    Clase14Sep yu = new Clase14Sep();

                    yu.Fecha1(ty.getDate());
                    yu.Fecha2(ty.getCalendar());

                }


        }
     }

}
