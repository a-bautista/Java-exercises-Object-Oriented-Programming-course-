
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.math.*;

public class ExpCalc extends JFrame{

 public JButton btn1;
 public Container ventana;
 public JLabel lb1;
 public JTextField txt1;
 public double a;

    public ExpCalc(){

        ventana = getContentPane();
        ventana.setLayout(new FlowLayout());

        setSize(350,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1 = new JButton("Resultado");
        lb1 = new JLabel("Valor");
        txt1 = new JTextField(10);

        btn1.addActionListener(new Eventos());

        ventana.add(btn1);
        ventana.add(txt1);
        ventana.add(lb1);

 }
    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent evento){

            if(evento.getSource()==btn1){

                String val;

                val=JOptionPane.showInputDialog("¿Cuántos valores?");

                a=Double.parseDouble(val);

                txt1.setText(""+resultado(a));

            }
            

        }
    }

    public double resultado (double x){

        double valor=0, res=1;
        
        for (int y =1; y<=x; y++){

            valor=valor+1/facto(y);
        }
        return res+valor;
    }

    public int facto(int f){

        if(f<=1){
         return 1;
        }else{
            return f*facto(f-1);
        }

    }









    public static void main(String args[]){

        ExpCalc calc= new ExpCalc();


    }



}
