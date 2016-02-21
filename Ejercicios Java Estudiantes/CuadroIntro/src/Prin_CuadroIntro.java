//Ejercicio de introducción 01


public class Prin_CuadroIntro {

    public static void main (String[] args){

    CuadroIntro marco = new CuadroIntro(); //instanciar una clase

    marco.setSize(300,200);

    marco.createGUI(); //esto ya es un método (createGUI) que se creó para el objeto marco

    marco.setVisible(true); //objeto con su método ya por default

   }
}
