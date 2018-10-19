package printing_interface;
import printing.PaperTray;
import printing.Machine;

public class PrinterWithInterface<T extends ICartridge> implements IMachine {

        public String modelNumber;
        private PaperTray PaperTray = new PaperTray();
        private boolean isOn;
        private Machine machine;
        private T cartridge;


        public PrinterWithInterface(boolean isOn, String modelNumber,T cartridge){
            machine = new Machine(isOn);
            this.modelNumber=modelNumber;
            this.cartridge = cartridge;
        }

        public void print(int copies){

            checkCopies(copies);

            System.out.println(cartridge.getFillPercentage());

            String textToPrint = modelNumber;

            if(isOn()) {

                while(copies>0 && !PaperTray.isEmpty())
                {

                    PaperTray.usePage();
                    System.out.println(textToPrint);
                    copies--;
                }

                if (PaperTray.isEmpty())
                    System.out.println("Load more paper.");

            }else {

                System.out.println("You cannot print, the printer is turned off");
            }

        }

    private void checkCopies(int copies) {
        if (copies<0)
            throw new IllegalArgumentException("Can't print less than 0 copies");
    }

    public void printColors(){

            String [] colors = new String[] {"red","blue","green","yellow","purple","black"};

            //for each loop
            for (String currentColor: colors){

                if ("green".equals(currentColor))
                    continue;
                System.out.println(currentColor);

            }
        }

        public void print (String text){
            System.out.println(text);
        }

        public String getModelNumber(){
            return modelNumber;
        }

        public void loadPaper(int count){
            PaperTray.addPaper(count);
        }


        @Override
        public void turnOn(){
            System.out.println("Initializing the printer...");

            //composition in action with the machine class
            machine.turnOn();
        }

        @Override
        public void turnOff(){
            System.out.println("Turning off the printer...");
            isOn=false;
        }

        @Override
        public boolean isOn(){
            return machine.isOn();
        }

    //T and U mean that they are unbounded types.

    public <U extends ICartridge> void printUsingCartridge(U cartridge, String message)
    {
        System.out.println(cartridge.toString());
        System.out.println(message);
        System.out.println(cartridge.toString());
    }

}