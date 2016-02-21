/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dibujos;

/**
 *
 * @author alexbr
 */
public class Main {

    public static void main(String[] args) {

        DibujaT triangulo = new DibujaT();

        triangulo.createGUI();
        triangulo.setSize(600,700);
        triangulo.setVisible(true);
        
    }

}
