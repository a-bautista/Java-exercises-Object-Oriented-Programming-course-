/*
los eventos que se programan pueden tener parámetros
 */

import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
 
public class RadioBoton extends JFrame {

    Container pantalla;
    GridLayout grid = new GridLayout(5,3);


    JLabel lb1;
    JList list;
    JScrollPane scroll;
    DefaultListModel model;
    JTextField txt1;

    JButton btn1, btn2, btn3,btn4,btn5;
    JRadioButton rbtn1, rbtn2;
    JCheckBox check1,check2;
    JComboBox box;


    Font f1= new Font("Arial",Font.BOLD,13);
    Font f2= new Font("Arial",Font.BOLD,13);

    String estados[] = {"Chiapas","Tabasco","Yucatan","Oaxaca" };



    public RadioBoton(){

        pantalla = getContentPane();
        pantalla.setLayout(grid);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        rbtn1 = new JRadioButton("Radio Botón 1");
        rbtn2 = new JRadioButton("Radio Botón 2");

        box = new JComboBox(estados);
        lb1 = new JLabel("inicio");
        check1 = new JCheckBox("Apagado",false);
        check2 = new JCheckBox("Apagado",false);

        model = new DefaultListModel();

        list = new JList(model);
        
        scroll = new JScrollPane(list);
   
        txt1 = new JTextField(10);
        btn1 = new JButton("Agregar");
        btn2 = new JButton("Traer datos");
        btn3 = new JButton("Saber el elemento");
        btn4 = new JButton("Traer datos archivo");
        btn5 = new JButton("Guardar");

        /*rbtn1.addItemListener(new Eventos(f1));
        rbtn2.addItemListener(new Eventos(f2));
        box.addItemListener(new Eventos(f1));*/

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());
        btn5.addActionListener(new Eventos());
        model.clear();

        pantalla.add(list);
        pantalla.add(lb1);
        pantalla.add(btn1);
        pantalla.add(btn2);
        pantalla.add(box);
        pantalla.add(txt1);
        pantalla.add(btn3);
        pantalla.add(btn4);
        pantalla.add(btn5);

    }

    public class Eventos implements ActionListener,ItemListener{

        private Font font;

      /*  public Eventos(Font f){

            this.font=f;
        }*/

        public void actionPerformed(ActionEvent x){

            if(x.getSource()==btn1){
                model.addElement(txt1.getText());

            }
            if(x.getSource()==btn2){
                //model.removeElement(txt1.getText());

                for (int j=0; j<model.getSize(); j++){
                    System.out.println(j);
                    System.out.println(""+model.elementAt(j));
                }

            }


            if(x.getSource()==btn3){

                for (int k=0; k<model.getSize(); k++){

                    JOptionPane.showMessageDialog(null,model.elementAt(k));
                        }
                }

            if(x.getSource()==btn4){

                try {//leer el archivo

                    model.clear();
                    System.out.println("Holaaaaa");

                    //FileReader file = new FileReader("/Users/alexbr/NetBeansProjects/LandetaProyectos/RadioBoton/compaq.txt");

                    FileReader file2 = new FileReader("/JavaPrueba.txt");

                    BufferedReader buffer = new BufferedReader(file2);

                    String linea ="";            /*Linea va a tener el archivo con el readLine
                                                 * y leerá para saber si no está nulo.
                                                 */
 

                    while(linea!=null){
                        linea = buffer.readLine();
                        model.addElement(linea);
                    }




                }catch(Exception error){//Pueden haber diversos catch dependiendo de distintos tipos de error
                    System.out.println("error"+error.toString());




                }finally{


                }
             }

            if(x.getSource()==btn5){

                try {
                
                    FileWriter write = new FileWriter("/compaq.txt",true);

                    PrintWriter print = new PrintWriter(write);


                    for(int k=0; k<model.getSize(); k++){

                        
                        String line;

                        line = ""+model.elementAt(k);
                        print.println(line);

                    }
                    print.close();

                }catch(Exception err){

                }

            }


        }

        public void itemStateChanged(ItemEvent eventos){

            rbtn1.setFont(font);
            lb1.setFont(font);
            lb1.setBackground(Color.yellow);

            if(rbtn1.isSelected() && rbtn2.isSelected()==false){

                //check1.setSelected(true);
                 rbtn1.setSelected(true);
                
                         }

            if(rbtn2.isSelected() && rbtn1.isSelected()==true){
                
                rbtn2.setSelected(true);

                 }

           if(eventos.getSource()==box){

              System.out.println(box.getSelectedItem());
              System.out.println(box.getSelectedIndex());
              System.out.println(box.getItemCount());
            }


         }
       }

    }



