
public class ChemistryStudent extends Student {
    
    private int reactionCounter;
    
    ChemistryStudent(){
        super();
        reactionCounter=0;
    }
    
    ChemistryStudent(String name, String skills, int reactionCounter){
        super(name,skills);
        this.reactionCounter=reactionCounter;
    }//this method cannot be viewed by Student class 
    
    
    public String DoReaction(){
        reactionCounter++;
        return super.getName()+" did "+reactionCounter+" reactions.";
    }
    
    public String vacio(){
        return "Vacío";
    }
   
    @Override
    public String Activity(){
        return super.getName()+"Chemistry"+super.Activity();
    }


    
}
