
package metodosordenamiento;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.util.Arrays; //librería para el sort del array
import java.text.DateFormat; //librerias de fechas
import java.util.Date;

public class Paso1 extends JFrame{

    int datos[]=new int[50000];//debe ir en el constructor también para que sea de alcance global


    JLabel lb1, lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9;
    JButton btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8,btn9,btn10;
    JTextField txt,txt2,txt3,txt4,txt5,txt6,txt7;
    JTextArea txtA1;
    JScrollPane scroll, scroll2;
    JList lst;
    DefaultListModel model;
    Container pantalla;

    GridLayout grid = new GridLayout(14,2);

    Paso1(){
        //int datos[]=new int[500000];

        pantalla= getContentPane(); //declaro pantalla
        pantalla.setLayout(grid);

        lb1= new JLabel("Fechas y Horas");  //declaro botones
        lb2= new JLabel("Lista");
        lb3= new JLabel("Número de la Búsqueda Secuencial");
        lb4= new JLabel("Respuesta con la búsqueda secuencial");
        lb5= new JLabel("Búsqueda Binaria");
        lb6= new JLabel("Resultado de la búsqueda binaria");
        lb7= new JLabel("Arriba");
        lb8= new JLabel("Posición");
        lb9= new JLabel("Abajo");


        btn1= new JButton("Fechas");
        btn2= new JButton("Genera número");
        btn3= new JButton("Bubble");
        btn4= new JButton("ArraySort");
        btn5= new JButton("Búsqueda Secuencial");
        btn6= new JButton("Búsqueda binaria");
        btn7= new JButton("Ordenación con QuickSort");
        btn8= new JButton("Salir");
        btn9= new JButton("Arriba");
        btn10=new JButton("Abajo");

        txt= new JTextField(10);
        txt2=new JTextField(10);
        txt3=new JTextField(10);//introduce
        txt4=new JTextField(10);//saca
        txt5=new JTextField(10);
        txt6=new JTextField(10);
        txt7=new JTextField(10);

        model= new DefaultListModel(); //que no se te olvide declarar el model y siempre antes porque java es secuencial 
        txtA1= new JTextArea();
        lst= new JList(model);

        scroll= new JScrollPane(lst);
        scroll2=new JScrollPane(txtA1);

        btn1.addActionListener(new Eventos());
        btn2.addActionListener(new Eventos());
        btn3.addActionListener(new Eventos());
        btn4.addActionListener(new Eventos());
        btn5.addActionListener(new Eventos());
        btn6.addActionListener(new Eventos());
        btn7.addActionListener(new Eventos());
        btn8.addActionListener(new Eventos());
        btn9.addActionListener(new Eventos());
        btn10.addActionListener(new Eventos());

        pantalla.add(lb2);  pantalla.add(scroll);
        pantalla.add(lb1);  pantalla.add(scroll2);
        pantalla.add(lb3);  pantalla.add(txt);
        pantalla.add(lb4);  pantalla.add(txt2);
        pantalla.add(lb5);  pantalla.add(txt3);
        pantalla.add(lb6);  pantalla.add(txt4);
        pantalla.add(lb7);  pantalla.add(txt5);
        pantalla.add(lb8);  pantalla.add(txt6);
        pantalla.add(lb9);  pantalla.add(txt7);

        pantalla.add(btn1); pantalla.add(btn2);
        pantalla.add(btn3); pantalla.add(btn4);
        pantalla.add(btn5); pantalla.add(btn6);
        pantalla.add(btn7); pantalla.add(btn8);
        pantalla.add(btn9); pantalla.add(btn10);

        setSize(700,700);
        setVisible(true);

    }

    public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if(e.getSource()==btn1){

                Date now=new Date();

                String salida="Formato de Fechas y Horas\n";
                
                salida=salida+"1:  "+now.toString()+"\n";

                salida=salida+"2: "+DateFormat.getDateInstance().format(now)+"\n";

                salida=salida+"3: "+DateFormat.getTimeInstance().format(now)+"\n";

                salida=salida+"4: "+DateFormat.getDateTimeInstance().format(now)+"\n";

                salida=salida+"5: "+DateFormat.getTimeInstance(DateFormat.SHORT).format(now)+"\n";

                salida=salida+"6: "+DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now)+"\n";

                salida=salida+"7: "+DateFormat.getTimeInstance(DateFormat.LONG).format(now)+"\n";

                salida=salida+"8: "+DateFormat.getTimeInstance(DateFormat.FULL).format(now)+"\n";

