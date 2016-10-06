package printing;

public class Printer extends Machine {

    public String modelNumber;
    private PaperTray PaperTray = new PaperTray();

    public Printer(boolean isOn, String modelNumber){

        //you call the constructor parent with the super keyword
        super(isOn);
        this.modelNumber=modelNumber;
    }

    public void print(int copies){

        String textToPrint = modelNumber;

        if(isOn) {

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

    //Polymorphism
    @Override
    public void turnOn(){
        System.out.println("Initializing the printer...");
        super.turnOn();
    }

}
