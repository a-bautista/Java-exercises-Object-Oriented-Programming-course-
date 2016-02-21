
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ejercicio_4_5 extends JFrame{

    private JLabel lb1, lb2, lb3;
    private JTextField txt1, txt2, txt3;
    private JButton btn1;


public void createGUI(){

    Container marco = getContentPane();
    marco.setLayout(new FlowLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);

    lb1 = new JLabel(" Ingreso Inicial");
    lb2 = new JLabel ("Ingreso Final");
    lb3 = new JLabel (" Deducción de Impuestos");

    txt1 = new JTextField(10);
    txt2 = new JTextField(10);
    txt3 = new JTextField(10);

    btn1 = new JButton("Iniciar");
    btn1.addActionListener(new Eventos());


    marco.add(lb1);  marco.add(txt1);
    marco.add(lb2);  marco.add(txt2);
    marco.add(lb3);  marco.add(txt3);
    marco.add(btn1);

    lb1.setVisible(false);  txt1.setVisible(false);
    lb2.setVisible(false);  txt2.setVisible(false);
    lb3.setVisible(false);  txt3.setVisible(false);

    btn1.setVisible(true);

}

public class Eventos implements ActionListener{

    public void actionPerformed(ActionEvent x){

        final double imP = 0.20;

        double inG;

        double deduX;


        if (x.getSource()==btn1){

          inG = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario"));

          lb1.setVisible(true); txt1.setVisible(true);
          lb2.setVisible(true); txt2.setVisible(true);
          lb3.setVisible(true); txt3.setVisible(true);

          deduX = inG*imP;

          txt1.setText(""+inG);
          txt2.setText(""+(inG-deduX));
          txt3.setText(""+deduX);

         }

     }
   }
}
