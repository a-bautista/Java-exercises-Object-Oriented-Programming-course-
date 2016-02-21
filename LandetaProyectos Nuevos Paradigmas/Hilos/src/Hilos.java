import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class Hilos {


    Hilo h1= new Hilo("h-1");
    Hilo h2= new Hilo("h-2");
    Thread t1 = new Thread(h1);
    Thread t2 = new Thread(h2);

    public Hilos(){

        t1.start();
        t2.start();

        String opcion= JOptionPane.showInputDialog("Espero respuesta");

        //try y catch


        if(opcion.equals("1")){
            t1.stop();

        }else if(opcion.equals("2")){
            t2.stop();

  
        }else if(opcion.equals("3")){
           //t1.sleep(1);
           
        }else if(opcion.equals("4")){
           //t2.sleep(0);
           
        }else if(opcion.equals("5")){
           //t1.sleep(0);
           //t2.sleep(0);
        
        }else if(opcion.equals("6")){
            t1.suspend();
            
        }else if(opcion.equals("7")){
            t2.suspend();
            
        }else if(opcion.equals("8")){
            t1.suspend();
            t2.suspend();
            
        }else if (opcion.equals("9")){
            t1.stop();
           
            t2.stop();

        }
     }
   }

    public class Hilo implements Runnable{
        String nombre;
        Hilo(String nombre){
            this.nombre=nombre;
        }

        public void run(){
            boolean x=true;
            while(x){
                System.out.println("run:"+nombre);
            }
        }


    }




    public static void main(String args[]){

        Hilos h1 = new Hilos();

    }

}
