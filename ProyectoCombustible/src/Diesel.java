
public class Diesel extends Combustible {

    public static double precio = 10.90;
    final double valorIEPS = 0.2988;

    @Override
    public double calculaIVA() {
        return (calculaSubtotal() * otroIVA);
    }

    @Override
    public double calculaLitros() {
        return (super.getImporte() / precio);
    }

    @Override
    public double calculaIEPS() {
        return (calculaLitros() * valorIEPS);
    }

    @Override
    public double total() {
        return calculaSubtotal() + calculaIVA() + calculaIEPS();
    }

    @Override
    public double calculaSubtotal() {
        return (super.getImporte() - calculaIEPS()) / IVA;
    }
}
