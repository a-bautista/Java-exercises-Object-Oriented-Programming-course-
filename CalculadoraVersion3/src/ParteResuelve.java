import java.util.*;
/**
 *
 * @author alexbr
 */
public class ParteResuelve {

        Stack<String> operations = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        String b="";
        boolean stop=true;
        int j=0, k=1, contadorGeneral=0;

    public String getDisplay(String display){

      try{
          
        char[] separa = display.toCharArray();

        for (int i = 0; i < separa.length; i++) {
           
            char s= separa[i];
            if (s=='(') { }
            
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
                double v=values.pop();

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
                stop=true;
               
                try{
                    
                    while(stop){
                        
                        b= b+prueba.substring(i+j, i+k);
                         j++; k++; contadorGeneral++;
                         
                            if (b.endsWith("+") || b.endsWith("-") || 
                                b.endsWith("*") || b.endsWith("/")
                               || b.endsWith("(")|| b.endsWith(")")) {
                                
                                b=b.substring(0, k-2);             
                                contadorGeneral=contadorGeneral-2;
                                i=contadorGeneral;
                                values.push(Double.parseDouble(b));
                                stop=false; 
                                k=1;
                                j=0;
                                b="";                   
                            }                      
                    }
//((4066144.51/(1+0.13688))
                }catch(IndexOutOfBoundsException e){
                   
                    return "No ingrese letras porfavor";
                }

            }//   cierra el if
            contadorGeneral++;
        }//cierra el for
           
           
       }catch(Exception ex){
           
           return "No ingrese letras porfavor.";
       }

        return ""+values.pop();

      } //cierra el método
  }//cierra la clase
