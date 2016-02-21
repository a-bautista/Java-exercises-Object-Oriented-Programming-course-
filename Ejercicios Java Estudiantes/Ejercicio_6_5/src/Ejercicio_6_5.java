
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio_6_5 extends JFrame{

    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JPanel panel;
    private Timer temporizador;
    

    private int tics = 0;

    Container pantalla = new Container();

    public Ejercicio_6_5(){

       

        pantalla = getContentPane();
        pantalla.setLayout(new FlowLayout());
        setSize(650,350);
        setVisible(true);

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(700,300));
        panel.setBackground(Color.WHITE);

        lb1 = new JLabel("Segundos: ");
        lb2 = new JLabel("Minutos: ");
        lb3 = new JLabel("Total de segundos: ");

        txt1 = new JTextField(10);
        txt2 = new JTextField(10);
        txt3 = new JTextField(10);

       

        temporizador = new Timer(100, new Eventos());

        pantalla.add(panel); pantalla.add(lb1);
        pantalla.add(txt1);  pantalla.add(lb2);
        pantalla.add(txt2);  pantalla.add(lb3);
        pantalla.add(txt3);  

       temporizador.start();

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent eventos){
            
            Graphics papel = panel.getGraphics();
            int mins=0, segs=0;

                txt3.setText(""+tics);
                txt2.setText(Integer.toString(tics/60));
                txt1.setText(Integer.toString(tics%60));
                tics+=1;

                segs=Integer.parseInt(txt1.getText());
                mins=Integer.parseInt(txt2.getText());

                papel.clearRect(0, 10, segs*10+600, 100);
                papel.fillRect(0, 10, segs*10, 100);


                papel.fillRect(0, 130, mins*10, 100);
                validate();
                 }
           }
}