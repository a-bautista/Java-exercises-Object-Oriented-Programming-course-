
package fichadepago;

 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.event.*;
 import javax.swing.*;

public class TestGridLayout extends JFrame {

    public static void main(String args[]) {

        //Grid_layout objeto = new Grid_layout();
        //objeto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GRidbaglayout objeto2 = new GRidbaglayout();
       
        //objeto2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PlantillaNumeros iu = new PlantillaNumeros();
        iu.setImporte(200.00);
        System.out.println(iu.importeCondensado());

    }

}
