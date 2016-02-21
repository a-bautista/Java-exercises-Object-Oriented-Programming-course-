package tarea1;

import java.awt.Graphics;

public class Recta {

    public String calculaDistancia(double x1, double y1, double x2, double y2){
        double a=Math.round(Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2)));
        return ""+a;
    }

    public String escribeError(){
        return "La operación ha regresado un cero indicando que no se puede "
                + "dividir entre cero ";
    }

    public double calculaPendiente(double x1, double y1, double x2, double y2)  {

         if (x2==x1) {
            System.out.println(""+escribeError());
            return 0;
        }else{
            double b=((y2-y1)/(x2-x1));
            return b;
        }

    }

    public String calculaEcuRectaDosPuntos(double x1, double y1, double x2, double y2){

        double pendiente=calculaPendiente(x1,y1,x2,y2);

        if (pendiente==0) {
           return "Su ecuación es una constante.";
        }else if(pendiente<0){
            return " y - "+y1+" = "+pendiente+"x  "+pendiente*x1;
        }
        else{

            return " y - "+y1+" = "+pendiente+"x - "+pendiente*x1;

        }

    }
    public void dibujaLinea(Graphics areaDibujo, int x1,
                                                     int y1,
                                                     int x2,
                                                     int y2)
    {

        areaDibujo.drawLine(x1, y1, x2, y2);
    }

}




