
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexbr
 */
public class ControlCuadro {

    public static void main (String[] args){ //echa andar el programa

      Cuadro marco = new Cuadro();

      marco.setSize(400,300);

      marco.createGUI();

      marco.setVisible(true);

      marco.setBackground(Color.red);

      
    }

}
