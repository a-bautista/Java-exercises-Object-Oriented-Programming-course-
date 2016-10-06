package greetings;
import printing.Printer;
import printing_interface.IMachine;
import printing_interface.PrinterWithInterface;
import printing.Machine;

public class HelloWorld {

    public static void main(String args[]){

        Printer myPrinter   = new Printer(false,"My Printer");
        Printer yourPrinter = new Printer(false, "Your Printer");
        Machine machine     = new Printer (true,"My printer");
        Machine machine2    = new Machine (false);

        IMachine iMachineImplement = new PrinterWithInterface(true,"InterfaceImplemented");
        /*
        ========Basic simulation of the Printer class=======

        myPrinter.modelNumber= "12345ABC";
        yourPrinter.modelNumber = "09876ZXY";
        myPrinter.turnOn();
        myPrinter.loadPaper(6);

        myPrinter.print(3);
        //myPrinter.printColors();
        myPrinter.turnOff();
        myPrinter.print(2);
        myPrinter.turnOn();
        myPrinter.print(3);

        */

        //machine.turnOn();
        //machine2.turnOn();


        iMachineImplement.turnOn();




    }
}
