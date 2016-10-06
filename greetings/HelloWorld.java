package greetings;
import printing.Printer;
import printing_interface.BWcartridge;

import printing_interface.PrinterWithInterface;
import printing.Machine;
import printing_interface.ColorCartridge;
import printing_interface.ICartridge;


public class HelloWorld {

    public static void main(String args[]){

        Printer myPrinter   = new Printer(true,"My Printer");
        Printer yourPrinter = new Printer(false, "Your Printer");
        Machine machine     = new Printer (true,"My printer");
        Machine machine2    = new Machine (false);

        //IMachine iMachineImplement = new PrinterWithInterface(true,"InterfaceImplemented");
        PrinterWithInterface<BWcartridge> iMachineImplement = new PrinterWithInterface<BWcartridge>(true,"InterfaceImplemented",new BWcartridge());

        try{
            iMachineImplement.print(-1);

        }catch(IllegalArgumentException exception){

            System.out.println(exception.getMessage());
            return;

        }
        finally
        {
            iMachineImplement.turnOff();


        }


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

        //what are generic methods?
        //iMachineImplement.printUsingCartridge(new ColorCartridge(), "Hi!");
        iMachineImplement.print(3);

        //iMachineImplement.print(3);



    }
}
