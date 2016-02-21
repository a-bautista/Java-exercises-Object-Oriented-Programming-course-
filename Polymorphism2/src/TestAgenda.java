
public class TestAgenda {
    
    public static void main(String args[]){
        Agenda a1= new Agenda();
        Agenda a2= new Agenda("Alex","3743289");
        Agenda a3= new Agenda("Alex","3743289");
        
        System.out.println(" A1 dice: "+a1.getCounter());
        System.out.println(" A2 dice: "+a2.getCounter());
        System.out.println(" A2 dice: "+a3.getCounter());
    }
}
