/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;


public class Colecciones extends JFrame{

/*el objeto list está en 2 librerías(awt y util) entonces debemos escribirle de cuál librería queremos
 * que provenga.
 */
    
    private JComboBox box;
    private Container pantalla;
    private int n=12345;
    private String nx=""+n; //n se convirtió en un objeto. De primitivo a objeto.

    private java.util.List lst = new ArrayList();


        GridLayout grid = new GridLayout(4,1);
        Set set=new HashSet();

    public Colecciones(){

        pantalla=getContentPane();
        pantalla.setLayout(grid);
        setSize(400,400);
        setVisible(true);

        
         //Como es de nombre distinto es una clase de tipo interface y captura objetos el hashset.
         

        box = new JComboBox();
        set.add(true);
        set.add("LUis");  //no acepta duplicados
        set.add(10.55);
        set.add(1);
        set.add(1);
        
        lst.add(true);    //sí acepta duplicados
        lst.add("LUis");
        lst.add(10.55);
        lst.add(1);
        lst.add(1);

        box.addItem(lst);
        box.addItem(set);

        //set(new Integer(5));

        pantalla.add(box);

       for(Object obj: set){
           box.addItem(obj);  /*
                               * Se muestran todos los objetos 
                               */
       }


       for(Object obj1: lst){
           box.addItem(obj1);
       }

    }
       public static void main(String args[]){

        Colecciones colecciones = new Colecciones();
        colecciones.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
}

}




