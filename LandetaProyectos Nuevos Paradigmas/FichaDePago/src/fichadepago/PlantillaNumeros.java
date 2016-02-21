package fichadepago;

import java.text.DecimalFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;


public class PlantillaNumeros {

    private double importe;
    private Date fecha;




   public PlantillaNumeros(){  //constructor

        importe =0;
        fecha = new Date();
    }


   public PlantillaNumeros(double importe){  //constructor

       this.importe=importe;
   }




   public void setFecha(Date fecha){
       this.fecha=fecha;
   }

   public Date getFecha(){
      return fecha;
   }

   public void setImporte(double importe){

       this.importe=importe;
   }
   public double getImporte(){

       return importe;
   }


   public String importeCondensado(){

       DecimalFormat x = new DecimalFormat("0000000.00");   //plantilla de 10 posiciones

       /*pudo haber sido DecimalFormat (###,###,##0.####)
        * cuatro decimales y con comas
        */


       String strImporte=x.format(importe);  /*con esto el número se convierte

                                                a string por default*/
                                             //esto es un ejemplo de una plantilla




       int ponderacion [] = {7,1,3,7,1,3,7,1,3,7};

       int importe1 [] = new int [10]; //por la máxima cantidad de dinero 99,000,000.00

       String c;

       int suma=0;

       int j=9;

       int lonG = strImporte.length();

       for (int i=lonG-1; i>=0; i--){
           //c = jTextField8.getText().substring(i, 1);

           c = ""+strImporte.charAt(i); //se volvió string con el +

           if(!c.equals(".")){

               importe1 [j] = Integer.parseInt(c);

               suma = importe1 [j]* ponderacion [j] + suma;
               j-=1;
           }

        }

       suma = suma % 10;

       return ""+suma;
   }


}
