/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
*/

import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.border.*;
import javax.swing.table.*;

public class Tabla {

    private JButton muestra = new JButton();
    
    Tabla(){
        
            JFrame frame = new JFrame("Tabla");
            
            frame.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent evento){System.exit(0);}}
            );


               
            final String encabezado []= {"Nombre","Apellido","Edad","Hombre","Estado Civil"};
            
            final Object datos [][] ={{"Luis","Vega",new Integer(24), Boolean.TRUE," ",muestra},
                                     {"Alex","Chemisty",new Integer(10), Boolean.FALSE," "}
                                     };
            
                
             TableModel modelo = new AbstractTableModel(){


                
                public int getColumnCount(){
                    return encabezado.length;
                }
                    
                public int getRowCount(){
                    return datos.length;
                }
                
                public Object getValueAt(int row, int col){
                    return datos[row][col];
                }
                
                public String getColumnName(int col){
                    return encabezado[col];
                }


                public Class getColumnClass(int column){ //necesario para el chechbox
                    return getValueAt(0,column).getClass();
                }
                
                public boolean isCellEditable(int row, int col){
                    if(row==1 && col==1){
                        return false;
                    }
                    return true;
                }
                public void setValueAt(Object valor, int row, int col){

                    System.out.println("dato=" +valor);

                    //al escribir algo por aquí va a pasar

                    datos[row][col]=valor;

                    if(row==0 && col==0){  //se cuenta a partir de cero
                        datos [row][col] = "hola";
                     }else{
                        datos[row] [col]=valor;
                     }
                    }   
                 
            };

        JTable tabla = new JTable(modelo);
        frame.getContentPane().add(tabla);
        frame.pack();
        frame.setVisible(true);

        TableColumn tablacolumna = tabla.getColumn("Estado Civil");

        JComboBox combobox = new JComboBox();
        

        combobox.addItem("Casado");
        combobox.addItem("Soltero");
        

        JScrollPane scroll = new JScrollPane(tabla);
        frame.getContentPane().add(scroll);

        tablacolumna.setPreferredWidth(100);

        tablacolumna.setCellEditor(new DefaultCellEditor(combobox));

        
        
        for(int i=0; i<datos.length;i++){
            
            for(int j=0; j<encabezado.length; j++){
                System.out.println(datos[i][j].toString());
            }
            
        }



    }

 public static void main(String args[]){
     new Tabla();
     TablaCodigo codigo = new TablaCodigo();

 }

}