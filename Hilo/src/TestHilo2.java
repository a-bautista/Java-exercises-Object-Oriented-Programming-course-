
public class TestHilo2 {
    
    public static void main(String args[]){
        testHilo h0= new testHilo();
        h0.t1.start();
        h0.t2.start();
        try{
            h0.t1.join(); //quien esté corriendo en ese momento lo saca y deja correr el otro proceso
            //y hasta que acabe, vuelve a dejar correr el proceso que estaba antes. 
        }catch(Exception e){
            System.out.println("error"+e.toString());
        }
        
        System.out.println("finished");
    }
}
