// Ejercicio de introducción 01

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CuadroIntro extends JFrame {

    private JTextField textfield;


public void createGUI() {

    setDefaultCloseOperation(EXIT_ON_CLOSE);

    Container ventana = getContentPane();

    ventana.setLayout(new FlowLayout ());

    textfield = new JTextField("¡¡¡Hola!!!");

    ventana.add(textfield);

  }

}
