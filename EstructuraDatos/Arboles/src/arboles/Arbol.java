
package arboles;


public class Arbol {

    Nodo raiz;
    String salida="";
    //DefaultListModel model;
    //int datos[]=new int [10];


   Arbol(){ //constructor para predeterminar valores
        raiz=null;
        }


    class Nodo{

        int valor;
        Nodo nodoizquierdo, nododerecho;//se le asocia sus valores en derecho e izquierdo

        Nodo (int valor){ //constructor
            nodoizquierdo=nododerecho=null;
            this.valor=valor;
            //this.valor=valor;  en lugar de valox
        }
        void InsertaNodo(int valor){ //método y no va con publico porque sólo queremos que lo vea esta clase

              if(this.valor<=valor){//mayores a raiz
                  if(nododerecho==null){
                      nododerecho=new Nodo(valor);
                    }else{
                      nododerecho.InsertaNodo(valor);
                  }
              }else{//menores a raiz
                  if(nodoizquierdo==null){
                          nodoizquierdo=new Nodo(valor);
                      }else{
                          nodoizquierdo.InsertaNodo(valor); //se vuelve a llamar la clase donde valor se comparara para ver si es mayor o menor que el otro nodo
                      }
              }
        }
    }

        public void Insertar(int valor){ //sabe cuánto vale raíz
            if(raiz==null){
                raiz=new Nodo(valor); //se genera la primera estructura de nodo
            }else{
                raiz.InsertaNodo(valor);
            }
        }


     public void LecturaProfundidad(Nodo dato){ //dato es la variable que posee al nodo

         //String salida=""; no puede estar aquí porque como es recursivo se borra la variable

         if(dato!=null){

             //System.out.println("Dato "+dato.valor);
             salida=salida+dato.valor+"\n";
             LecturaProfundidad(dato.nodoizquierdo);
             LecturaProfundidad(dato.nododerecho);

             
         }
         
     }

     public String Lectura(){

         salida="nodos\n";

         LecturaProfundidad(raiz);
         return salida;

     }

     public void LecturaAnchura(Nodo dato){





     }



   }



