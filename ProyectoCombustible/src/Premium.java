
public class Premium extends Combustible {

    public static double precio = 11.11;
    final double valorIEPS = 0.4392;

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
