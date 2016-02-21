
package recursividad;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RecursividaD extends JFrame{

    JLabel lb1,lb2, lb3,lb4, lb5, lb6,lb7,lb8,lb9;
    JTextField txt1, txt2,txt3, txt4, txt5,txt6,txt7,txt8;
    JTextArea txtA1;
    JScrollPane scroll1;
    JButton btn1,btn2,btn3, btn4, btn5,btn6;
    Container pantalla;
    String salida=" ";//se declara global

    GridLayout grid=new GridLayout(12,2);

    RecursividaD(){
        setTitle("Recursividad");

        pantalla=getContentPane();
        pantalla.setLayout(grid);

        lb1= new JLabel ("Factorial");
        lb2= new JLabel ("Resultado");
        lb3= new JLabel ("Fibonacci");
        lb4= new JLabel ("Numero");
        lb5= new JLabel("Discos");
        lb6= new JLabel("Corrida");
        lb7= new JLabel("Numero 1 para el mcm");
        lb8= new JLabel("Numero 2 para el mcm");
        lb9= new JLabel("Resultado");

        txt1= new JTextField(10);
        txt2= new JTextField(10);
        txt3= new JTextField(10);
        txt4= new JTextField(10);
        txt5= new JTextField(10);
        txt6= new JTextField(10);
        txt7= new JTextField(10);
        txt8= new JTextField(10);

        
        txtA1= new JTextArea();
        scroll1= new JScrollPane(txtA1); // el argumento del scroll debe ir después del txtA1

        btn1=new JButton("Funcion con For");
        btn1.setBackground(Color.RED);
        btn2= new JButton("Funcion recursiva");
        btn2.setBackground(Color.BLUE);
        btn3= new JButton("Fibonacci");
        btn3.setBackground(Color.YELLOW);
        btn4= new JButton ("Hanoi");
        btn4.setBackground(Color.GREEN);
        btn5= new JButton("MCM");
        btn5.setBackground(Color.CYAN);
        btn6= new JButton("Salir");
        btn6.setBackground(Color.ORANGE);

        pantalla.add(lb1); pantalla.add(txt1);
        pantalla.add(lb2); pantalla.add(txt2);
        pantalla.add(lb3); pantalla.add(txt3);
        pantalla.add(lb4); pantalla.add(txt4);
        pantalla.add(lb5); pantalla.add(txt5);
        pantalla.add(lb6); pantalla.add(scroll1);
        pantalla.add(lb7); pantalla.add(txt6);
        pantalla.add(lb8); pantalla.add(txt7);
        pantalla.add(lb9); pantalla.add(txt8);
        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);
        pantalla.add(btn5); pantalla.add(btn6);



        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());
        btn5.addActionListener(new Eventos());
        btn6.addActionListener(new Eventos());

        setSize(800,800);
        setVisible(true);

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent e){


            if(e.getSource()==btn1){
                txt2.setText(""+factorial_1(Integer.parseInt(txt1.getText())));//el integer parse convierte el string a dato numérico
                txt1.setText("");
                txt1.requestFocus();
            }//cuidado con las llaves
            if(e.getSource()==btn2){
                txt2.setText(""+factorial_2(Integer.parseInt(txt1.getText())));
            }
            if (e.getSource()==btn3){
                txt4.setText(""+fibo(Integer.parseInt(txt3.getText())));
            }
            if (e.getSource()==btn4){
                mueve(Integer.parseInt(txt5.getText()),'I','C','D'); //izquierda centro derecha
                //mueve(7,'I','C','D');//aquí se modifica para los discos
                txtA1.setText(salida);

            }
            if (e.getSource()==btn5){
               txt8.setText(""+mcm(Integer.parseInt(txt6.getText()),Integer.parseInt(txt7.getText())));
                //mcm(Integer.parseInt(txt6.getText()),txt7)
            }
            if(e.getSource()==btn6){
                System.exit(0);
            }
        }
    }

   public double factorial_1 (double n){ //el metodo está aquí

     double f=1;

     for(int i=1; i<=n; i++){
         f=f*i;
         }

        return f;
   }

   public long factorial_2 (int n){

       if(n==0){
         return 1;
       }else{
          return n*factorial_2(n-1);
         }
       }
   public long fibo(int n){
       if(n==1){
           return 0;
       }else if(n==2){
           return 1;
       }else{
           return fibo(n-2)+fibo(n-1);
       }
   }

   public void mueve(int n, char a, char b, char c){
       int n1;
       n1=n-1; //n1=n1-1;
       if(n1==0){
           salida=salida+"muevo de: "+a+" a "+c+"\n ";
           
       }else{
           mueve(n1,a,c,b);
            salida=salida+"muevo de: "+a+" a "+c+"\n ";
           
           mueve(n1,b,a,c);
       }
   }


   public int mcm(int x, int y){

       int m=x;
       int n=y;

       if (y==0){
           return x;
       }else if(y>x){
           return mcm(y,x);
       }else{
           return mcm(y,x%y);
       }

   }
}