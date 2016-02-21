//como copiarías de una pila a otra pila-pasas los elementos uno por uno

package model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Model extends JFrame{
    JLabel lb1, lb2;
    JTextField txt1,txt2;
    JButton btn1, btn2, btn3,btn4;
    JList lst;
    JScrollPane scroll;
    DefaultListModel model; // es un arreglo dinamico y es un objeto y la variable se llama model
    Container pantalla;
    GridLayout grid=new GridLayout(3,3);

    //Jlist  se alimenta de model

    Model(){
        pantalla=getContentPane();
        pantalla.setLayout(grid);

        lb1= new JLabel("Elemento");
        lb2= new JLabel("Lista");
        txt1= new JTextField(30);
        model= new DefaultListModel(); //el model tiene su propia clase de eventos
        lst= new JList(model);
        scroll= new JScrollPane(lst);
        txt2= new JTextField(30);

        btn1= new JButton("Agrega");
        btn2= new JButton("Salir");
        btn3= new JButton("Borrar");
        btn4= new JButton ("Borra elemento que quieres");

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());

        lst.addListSelectionListener(new Eventos1());  //este es el acitonListener del lst

        pantalla.add(lb1);  pantalla.add(lb2);
        pantalla.add(txt1); pantalla.add(txt2);
        pantalla.add(scroll); //va enlazado porque aqui va el list y el list contiene al model

        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4); 

        setSize(600,600);
        setVisible(true);
    }

    public class Eventos implements ActionListener { //todas las clases de eventos tienen métodos

        public void actionPerformed(ActionEvent e){
            if(e.getSource()==btn2){
                System.exit(0);
            }
            if (e.getSource()==btn1){//el model cachara al texto introducido
                model.addElement(txt1.getText());
                txt1.setText("");
                txt1.requestFocus();
              }
            if(e.getSource()==btn3){
                model.remove(Integer.parseInt(txt2.getText()));
            }

            if(e.getSource()==btn4){
                //model.removeElement(txt2.getText()); //esto no necesita el Integer.parseInt porque no convierte caracter a dato
               // model.removeAllElements();
                model.removeRange(0, 2);

            }

          }
      }

    //este es el public class de eventos1 con su respectivo
    public class Eventos1 implements ListSelectionListener{ //hay distintos tipos de ActionListeners,este es otro el listselectoin..

        public void valueChanged (ListSelectionEvent a){ //esto es un método pero preestablecido


            if(a.getSource()==lst){

                JOptionPane.showMessageDialog(null,"Posicion="+lst.getSelectedIndex(),"Encabezado",JOptionPane.INFORMATION_MESSAGE);
                
                //JOptionPane.showMessageDialog(null,"Posicion="+lst.getSelectedIndex()); //el getSelectedIndex() significa que toma el índice del elemento

                JOptionPane.showMessageDialog(null,"Elemento="+lst.getSelectedValue());

                //JOptionPane.showInputDialog(a)
                //JOptionPane.showConfirmDialog(null, "Elemento="+lst.getSelectedValue()); esto te lanza una pregunta
//
            }


        }
    }



}
