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
  /*
   * Ejemplos de operaciones
   *
        ((9+2)*((9*8)+1))=803
        (((9+2)*(9*8))+1)=793
        ((8+9)+((8*9)+1))=90
        ((7/7)-((1+1)*(2+1)))=-5
        ((8*2)+(20*20))-(16)/(10)=40
        (15*15)/(5)+(4)/(7)+(1)*(8)=64
        (((600/60)+(39*100))-10)=3900
        ((((80+90)+12)/10)+(70+90))=178.2
        ((10+9)+(19-90))/(52)=-1
        ((801+10+1))=812
        (((1000+5700)/(100)*(2+(7*9)/7)))/((10-20)*(40+70)))=-0.67
        ((70+7)/(11)+(80-800)/(10))+(1)/(8)=-8
   */
        for (int i = 0; i < separa.length; i++) {
            
            //System.out.println("no");
            
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
                   
                    //get2=Double.parseDouble(prueba.substring(i+1,i+2));//esto es cero

                    
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

                        System.out.println(prueba.substring(i,i+4)); 
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

                        System.out.println(prueba.substring(i,i+3)); //te da un 100
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

                        System.out.println(prueba.substring(i,i+2)); //te da un 80
                        values.push(Double.parseDouble(prueba.substring(i, i+2)));
                        i++;//adelantas el arreglo para evitar el char
                    
                   }
                    else if(prueba.substring(i, i + 1).equals("0") || prueba.substring(i, i + 1).equals("1")||
                        prueba.substring(i,i+1).equals("2")||prueba.substring(i,i+1).equals("3")||
                        prueba.substring(i,i+1).equals("4")||prueba.substring(i,i+1).equals("5")||
                        prueba.substring(i,i+1).equals("6")||prueba.substring(i,i+1).equals("7")||
                        prueba.substring(i,i+1).equals("8")||prueba.substring(i,i+1).equals("9")){

                        System.out.println(prueba.substring(i,i+1));
                        values.push(Double.parseDouble(prueba.substring(i,i+1)));
                   }
                                           
                }catch(IndexOutOfBoundsException e){
                    System.out.println("Me pasé del arreglo");

                }
                
            }//   cierra el if
        }

        a=""+values.pop();
        System.out.println(a);
       }catch(Exception ex){
           System.out.println("No ingrese letras porfavor.");
       }
        return a;
      
      } //cierra el método   
  }//cierra la clase
//((1000+5700)/(100)*(2+(7*9)/7)))