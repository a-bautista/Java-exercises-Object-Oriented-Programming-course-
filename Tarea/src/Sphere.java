import java.text.DecimalFormat;

public class Sphere extends Circle{

    DecimalFormat decFormat1 = new DecimalFormat("0000.0000");
    
    Sphere(double radius){
        super(radius);
    }
    
    Sphere(){
        super.setRadius(0);
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public String CalculateVolume(){
        return ""+decFormat1.format((Math.PI*Math.pow(super.getRadius(), 3))*4/3);                
    }
   
}
