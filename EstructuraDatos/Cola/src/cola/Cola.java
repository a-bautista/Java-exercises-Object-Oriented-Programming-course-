/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cola;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Cola extends JFrame {
   int datos[];
    int a_in, a_out, tamaño;

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

}
