/*
 * En la clase Tabla se encuentra su main
 */

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class TablaCodigo extends JFrame {

    com.toedter.calendar.JCalendar jc;
    JTextField txt1, txt2, txt3;
    JLabel lb1, lb2, lb3, lb4, lbn1, lbn2, lbn3, lbn4, lbn5;
    JButton btn1, btn2, btn3;
    JTable tabla;

    String encabezado[]={"A. Paterno", "A. Materno", "Nombre", "Edad"};
    Object datos[][]={{"Vega", "García", "Luis","24"},
                      {"Bautista", "Ramos", "Alejandro","22"},
                      {"Banenelli", "Hernández", "Ricardo","20"}};

    GridBagLayout gbl =new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    Container pantalla;
    JScrollPane scroll;

    public TablaCodigo(){

        pantalla=getContentPane();
        pantalla.setLayout(gbl);

        TableModel modelo=new AbstractTableModel(){
           public int getColumnCount(){
               return encabezado.length; //o puedo poner datos[0].length();
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
           public Class getColumnClass(int c){
               return getValueAt(0,c).getClass();
           }

           public boolean isCellEditable(int row, int col){
               return true; //todas son editables
           }
           public void setValueAt(Object valor, int row, int col){
               System.out.println("dato = "+valor);
               datos[row][col]=valor;

               if(row==2 && col==2){
                   datos[row][col]="hola";
               }else{
                   datos[row][col]=valor;
               }
           }
       };

        JTable tabla = new JTable(modelo);
        scroll=new JScrollPane(tabla);

        lb1=new JLabel("Apellido Paterno: ");
        lb2=new JLabel("Apellido Materno: ");
        lb3=new JLabel("Nombre: ");
        lb4=new JLabel("Calendario");
        lbn1=new JLabel("");
        lbn2=new JLabel("");
        lbn3=new JLabel("");
        lbn4=new JLabel("");
        lbn5=new JLabel("");

        txt1=new JTextField(30);
        txt2=new JTextField(30);
        txt3=new JTextField(30);

        btn1=new JButton("Agregar");
        btn2=new JButton("Borrar");
        btn3=new JButton("Guardar");

       jc=new com.toedter.calendar.JCalendar();

        gbc.weightx=100;
        gbc.weighty=1;
        gbc.fill=GridBagConstraints.BOTH;

        plantilla(lb1,1,2,1,1);
        plantilla(lb2,1,3,1,1);
        plantilla(txt1,2,2,1,1);
        plantilla(txt2,2,3,1,1);
        plantilla(lb3,1,4,1,1);
        plantilla(txt3,2,4,1,1);
        plantilla(lb4,3,1,1,1);
        plantilla(lbn1,1,5,1,1);
        plantilla(lbn2,1,6,1,1);
        plantilla(lbn3,1,7,1,1);
        plantilla(lbn4,1,8,1,1);
        plantilla(lbn5,1,9,1,1);
        gbc.weighty=0;
        plantilla(jc,3,2,1,6);
        gbc.weighty=10;
        plantilla(scroll,1,9,3,20);
        gbc.weighty=1;
        plantilla(btn1,1,31,1,1);
        plantilla(btn2,2,31,1,1);
        plantilla(btn3,3,31,1,1);

        setSize(600,600);
        setVisible(true);

    }

     public void plantilla(Component obj, int coordx, int coordy, int anchura, int altitud){

        gbc.gridx=coordx;
        gbc.gridy=coordy;
        gbc.gridheight=altitud;
        gbc.gridwidth=anchura;
        gbl.setConstraints(obj, gbc);
        pantalla.add(obj);

    }

}





