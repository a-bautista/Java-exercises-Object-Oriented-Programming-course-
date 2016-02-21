
public abstract class Combustible {
    
    private double importe;
    public final static double IVA=1.16;
    public final static double otroIVA=0.16;
    
    public abstract double calculaIVA();
    public abstract double calculaLitros();
    public abstract double calculaSubtotal();
    public abstract double calculaIEPS();
    public abstract double total();
    
    public void setImporte(double importe){
        this.importe=importe;
    }
    
    public double getImporte(){
        return importe;
    }
    
}
