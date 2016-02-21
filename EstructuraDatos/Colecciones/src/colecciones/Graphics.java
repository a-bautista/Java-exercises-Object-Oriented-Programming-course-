
package colecciones;

/**
 *
 * @author alejandro.bautista
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.util.List;

public class Graphics extends JFrame {


    JButton btn1, btn2, btn3;
    Container pantalla;

    GridLayout grid=new GridLayout(3,0);

    Graphics(){

        setTitle("Genéricos");

        pantalla=getContentPane();
        pantalla.setLayout(grid);

        btn1=new JButton("Hash");
        btn2=new JButton("ArrayList");
        btn3=new JButton("Map");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());

        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3);

        setSize(150,150);
        setVisible(true);

    }

public class Eventos implements ActionListener{

    public void actionPerformed(ActionEvent x){
        if(x.getSource()==btn1){
            SH();
        }
        if(x.getSource()==btn2){
            AL();
        }
        if(x.getSource()==btn3){
            M();
        }
    }

}


public void SH(){

    Set s=new HashSet();

    s.add("a");
    s.add(true); //"s" se comporta como un model
    s.add(4);
    s.add("Ejemplo");
    s.add(4);//dato primitivo
     //primero se escriben los números luego los chars y luego los strings
    s.add(0);
    s.add(new Integer (1)); //objeto
    s.add(new Float(4));

    System.out.println(s);
 }

public void AL(){//acepta duplicados

    List l=new ArrayList();
    Object q= new Object();

    q=l.get(1);
    l.add('a');
    l.add(true); //"s" se comporta como un model
    l.add(4);
    l.add("Ejemplo");
    l.add(4);//dato primitivo
     //primero se escriben los números luego los chars y luego los strings
    l.add(0);
    l.add(new Integer (1)); //objeto
    l.add(new Float(4));
    System.out.println(l);

    System.out.println(q);
    q.toString();//



}

public void M(){
    Map x=new HashMap();
    
    x.put("001", "Armando");
    x.put("020", "Belisario");
    x.put("030","Luis");
    x.put("040", "Pedro");
    x.put("050", "Wally");
    x.put("070","Zelda");

    System.out.println("llaves: "+x.keySet());
    System.out.println("valores: "+x.values());

    x.remove("001");//se remueve el objeto junto con su contenido

    System.out.println("valores y llaves: "+x.entrySet());

    
    
  }





}
