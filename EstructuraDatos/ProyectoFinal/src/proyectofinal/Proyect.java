

package proyectofinal;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Proyect extends JFrame{

    Proyect2 p2=new Proyect2();

    JLabel lb1,lb2;
    JTextField txt1;
    JTextArea txtA1;
    JScrollPane scroll1;
    JButton btn1,btn2,btn3,btn4;
    Container pantalla;
    String salida=" ";
    public int discos;

    public int xe[];

    int pasadas=0;

    GridLayout grid=new GridLayout(4,2);

    Proyect(){
        setTitle("Torres de Hanoi");

        pantalla=getContentPane();
        pantalla.setLayout(grid);

        lb1= new JLabel ("Discos");
        lb2= new JLabel ("Resultado");

        txt1= new JTextField(10);
        txtA1= new JTextArea();
        scroll1= new JScrollPane(txtA1); // el argumento del scroll debe ir después del txtA1

        btn1=new JButton("¡Hanoi!");
        btn1.setBackground(Color.RED);
        btn2= new JButton("Salir");
        btn2.setBackground(Color.BLUE);
        btn3=new JButton("Resolver");
        btn3.setBackground(Color.cyan);
        btn4=new JButton("Limpiar");
        btn4.setBackground(Color.YELLOW);

        pantalla.add(lb1); pantalla.add(txt1);
        pantalla.add(lb2); pantalla.add(scroll1);

        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());

        p2.setForeground(Color.WHITE);


        setSize(400,500);
        setVisible(true);
    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent evento){

            if(evento.getSource()==btn1){//discos
                discos=Integer.parseInt(txt1.getText());

                xe=new int [discos];

                p2.tamano(discos);

                for(int j=0; j<xe.length;j++){

                   p2.x[j]=j;
                   System.out.println(p2.x[j]);
                }
                p2.repaint();



            }
            if(evento.getSource()==btn2){
                System.exit(0);
            }
            if(evento.getSource()==btn3){
                 mueve(Integer.parseInt(txt1.getText()),'I','C','D');


             for(int k=0; k<pasadas; k++){

              JOptionPane.showMessageDialog(null,"Muevo");
                }

                 txtA1.setText(salida);
            }
            if(evento.getSource()==btn4){
                txtA1.setText("");
                discos=0;
                pasadas=0;
                salida="";
                txt1.setText("");


               

            }
        }
    }

   public void mueve(int n, char a, char b, char c){

     int n1;
     n1=n-1;

       if(n1==0){

           salida=salida+"muevo de: "+a+" a "+c+"\n ";

           p2.pescar(a, b, c);

           pasadas++;

      }else{

           mueve(n1,a,c,b);

           p2.pescar(a,b,c);


           salida=salida+"muevo de: "+a+" a "+c+"\n ";


           mueve(n1,b,a,c);

           pasadas++;
       }

    }

}
