
public class Truck extends Vehicule {

 
    @Override
    public double performance() {
        return super.getCylinder();    
    }
    
    Truck(int cylinder){
        super(cylinder);
    }
    
    
}
