/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primos;

/**
 *
 * clase para trabajar con los gráficos
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;  //es todo lo que ocurre en la ventana que creé



public class TestMain extends JFrame{ //soporta toda la parte grafica lo hereda


    JLabel lb1, lb2; //vienen de Jframe

    JTextField txt1, txt2;  //por protocolo vienen lb1 de label y txt1 de texto

    JButton btn1, btn2;  //se crea lo que necesitas


    Container pantalla;

    //las plantillas hacen que se metan los obj

    FlowLayout layout=new FlowLayout();  
    // FlowLayout() es el metodo que se llama el constructor
    // y FlowLayout es la clase arma todo lo que está en la ventana

    TestMain(){  //va a modificar la clase TestMain

        pantalla= getContentPane(); //primero va la construcción del objeto es decir este va primero

        pantalla.setLayout(layout); //inicializa la pantalla y son propiedades del container

        setTitle("Ejemplo de numeros Primos");

        lb1=new JLabel("No. "); //este es otro constructor que lleva un texto

        txt1=new JTextField(10); //10 son los numeros de caracteres

        txt2=new JTextField(40);

        lb2= new JLabel("Resultado");

        
        btn1= new JButton("¿Es primo?");
        btn2= new JButton("¿Es primo mejorado?");

        btn1.addActionListener(new Eventox());  //Eventox es una clase abstracta-clase sin haberla implementado
        //actionlistener entiende todo lo que sea clicks

        btn2.addActionListener(new Eventox());

        txt1.addActionListener(new Eventox());

        pantalla.add(lb1); pantalla.add(txt1); pantalla.add(btn2); // todo esto echa a andar todo el codigo

        pantalla.add(lb2); pantalla.add(txt2); pantalla.add(btn1); //no marca error porque todo va seguido de ;

        setSize(300,300); //esto es el tamaño de las pantalla que va a aparecer

        setVisible(true);  //hace que se muestre todo

    }

 

    public class Eventox implements ActionListener{ //implements se usa para la clase abstracta y una clase abstracta es toda aquella que ya está hecha


        public void actionPerformed(ActionEvent e){
            //actionevent es una clase de acciones de eventos que se van a depositar en e y

            if(e.getSource()==btn1){ //getsource le pertence a la clase actionevent
                    /*por default la condicion de arriba está como true*/
                
                Primo np= new Primo();  //conectaré clase primo con TestMain

                if (np.esPrimo(Integer.parseInt(txt1.getText()))){
                    txt2.setText("Es primo");
                }else{
                    txt2.setText("No es primo");

                     }

                //txt2.setText("hola soy tu primo");
                //Integer.toString(10) lo convierte en texto
                //las unicas variables que no se comparan son los booleans
              }

            if(e.getSource()==btn2){

                Primo np= new Primo(); //debe inicializarse para que funcione entre al metodo Primo

                try{
                  if (np.esPrimo(Integer.parseInt(txt1.getText()))){
                    txt2.setText("Es primo");
                }else{
                    txt2.setText("No es primo");

                     }

                }catch(Exception error){
                    txt2.setText("Error Fatal");

                }
            }

            if(e.getSource()==txt1){
                try{
                    int x=Integer.parseInt(txt1.getText()); //no pasa nada aqui, el numero ingresado es transformado a numero binario y la compu hace el resto
                    btn1.requestFocus(); //manda sombreado al boton 1 es decir lo manda a la siguiente caja de texto

                }catch(Exception f){
                    txt2.setText(f.toString());
                    txt1.setText("");
                    //cajas de texto por default es el enter
                    //si das enter automaticamente te borra esa caja y te pone error
                 }
               }

           }
        }
           public static void main (String args[]){

             TestMain p=new TestMain();

             }

   }
