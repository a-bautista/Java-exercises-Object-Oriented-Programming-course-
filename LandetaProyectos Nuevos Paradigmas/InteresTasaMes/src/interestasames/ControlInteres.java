/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interestasames;


public class ControlInteres {

    public static void main(String args[]){

        InteresTasaMes c = new InteresTasaMes();
        InteresTasaMes d = new InteresTasaMes();

        d.setMeses(10);
        d.setTasa(10);
        d.setImporte(100);
       
       double edgar [];
       edgar = d.CalculoImporte();

       for (int i =0; i<edgar.length; i++){
           System.out.println("Mes: "+i+ "= $" +edgar[i]);
       }

    }
}
