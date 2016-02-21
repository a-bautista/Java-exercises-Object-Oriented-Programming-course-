
public class TestVehicule {

    public static void main(String args[]){
        Truck t= new Truck(10);
        System.out.println(" "+t.performance());
    }
    
}
/*Proyecto
 * Todo gráfico
 * tipo de combustible (magna a 10.54,diesel 10.90, premium 11.11)
 * importe ¿cuánto compraste?
 * concepto IEPS por cada litro que compras de un combustible se multiplica por .36, .0024 y por .0028
 * compraste 1000 pesos que divides por el precio de gasolina (número de litros) y lo multiplicas por 
 * alguna cantidad de combustible (0.36 o 0.0024 y 0.0028)
 * el iva =16%
 * regresar el total = iva+subtotal+ieps
 * 
 * herencia, métodos abstractos, final, polimorfismo (arreglo de combustible con concepto de heterogeneidad,static)
 * Compré 500 litros de magna
 * un total de 47.43 litros (500/10.54)
 * IEPS=47.43*.36=17.07
 * 500-17.07=482.93 (necesario para calcular el subtotal)
 * subtotal=482.93/1.16=416.31
 * iva=416.31+17.07-500=62.68
 */
