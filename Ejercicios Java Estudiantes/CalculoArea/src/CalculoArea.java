
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CalculoArea extends JFrame {


    private JButton btn1;
    private JButton btn2;

    public void createGUI(){

        Container ventana = getContentPane();

        ventana.setLayout(new FlowLayout () );
        ventana.setBackground(Color.white);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btn1 = new JButton ("Ejemplo");
        btn2 = new JButton ("Resultado");

        ventana.add(btn1); ventana.add(btn2);

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

    }


    public class Eventos implements ActionListener {

        public void actionPerformed(ActionEvent e){

            int longitud , anchura ;
            int area ;

            String longitudString ;
            String anchuraString  ;


            anchuraString = JOptionPane.showInputDialog("Longitud:"  );
            longitudString = JOptionPane.showInputDialog("Anchura:" );

            if(anchuraString.isEmpty() || longitudString.isEmpty()){
                JOptionPane.showMessageDialog(null,"No se puede computar su resultado");

            }


            longitud = Integer.parseInt(longitudString);
            anchura = Integer.parseInt(anchuraString);

            area = anchura*longitud;

            if (e.getSource()==btn2){
                JOptionPane.showMessageDialog(null,Integer.toString(anchura)); /*Explícitamente
                                                                                * se convierte
                                                                                * la variable
                                                                                * anchura en
                                                                                * cadena de caracter
                                                                            */
                }
            if (e.getSource()==btn1){
                JOptionPane.showMessageDialog(null,"El área es: \n"+area);
            }


        }
    }

}


