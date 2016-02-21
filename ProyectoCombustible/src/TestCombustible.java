
public class TestCombustible {
    
    public static void main(String args[]){
        
        Magna cocheViejo = new Magna();
        Premium cocheNuevo = new Premium();
        Diesel camión = new Diesel();
        
        cocheViejo.setImporte(100);
        //System.out.println("valor"+cocheViejo.precio);
        System.out.println("Fueron un total de "+cocheViejo.calculaLitros()+" litros. ");
        System.out.println("El IEPS es de: "+cocheViejo.calculaIEPS());
        System.out.println("El subtotal es de: "+cocheViejo.calculaSubtotal());
        System.out.println("El IVA es de: "+cocheViejo.calculaIVA());
        System.out.println("El total es de: "+cocheViejo.total()+"\n");
        
        
        cocheNuevo.setImporte(100);
        System.out.println("Fueron un total de "+cocheNuevo.calculaLitros()+" litros. ");
        System.out.println("El IEPS es de: "+cocheNuevo.calculaIEPS());
        System.out.println("El subtotal es de: "+cocheNuevo.calculaSubtotal());
        System.out.println("El IVA es de: "+cocheNuevo.calculaIVA());
        System.out.println("El total es de: "+cocheNuevo.total()+"\n");
        
        cocheNuevo.setImporte(100);
        System.out.println("Fueron un total de "+cocheNuevo.calculaLitros()+" litros. ");
        System.out.println("El IEPS es de: "+cocheNuevo.calculaIEPS());
        System.out.println("El subtotal es de: "+cocheNuevo.calculaSubtotal());
        System.out.println("El IVA es de: "+cocheNuevo.calculaIVA());
        System.out.println("El total es de: "+cocheNuevo.total()+"\n");
        
        camión.setImporte(100);
        System.out.println("Fueron un total de "+camión.calculaLitros()+" litros. ");
        System.out.println("El IEPS es de: "+camión.calculaIEPS());
        System.out.println("El subtotal es de: "+camión.calculaSubtotal());
        System.out.println("El IVA es de: "+camión.calculaIVA());
        System.out.println("El total es de: "+camión.total());
        
    }
    
}
