import java.text.DecimalFormat;

public class Circle {

    private double radius;
    DecimalFormat decFormat = new DecimalFormat("000.000");
    
    Circle(){
        radius=0;
        }
    Circle(double radius){
        this.radius=radius;
        }
  
    public void setRadius(double radius) {
       
       this.radius=radius;
    }
    
    public double getRadius(){
         return radius;   
    }

    public final String Calculate() {
        return ""+decFormat.format(Math.PI*Math.pow(radius, 2));
    }
           
}
