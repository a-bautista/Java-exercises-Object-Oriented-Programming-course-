/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;


//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;
//import javax.swing.event.*;

public class Cola extends JFrame {
    int datos[];
    int a_in, a_out, tamaño;
    int num=0, inicio=0,a=0;


public Cola(){ //modificaciones internas a la clase para valores predeterminados

    tamaño=9;
    datos=new int[10];
    a_in=0;
    a_out=0;
}

 Cola(int tamaño){
    this.tamaño=tamaño+1;
    a_in=0;
    a_out=0;
    datos=new int[tamaño+1];
    
}

public void Mete(int d){
    if(EstaLLena()){
        JOptionPane.showMessageDialog(null, "La cola está llena");
    }else{
        a_in=(a_in+1)%tamaño;
        num++; /*Cuando el usuario le da click al boton meter cuando la cola está llena estas instrucciones del else no se realizan
         ya que la instruccion JOption se cumplió antes*/
        if(a_in==(a_out+1)){
            inicio=a_in;
        }
        datos[a_in]=d;
    }
}

public boolean EstaLLena(){
    if(((a_in+1)%tamaño)==a_out){
        return true;
    }else{
        return false;
    }
}

public int Saca(){
    if(EstaVacia()){
        JOptionPane.showMessageDialog(null, "Esta vacia");
        return -9999;
    }else{
        a_out=(a_out+1)%tamaño;
        num--;/*Cuando el usuario le da click al boton sacar cuando la cola está llena estas instrucciones del else no se realizan
         ya que la instruccion JOption se cumplió antes*/
        inicio++;
         if(inicio==tamaño){
             inicio=0;
         }
        return datos[a_out];
    }
}

public boolean EstaVacia(){
    if(a_in==a_out){
        return true;
    }else{
        return false;
    }
 }

public String Imprimir(){

    String t="  ";
    
    if(EstaVacia()){
        JOptionPane.showMessageDialog(null,"Esta vacia la pila");
        return "Cero valores";

    }else{
        for(int k=0; k<num; k++){

                a=datos[(inicio+k)%tamaño];
                t=t+a+"  ";
        }
    }
   return t;

  }

public int SacarTodos(){
    if(EstaVacia()){
        JOptionPane.showMessageDialog(null,"Está vacía la pila");
        return -9999;
    }else{
        for (int j=1; j<=num; j++){
            a_out=(a_out+j)%tamaño;
           }
        a_in=0;
        a_out=0;
        inicio=0;
        num=0;
        return datos[a_out];
      }
  }

}
