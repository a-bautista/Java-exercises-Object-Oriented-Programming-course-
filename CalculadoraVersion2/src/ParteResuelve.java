import java.util.*;
/**
 *
 * @author alexbr
 */
public class ParteResuelve {

        Stack<String> operations = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        String a="";

    public String getDisplay(String display){

      try{
        char[] separa = display.toCharArray();

        for (int i = 0; i < separa.length; i++) {

            char s= separa[i];
            if (s=='(') {
                //no hagas nada
            }
            else if(s=='+'){
                operations.push(""+s);
            }
            else if(s=='*'){
                operations.push(""+s);
            }
            else if(s=='-'){
                operations.push(""+s);
            }else if(s=='/'){
                operations.push(""+s);
            }
            else if(s==')'){

                String op = operations.pop();
                double v=values.pop();//nuevo

                if (op.equals("+")) {
                    values.push(values.pop()+v);
                }
                else if(op.equals("*")){
                    values.push(values.pop()*v);
                }
                else if(op.equals("-")){
                    values.push(values.pop()-v);
                }
                else if(op.equals("/")){
                    values.push(values.pop()/v);
                }
            }else{//números*/

                String prueba=display;

                try{

                    //funciona para números del 1000-9999)
                    if ((prueba.substring(i + 1, i + 2).equals("0") || prueba.substring(i + 1, i + 2).equals("1")||
                        prueba.substring(i+1, i+2).equals("2")||prueba.substring(i+1, i+2).equals("3")||
                        prueba.substring(i+1, i+2).equals("4")||prueba.substring(i+1, i+2).equals("5")||
                        prueba.substring(i+1, i+2).equals("6")||prueba.substring(i+1, i+2).equals("7")||
                        prueba.substring(i+1, i+2).equals("8")||prueba.substring(i+1, i+2).equals("9"))
                        &&(prueba.substring(i + 2, i + 3).equals("0") || prueba.substring(i + 2, i + 3).equals("1")||
                        prueba.substring(i+2, i+3).equals("2")||prueba.substring(i+2, i+3).equals("3")||
                        prueba.substring(i+2, i+3).equals("4")||prueba.substring(i+2, i+3).equals("5")||
                        prueba.substring(i+2, i+3).equals("6")||prueba.substring(i+2, i+3).equals("7")||
                        prueba.substring(i+2, i+3).equals("8")||prueba.substring(i+2, i+3).equals("9"))
                        &&(prueba.substring(i + 3, i + 4).equals("0") || prueba.substring(i + 3, i + 4).equals("1")||
                        prueba.substring(i+3, i+4).equals("2")||prueba.substring(i+3, i+4).equals("3")||
                        prueba.substring(i+3, i+4).equals("4")||prueba.substring(i+3, i+4).equals("5")||
                        prueba.substring(i+3, i+4).equals("6")||prueba.substring(i+3, i+4).equals("7")||
                        prueba.substring(i+3, i+4).equals("8")||prueba.substring(i+3, i+4).equals("9"))) {

                        //System.out.println(prueba.substring(i,i+4));
                        values.push(Double.parseDouble(prueba.substring(i, i+4)));
                        i++;
                        i++;
                        i++;

                    }
                    //para que funcione bien necesito que el penúltimo char sea un dígito, de ahí que uso un &&
                    //funciona para números del 100-999
                    else if((prueba.substring(i + 1, i + 2).equals("0") || prueba.substring(i + 1, i + 2).equals("1")
                            ||
                        prueba.substring(i+1, i+2).equals("2")||prueba.substring(i+1, i+2).equals("3")||
                        prueba.substring(i+1, i+2).equals("4")||prueba.substring(i+1, i+2).equals("5")||
                        prueba.substring(i+1, i+2).equals("6")||prueba.substring(i+1, i+2).equals("7")||
                        prueba.substring(i+1, i+2).equals("8")||prueba.substring(i+1, i+2).equals("9"))
                        &&(prueba.substring(i + 2, i + 3).equals("0") || prueba.substring(i + 2, i + 3).equals("1")||
                        prueba.substring(i+2, i+3).equals("2")||prueba.substring(i+2, i+3).equals("3")||
                        prueba.substring(i+2, i+3).equals("4")||prueba.substring(i+2, i+3).equals("5")||
                        prueba.substring(i+2, i+3).equals("6")||prueba.substring(i+2, i+3).equals("7")||
                        prueba.substring(i+2, i+3).equals("8")||prueba.substring(i+2, i+3).equals("9"))) {

                        //System.out.println(prueba.substring(i,i+3)); //te da un 100
                        values.push(Double.parseDouble(prueba.substring(i, i+3)));
                        i++;
                        i++;

                    }
                    //funciona para números del 0-99
                  else if (prueba.substring(i + 1, i + 2).equals("0") || prueba.substring(i + 1, i + 2).equals("1")||
                        prueba.substring(i+1, i+2).equals("2")||prueba.substring(i+1, i+2).equals("3")||
                        prueba.substring(i+1, i+2).equals("4")||prueba.substring(i+1, i+2).equals("5")||
                        prueba.substring(i+1, i+2).equals("6")||prueba.substring(i+1, i+2).equals("7")||
                        prueba.substring(i+1, i+2).equals("8")||prueba.substring(i+1, i+2).equals("9")) {

                        //System.out.println(prueba.substring(i,i+2)); //te da un 80
                        values.push(Double.parseDouble(prueba.substring(i, i+2)));
                        i++;//adelantas el arreglo para evitar el char

                   }
                    else if(prueba.substring(i, i + 1).equals("0") || prueba.substring(i, i + 1).equals("1")||
                        prueba.substring(i,i+1).equals("2")||prueba.substring(i,i+1).equals("3")||
                        prueba.substring(i,i+1).equals("4")||prueba.substring(i,i+1).equals("5")||
                        prueba.substring(i,i+1).equals("6")||prueba.substring(i,i+1).equals("7")||
                        prueba.substring(i,i+1).equals("8")||prueba.substring(i,i+1).equals("9")){

                        //System.out.println(prueba.substring(i,i+1));
                        values.push(Double.parseDouble(prueba.substring(i,i+1)));
                   }

                }catch(IndexOutOfBoundsException e){
                    System.out.println("Me pasé del arreglo");

                }

            }//   cierra el if
        }

        a=""+values.pop();
        
       }catch(Exception ex){
           System.out.println("No ingrese letras porfavor.");
       }
        return a;

      } //cierra el método
  }//cierra la clase
