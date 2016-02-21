
public class TestAlumno {
    
    public static void main(String args[]){
        
    Alumno test= new Alumno("Alejandro","8","5","6");
    //Alumno calif[][]= new Alumno [50][4]; //rows * numbers
    Alumno [] calif2= new Alumno [50]; 
    
        for (int i = 0; i < calif2.length; i++) {
            
            calif2[i]= new Alumno("","","","");   
            /*required java.lang.String and found String
              no había declarado el arreglo como tipo Alumno*/
        }
       calif2[0].setName("Joe");
       calif2[0].setFirstQuiz("6.6");
       calif2[0].setSecondQuiz("7");
       calif2[0].setthirdQuiz("10");
        
    System.out.println(""+test.average());
    }
}
