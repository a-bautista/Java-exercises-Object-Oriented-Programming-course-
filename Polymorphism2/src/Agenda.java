
public class Agenda {
    private String name;
    private String phone;
    //private int counter;
    public static int counter=0; //esta variable la van a ver todas las clases
    //que usaron esta variable. 
    
    
    Agenda(){
        name="";
        phone="";
        counter=0;
    }
    
    Agenda(String name, String phone){
        this.name=name;
        this.phone=phone;
        counter++;
    }
    
   public int getCounter(){
       return counter;
   }
}
