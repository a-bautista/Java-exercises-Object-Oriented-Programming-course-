/*
public class testHilo1 {
    Hilo h1=new Hilo("h1");
    Hilo h2=new Hilo("h2");
    Thread t1 = new Thread(h1);
    Thread t2 = new Thread(h2);
    public static void main(String[] arg){
        testHilo h0 = new testHilo();
        h0.t1.start();
        h0.t2.start();
        System.out.println("TERMINE");
    }
}*/
import java.awt.*;

class Hilo implements Runnable{
    private String nombre;
    private TextArea ta;
    
    
    Hilo(){
        nombre="";
        
    }
    Hilo(String nombre, TextArea ta){
        this.nombre=nombre;
        this.ta=ta;
    }
    public void run(){
        boolean flag=true;
        long i=0;
        while(i<5000){
            
            ta.setText(ta.getText()+nombre+" : "+i+"\n");
             i++;
           // System.out.println("Nombre: "+nombre+"-"+i+"\n");
           
        }
    }
}