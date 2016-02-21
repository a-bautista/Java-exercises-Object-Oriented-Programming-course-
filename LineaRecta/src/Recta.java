
public class Recta {
 
    public String calculaDistancia(double x1, double y1, double x2, double y2){
        double a=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return "La distancia entre esos dos puntos es: "+a;
    }
    
    public String escribeError(){
        return "La operación ha regresado un cero indicando que no se puede "
                + "dividir entre cero ";
    }
    
    public void calculaPendiente(double x1, double y1, double x2, double y2) throws MyExceptionDivisionByZero {

        try{
            checkException(x1,y1,x2,y2);
           // throw new MyExceptionDivisionByZero();
         
    
        }catch(MyExceptionDivisionByZero ex){
            ex.toString();
           
           
        }
        /*if (x2==x1) {
            System.out.println(""+escribeError());
            return 0;
        }else{
                double b=(y2-y1)/(x2-x1);
                return b;
        }*/
    }
   static double checkException(double x1, double y1, double x2, double y2) throws MyExceptionDivisionByZero {

        if (x2==x1) {
            throw new MyExceptionDivisionByZero();
        }else{
             double b=(y2-y1)/(x2-x1);
             return b;
        }
    
    }

    public String calculaEcuRectaDosPuntos(double x1, double y1, double x2, double y2){
       /* double pendiente=calculaPendiente(x1,y1,x2,y2);
            
        if (pendiente==0) {
           
        }else{
            pendiente*=1;
        }
        return "";
    }*/
        return "a";
}
}
 