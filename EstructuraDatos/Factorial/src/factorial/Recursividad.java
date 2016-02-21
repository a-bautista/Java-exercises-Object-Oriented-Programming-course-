
package factorial;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Recursividad extends JFrame{

    JLabel lb1, lb2;
    JTextField txt1,txt2;
    JButton btn1, btn2;
    Container pantalla;
    GridLayout grid=new GridLayout(5,2);

Recursividad(){

    setTitle("Recursividad");
    pantalla=getContentPane();
    pantalla.setLayout(grid);

    lb1=new JLabel("Factorial: ");
    lb2=new JLabel("Resultado: ");
    txt1=new JTextField(10);
    txt2=new JTextField(10);
    btn1=new JButton("Factorial For");
    btn2=new JButton("Factorial Recursivo");

    pantalla.add(lb1);
    pantalla.add(txt1);
    pantalla.add(lb2);
    pantalla.add(txt2);
    pantalla.add(btn1);
    pantalla.add(btn2);

    btn1.addActionListener(new Eventos());
    btn2.addActionListener(new Eventos());

    setSize(400,300);
    setVisible(true);
}

public class Eventos implements ActionListener{
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btn2){
            txt2.setText(""+factorialrec(Integer.parseInt(txt1.getText())));
        }
        if(e.getSource()==btn1){
            txt2.setText(""+factorialfor(Integer.parseInt(txt1.getText())));
        }
    }
}

public double factorialrec(int n){
    if(n==0){
        return 1;
    }else{
        return n*factorialrec(n-1);
    }
}

public double factorialfor(int n){
    double z=1;

    if(n==0){
        return 1;
    }else{
        for(int i=1;i<=n;i++){
            z=z*i;
        }
        return z;
    }
}

}
