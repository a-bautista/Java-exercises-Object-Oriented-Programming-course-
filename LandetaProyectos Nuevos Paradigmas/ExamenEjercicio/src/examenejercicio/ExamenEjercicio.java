

package examenejercicio;

import java.io.*;
import javax.swing.*;
import javax.swing.JList;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.text.Position.Bias;

public class ExamenEjercicio extends JFrame {

    JLabel lb1, lb2;
    JTextField txt1, txt2;
    JButton btn1, btn2;
    //JComboBox box;
    JScrollPane scroll;
    DefaultListModel model;
    Container pantalla;
    JList list;

    public ExamenEjercicio(){

        GridLayout grid = new GridLayout(4,1);
        pantalla = getContentPane();
        pantalla.setLayout(grid);

        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        model = new DefaultListModel();

        lb1 = new JLabel("Nombre");
        lb2 = new JLabel("Número");

        txt1 = new JTextField(10);
        txt2 = new JTextField(10);

        btn1 = new JButton("Leer archivo");
        btn2 = new JButton("ejemplo");

        //box = new JComboBox(scroll);

        list = new JList(model);
        scroll = new JScrollPane(list);

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());

       // model.addListDataListener(ListDataListener());


      MouseListener mouseListener = new MouseAdapter() {

        public void mouseClicked(MouseEvent e) {
          

             int index = list.locationToIndex(e.getPoint());

         if (e.getClickCount() == 1) {


        System.out.println(""+index);


             switch(index/2){

                  case 0 :

                     txt1.setText(""+list.getSelectedValue());

                     txt2.setText(""+list.getFirstVisibleIndex());


                 case 1:

                     txt2.setText(""+list.getSelectedValue());

                     txt1.setText(""+list.getFirstVisibleIndex());



                 case 2:

                      txt2.setText(""+list.getSelectedValue());

                     txt1.setText(""+list.getFirstVisibleIndex());


                 case 3:

                      txt1.setText(""+list.getSelectedValue());

                     txt2.setText(""+list.getFirstVisibleIndex());

               }


             }
     }
 };
          list.addMouseListener(mouseListener);

        pantalla.add(lb1);
        pantalla.add(lb2);
        pantalla.add(txt1);
        pantalla.add(txt2);
        pantalla.add(btn1);
        pantalla.add(btn2);
        pantalla.add(scroll);

    }



public class Eventos implements ActionListener{


    public void actionPerformed(ActionEvent x){


        if(x.getSource()==btn1){


            String nombre = txt1.getText();


            try{

              FileReader file = new FileReader("/JavaPrueba.txt");

              BufferedReader buffer = new BufferedReader(file);

              

              System.out.println(nombre);

              String line = ""; //puedo concluir que line lee caracter por caracter y no string por string

              while(line!=null){

                  if((line.matches(nombre))){

                  System.out.println("hola");
                  line = buffer.readLine();

                  model.addElement(line);

                    }else{

                      System.exit(0);
                      System.out.println("hola2");
                    }
              }

            }catch(Exception error){
                System.out.println("Error"+error.toString());
            }
         }

       }
    }
}