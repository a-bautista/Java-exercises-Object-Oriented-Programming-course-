public class Detection {
    
    public String getLetter(String curpD){
        if (curpD.equals("")) {
            return "Curp vacío";
        }else if(curpD.length()<10){
            return"No se puede poner una Curp menor a 10";
        }     
        
        if (curpD.charAt(9)=='M') {
           // System.out.println("Your are a woman!");
            return "Eres mujer";
        }else if(curpD.charAt(9)=='H'){
            //System.out.println("Your are a man!");
            return "Eres hombre";
        }else{
           // System.out.println("I cannot detect your sex. I'm sorry. ");
            return "No válido";
        }
    }   
}
