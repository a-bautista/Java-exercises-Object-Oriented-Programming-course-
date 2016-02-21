package estructurasdinámicas;

import javax.swing.*;

public class Lista { //public class sólo existe una sola vez PARTE I


    Nodo primernodo,ultimonodo;


     class Nodo{ //PARTE II

        Nodo siguientenodo; //el tipo nodo es toda una clase
        int dato;  //ESTAS SON SUS PROPIEDADES

        //POSEE 2 MÉTODOS

        Nodo(int d){ //ENTRA CUANDO ESTÁ VACIA constructor

            dato=d;
            siguientenodo=null;
         }

        Nodo(int d,Nodo nodo_viejo){ //se creó la variable tipo nodo  PARTE III ENTRA CUANDO YA TENEMOS 2 ARGUMENTOS construcotr
            dato=d;
            siguientenodo=nodo_viejo;
          }


        /*se recibe un nuevo valor y el nodo viejo
                *se recibe de nuevo para crear uno nuevo que apuntará a viejo*/
     }


   Lista(){//constructor
     primernodo=ultimonodo=null;
    }
     //METODOS

     public boolean EstaVacia(){
        if(primernodo==null){
            return true;

        }else{
            return false;
        }
    }

    public void InsertaNodoPrimero(int d){


        if(EstaVacia()){
            primernodo=ultimonodo=new Nodo(d);//

        }else{
                primernodo=new Nodo(d,primernodo);//constructor
   
           }

    }

    public void InsertaNodoUltimo(int d){
         if(EstaVacia()){
            primernodo=ultimonodo=new Nodo(d);

          }else{
                ultimonodo.siguientenodo=ultimonodo=new Nodo(d); //EL .SIGUIENTE ES SU ATRIBUTO
            }

    }

    public void BorrarPrimerNodo(){
        if(EstaVacia()){
          //System.out.println("Vacio");
          JOptionPane.showMessageDialog(null,"La lista está vacía");

        }else{
          primernodo=primernodo.siguientenodo;
        }//primernodo=ultimonodo=null;

    }

   public void BorrarUltimoNodo(){

       Nodo actual;
       actual=primernodo;

       if(EstaVacia()){
           
           JOptionPane.showMessageDialog(null,"La lista está vacía");

       }else{
          if(actual.siguientenodo==null){ //si te queda un último elemento con esto se elimina
              primernodo=ultimonodo=null;
          }
          while(actual.siguientenodo!=ultimonodo){
              actual=actual.siguientenodo;
          }
          actual.siguientenodo=null;
          ultimonodo=actual;

       }
   }

   public String Imprimir(){

       String salida="";

       Nodo actual=primernodo; //se aggarra el primer elemento
       if(EstaVacia()){
           salida="Está vacía";
       }else{

       while(actual.siguientenodo!=null){
           salida=salida+actual.dato+"\n"; //es el valor númerico que queremos
           actual=actual.siguientenodo; //el último dato se pierde tonces debe obtenerse
       }
       salida=salida+actual.dato+"\n";


       }
       return salida;
   }

   public void Limpiar(){
       primernodo=ultimonodo=null;
   }
 }