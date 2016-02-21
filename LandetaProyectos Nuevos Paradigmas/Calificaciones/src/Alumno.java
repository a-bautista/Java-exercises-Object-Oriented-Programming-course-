import java.util.ArrayList;
import java.text.DecimalFormat;

public class Alumno {
    
    DecimalFormat decForm= new DecimalFormat("#0.0");
    private String name, firstQuiz, secondQuiz, thirdQuiz;
    
    Alumno(){
        name="";
        firstQuiz="";
        secondQuiz="";
        thirdQuiz="";
    }
    Alumno(String name, String firstQuiz, String secondQuiz, String thirdQuiz){
        this.name=name;
        this.firstQuiz=firstQuiz;
        this.secondQuiz=secondQuiz;
        this.thirdQuiz=thirdQuiz;
    }
    
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setFirstQuiz(String firstQuiz){
        this.firstQuiz=firstQuiz;
    }
    
    public String getFirstQuiz(){
        return firstQuiz;
    }
    
    public void setSecondQuiz(String secondQuiz){
        this.secondQuiz=secondQuiz;
    }
    
    public String getSecondQuiz(){
        return secondQuiz;
    }
    
   public void setthirdQuiz(String thirdQuiz){
        this.thirdQuiz=thirdQuiz;
    }
    
    public String getthirdQuiz(){
        return thirdQuiz;
    }
    
    
    public String average(){
        
        double average=((Double.parseDouble(firstQuiz)*20)+(Double.parseDouble(secondQuiz)*30)+
                        (Double.parseDouble(thirdQuiz)*50))/100;
        
        return ""+decForm.format(average);
        
    }
     
}
