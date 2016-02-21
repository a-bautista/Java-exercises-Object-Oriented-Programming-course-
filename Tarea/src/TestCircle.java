
public class TestCircle {

    public static void main(String [] args){
        Circle prueba= new Circle();
        Sphere pruebaS = new Sphere();
        
        prueba.setRadius(34.53);
        pruebaS.setRadius(5);
      
        System.out.println(prueba.getRadius());
        System.out.println(prueba.Calculate());
        System.out.println(pruebaS.getRadius());
        
        System.out.println(pruebaS.CalculateVolume());
        
    }
}
