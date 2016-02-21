
/**
 *
 * @author alexbr
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ParteGrafica extends JFrame{
    
    private JButton uno, dos,tres, cuatro,cinco,
                    seis, siete, ocho, nueve, 
                    suma, resta, divide, producto,
                    punto, borrar, igualdad, enter, cero,
                    parentIzq, parentDer;
    private JTextField display;
    private JTextArea historial;
    private JFrame frame;
    private JPanel panel;
    private JScrollPane scroll;
    
    ParteGrafica(){
        
        uno       = new JButton("1");
        dos       = new JButton("2");
        tres      = new JButton("3");
        cuatro    = new JButton("4");
        cinco     = new JButton("5");
        seis      = new JButton("6");
        siete     = new JButton("7");
        ocho      = new JButton("8");
        nueve     = new JButton("9");
        cero      = new JButton("0");
        igualdad  = new JButton("=");
        borrar    = new JButton("Borrar");
        suma      = new JButton("+");
        resta     = new JButton("-");
        divide    = new JButton("/");
        producto  = new JButton("*");
        punto     = new JButton(".");
        enter     = new JButton("ENT");
        parentIzq = new JButton("(");
        parentDer = new JButton(")");
        
        display   = new JTextField(20);
        historial = new JTextArea(8,15);
        frame     = new JFrame("Calculadora");
        panel     = new JPanel();
        
        scroll    = new JScrollPane(historial);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        uno.addActionListener(new Eventos());
        dos.addActionListener(new Eventos());
        tres.addActionListener(new Eventos());
        cuatro.addActionListener(new Eventos());
        cinco.addActionListener(new Eventos());
        seis.addActionListener(new Eventos());
        siete.addActionListener(new Eventos());
        ocho.addActionListener(new Eventos());
        nueve.addActionListener(new Eventos());
        cero.addActionListener(new Eventos());
        suma.addActionListener(new Eventos());
        resta.addActionListener(new Eventos());
        divide.addActionListener(new Eventos());
        producto.addActionListener(new Eventos());
        igualdad.addActionListener(new Eventos());
        punto.addActionListener(new Eventos());
        borrar.addActionListener(new Eventos());
        enter.addActionListener(new Eventos());
        parentIzq.addActionListener(new Eventos());
        parentDer.addActionListener(new Eventos());
      
        panel.add(display);
        panel.add(uno);
        panel.add(dos);
        panel.add(tres);
        panel.add(cuatro);
        panel.add(cinco);
        panel.add(seis);
        panel.add(siete);
        panel.add(ocho);
        panel.add(nueve);
        panel.add(cero);
        panel.add(suma);
        panel.add(resta);
        panel.add(divide);
        panel.add(producto);
        panel.add(borrar);
        panel.add(punto);
        panel.add(igualdad);
        panel.add(enter);
        panel.add(parentIzq);
        panel.add(parentDer);
        panel.add(scroll);
        
        frame.setLayout(new BorderLayout());
        frame.setContentPane(panel);
        frame.setSize(330,360);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
    }

    
     public class Eventos implements ActionListener{

        public void actionPerformed(ActionEvent click){
            
            ParteResuelve solve= new ParteResuelve();


            if (click.getSource()==uno) {     
                display.setText(display.getText()+"1");
            }
            if (click.getSource()==dos) {
                display.setText(display.getText()+"2");
            }
            if (click.getSource()==tres) {
                display.setText(display.getText()+"3");
            }
            if (click.getSource()==cuatro) {
                display.setText(display.getText()+"4");
            }
            if (click.getSource()==cinco) {
                display.setText(display.getText()+"5");
            }
            if (click.getSource()==seis) {
                display.setText(display.getText()+"6");
            }
            if (click.getSource()==siete) {
                display.setText(display.getText()+"7");
            }
            if (click.getSource()==ocho) {
                display.setText(display.getText()+"8");
            }
            if (click.getSource()==nueve) {
                display.setText(display.getText()+"9");
            }
            if (click.getSource()==cero) {
                display.setText(display.getText()+"0");
            }
            if (click.getSource()==suma) {
                display.setText(display.getText()+"+");
            }
            if (click.getSource()==resta) {
                display.setText(display.getText()+"-");
            }
            if (click.getSource()==producto) {
                display.setText(display.getText()+"*");
            }
            if (click.getSource()==divide) {
                display.setText(display.getText()+"/");
            }
            if (click.getSource()==punto) {
                display.setText(display.getText()+".");
            }
            if (click.getSource()==parentIzq) {
                display.setText(display.getText()+"(");
            }
            if (click.getSource()==parentDer) {
                display.setText(display.getText()+")");
            }
            
            if (click.getSource()==igualdad) {
                display.setText(display.getText()+"=");
            }
            if (click.getSource()==enter) { //código


                historial.setText(historial.getText()+display.getText()+"\n");
                display.setText(solve.getDisplay(display.getText()));
                
                
            }
            if (click.getSource()==borrar) { //código
                if (display.getText().length()!=0) {
                    display.setText(display.getText().substring(0, display.getText().length()-1));
                }
            }
            
        }
      }
      

    public static void main(String args[]){
        ParteGrafica inicio= new ParteGrafica();

    }
}
