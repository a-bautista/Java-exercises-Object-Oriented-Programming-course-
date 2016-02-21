/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pilas;

import javax.swing.*;

public class Pila { //aqui estan los métodos que hacen que funcionen los botones
        int datos[]; //arreglo al que no se le ha puesto el tamaño
        int top;
        int tamano;

        Pila (int tomaco){ //constructor se modifica
            tamano = tomaco; //¿para que sirve el this?
         /*como antes la variable tamano era igual al dato
         que se recibía en la pila se le puso el this. para indicar que tamano era igual
          al dato de la pila  */
         /*Tomaco es la variable que representa el valor que tendrá el arreglo*/
            datos = new int [tomaco];
            top=-1;
        }

       Pila(){ //le da vida al constructor datos pr default
           datos=new int[10];
           tamano=10;
           top=-1;
       }
public void Meter(int dato){ //metodo
    if(EstaLlena()){
        JOptionPane.showMessageDialog(null,"Esta llena la pila");
    }else{
        top++;
        datos[top]=dato; //dato es la variable que se recibe
    }

}
public boolean EstaLlena(){
    if(top==tamano-1){ //es menos 1 porque siempre va al tamaño final -1
        return true;
    }else{
        return false;

    }
 }
public int Saca(){ //no va como void porque quita el elemento, es decir regresa algo
     if(EstaVacia()){ //se sobreentiende que va vacio
         JOptionPane.showMessageDialog(null,"Esta vacía");
         return-9999;
     }else{
         top--; //se resta el top
         return datos[top+1];  //el top menos 1 indica que
     }
 }

public boolean EstaVacia(){
    if(top==-1){
        return true;
    }else{
        return false;

     }
  }

}
