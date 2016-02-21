
/**
 *
 * @author alexbr
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ParteGrafica extends JFrame {
    
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
    String y="";
    
    
    public ParteGrafica(){
        
 
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
        historial = new JTextArea(10,20);
        frame     = new JFrame("Calculadora");
        panel     = new JPanel();
        scroll    = new JScrollPane(historial);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        uno.addActionListener(new ParteGrafica.Eventos());
        dos.addActionListener(new ParteGrafica.Eventos());
        tres.addActionListener(new ParteGrafica.Eventos());
        cuatro.addActionListener(new ParteGrafica.Eventos());
        cinco.addActionListener(new ParteGrafica.Eventos());
        seis.addActionListener(new ParteGrafica.Eventos());
        siete.addActionListener(new ParteGrafica.Eventos());
        ocho.addActionListener(new ParteGrafica.Eventos());
        nueve.addActionListener(new ParteGrafica.Eventos());
        cero.addActionListener(new ParteGrafica.Eventos());
        suma.addActionListener(new ParteGrafica.Eventos());
        resta.addActionListener(new ParteGrafica.Eventos());
        divide.addActionListener(new ParteGrafica.Eventos());
        producto.addActionListener(new ParteGrafica.Eventos());
        igualdad.addActionListener(new ParteGrafica.Eventos());
        punto.addActionListener(new ParteGrafica.Eventos());
        borrar.addActionListener(new ParteGrafica.Eventos());
        enter.addActionListener(new ParteGrafica.Eventos());
        parentIzq.addActionListener(new ParteGrafica.Eventos());
        parentDer.addActionListener(new ParteGrafica.Eventos());
        
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
                

                if(display.getText().equals("")){                    
                    
                    display.setText("No ingresó valor alguno");

                }else if((display.getText().endsWith("1") ||display.getText().endsWith("2")
                        ||display.getText().endsWith("3")||display.getText().endsWith("4")
                        ||display.getText().endsWith("4")||display.getText().endsWith("5")
                        ||display.getText().endsWith("6")||display.getText().endsWith("7")
                        ||display.getText().endsWith("8")||display.getText().endsWith("9")
                        ||display.getText().endsWith("0")||display.getText().endsWith("."))
                        && (display.getText().startsWith("0")||display.getText().startsWith("1")||
                        display.getText().startsWith("2")||display.getText().startsWith("3")||
                        display.getText().startsWith("4")||display.getText().startsWith("5")||
                        display.getText().startsWith("6")||display.getText().startsWith("7")||
                        display.getText().startsWith("8")||display.getText().startsWith("9")||
                        display.getText().startsWith("."))){
                
                        display.setText(display.getText());
                        
                }else if(display.getText().endsWith("+")||display.getText().endsWith("-")
                        ||display.getText().endsWith("/")||display.getText().endsWith("*")){
                
                        display.setText("Verifique su expresión");
                }
                
                else{
                
                    display.setText(solve.getDisplay(display.getText()));
                }
              
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