                salida=salida+"9: "+DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT).format(now)+"\n";

                txtA1.setText(salida);
            }

          if(e.getSource()==btn2){
              model.clear();

              for(int i=0; i<datos.length; i++){ //se obtiene el dato de longitud para el arreglo datos

                  datos[i]=(int)(Math.random()*10000); //casting se obliga a que nos arrojen nuúmeros enteros
                  //
                  model.addElement(""+i+"--->"+datos[i]); //las comillas sirven para que se puedan ver los numeros en la pantalla
                    //al elemento model se le transfieren los elementos ordenados
              }
              JOptionPane.showMessageDialog(null,"Terminé");
          }

         if(e.getSource()==btn3){
             burbuja();
             llenadomodel();
         }
         if(e.getSource()==btn4){
             Arrays.sort(datos);
             llenadomodel(); //necesario para que se muestren los valores
         }
         if(e.getSource()==btn5){
             
             txt2.setText(" "+busquedasecuencial(Integer.parseInt(txt.getText())));

             //busquedasecuencial(Integer.toString(txt2.setText()));
            }
          if(e.getSource()==btn6){
              txt4.setText("posición= "+BusquedaBinaria(datos,Integer.parseInt(txt3.getText()))); //muy importante esta sintaxis
             }
          if(e.getSource()==btn7){
            
              QuickSort(0,datos.length-1);//valores del apuntador
              llenadomodel();
          }
          if(e.getSource()==btn8){
              System.exit(0);
          }
          if(e.getSource()==btn9){
             txt5.setText(""+arriba(datos,Integer.parseInt(txt6.getText())));
            }
          if(e.getSource()==btn10){
              txt7.setText(""+abajo(datos,Integer.parseInt(txt6.getText())));
            }
          }


      }
    public void burbuja(){ //se ordenan los datos en el model pero no se ven

        int temp;
        boolean flag=true;

        for(int i=0; i<datos.length; i++){

         while (flag){

            flag=false;

            for(int j=0; j<datos.length-1; j++){

                if(datos[j]>datos[j+1]){

                    temp=datos[j];
                    datos[j]=datos[j+1];
                    datos[j+1]=temp;
                    flag=true;
                    }

                }
            }
        }
    }
    public void llenadomodel(){ //con esto los datos del model se logran ver porque se vuelven a agregar

        model.clear();
        for(int i=0; i<datos.length; i++){
            model.addElement(""+i+"---->"+datos[i]);
        }
    }

    public long busquedasecuencial(int d){

        int  p=-1, cont=0;
        boolean flag=true; //utiliza tus banderas

        do{
 
            if(datos[cont]==d){
                p=cont;
                flag=false; //se apaga el boton y si no le pones se traba la maquina trabajando
            }else{
                cont++;

                 if(cont>datos.length){
                     flag=false; //se apaga
                 }    
            }
            

        }while(flag==true);

        return p;
    }

 public int BusquedaBinaria(int datos[], int n){ //se recibe un arreglo para no crear otro

     int superior, inferior, enmedio ;

     inferior=0;
     superior=datos.length-1;

     while(inferior<=superior){

     enmedio=(int)((inferior+superior)/2); //se promueve el valor a entero

     if(datos[enmedio]==n){

         arriba(datos,enmedio);

         abajo(datos,enmedio);

         return enmedio; //con el return sale del ciclo

     }else{
         if(datos[enmedio]>n){
             superior=enmedio-1;
         }else{
             inferior=enmedio+1;
         }
       }
     }
     return -1;
   }

 public void QuickSort(int p, int r){ //apuntadores

     if(p<r){ //cuando se nos pide un metodo debe contener todo los elementos a pedir

         int q=Particion(p,r);
         QuickSort(p,q-1);
         QuickSort(q+1,r);
     }
 }
 public int Particion(int p, int r){

     int x=datos[r];
     int i=p-1;
     int t;

     for (int j=p; j<=(r-1);j++){
         if(datos[j]<=x){
             i++;
             t=datos[i];  //se hace intercambio
             datos[i]=datos[j];
             datos[j]=t;
         }
     }
     t=datos[i+1];
     datos[i+1]=datos[r];
     datos[r]=t;  //se hace intercambio
     return i+1;
 }

 public int arriba(int datos[],int x){

     int igual=datos[x];
     int contador=0;

     for(int k=x; igual==datos[k-1]; k--){ //no uses variables iguales porque en abajo puse k
         contador++;
     }
     return contador;
 }

 public int abajo(int datos[], int y){

     int igual_2=datos[y];
     int contador_2=0;

     for(int j=y; igual_2==datos[j+1]; j++){ //no uses variables iguales aquí puse antes k
         contador_2++;
     }

     return contador_2;
 }
}