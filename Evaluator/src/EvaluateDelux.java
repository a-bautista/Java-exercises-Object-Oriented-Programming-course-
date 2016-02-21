import java.util.TreeMap;
import java.util.*;
import java.io.*;

public class EvaluateDelux {

    // result of applying binary operator op to two operands val1 and val2
    public static double eval(String op, double val1, double val2) {
        if (op.equals("+")) return val1 + val2;
        if (op.equals("-")) return val1 - val2;
        if (op.equals("/")) return val1 / val2;
        if (op.equals("*")) return val1 * val2;
        throw new RuntimeException("Invalid operator");
    }

    public static void main(String[] args) {

        // precedence order of operators
        TreeMap<String, Integer> precedence = new TreeMap<String, Integer>();
        precedence.put("(", 0);   // for convenience with algorithm
        precedence.put(")", 0);  
        precedence.put("+", 1);   // + and - have lower precedence than * and /
        precedence.put("-", 1);
        precedence.put("*", 2);
        precedence.put("/", 2);

        Stack<String> ops  = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();

       
        try{
            File myFile = new File("/JavaPrueba copy.txt");
            FileReader fileReader = new FileReader(myFile);
            
            BufferedReader reader = new BufferedReader(fileReader);
            
            String line=null;
        
        while ((line=reader.readLine())!=null) {
            
            // read in next token (operator or value)
            String s = reader.readLine();

            // token is a value
            if (!precedence.containsKey(s)) {
                vals.push(Double.parseDouble(s));
                continue;
            }//close if
          
        
            // token is an operator
            while (true) {

                // the last condition ensures that the operator with higher precedence is evaluated first
                if (ops.isEmpty() || s.equals("(") || (precedence.get(s) > precedence.get(ops.peek()))) {
                    ops.push(s);
                    break;
                }//close if

                // evaluate expression
                String op = ops.pop();

                // but ignore left parentheses
                if (op.equals("(")) {
                    assert s.equals(")");
                    break;
                }//close if

                // evaluate operator and two operands and push result onto value stack
                else {
                    double val2 = vals.pop();
                    double val1 = vals.pop();
                    vals.push(eval(op, val1, val2));
                }//close else
              }//close inner while
            }//close outer while
          }catch(Exception ex){
          System.out.println(" "+ex.toString());
        }//close catch
      

        // finished parsing string - evaluate operator and operands remaining on two stacks
        while (!ops.isEmpty()) {
            String op = ops.pop();
            double val2 = vals.pop();
            double val1 = vals.pop();
            vals.push(eval(op, val1, val2));
        }//close while

        // last value on stack is value of expression
        System.out.println(vals.pop());
        assert vals.isEmpty();
        assert ops.isEmpty();
    }//close main
  }//close class
 
