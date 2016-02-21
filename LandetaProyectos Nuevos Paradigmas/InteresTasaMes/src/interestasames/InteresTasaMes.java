//código en clase de Roberto

package interestasames;

public class InteresTasaMes {


    private int meses;
    private double importe, tasa;


    public void InteresTasaMesa(){
       tasa = 0;
       importe = 0;
       meses = 0;
    }


    public void calculoInteres(int meses, double tasa, double importe){
        this.meses = meses;
        this.tasa = tasa;
        this.importe = importe;
    }



    public void setMeses(int meses){
        this.meses = meses;
    }


    public int getMeses(){

        return meses;
    }

    public void setTasa(double tasa){
        this.tasa = tasa;
    }

    public double getTasa(){
        return tasa;
    }

    public void setImporte(double importe){
        this.importe = importe;
    }

    public double getImporte(){
        return importe;
    }


    public double [] CalculoImporte(){

        double luis;
        double ci [] = new double [meses];

        luis = importe*tasa*0.1;

        for (int i=1;i<meses ;i++  ){

            ci [i] = ci[i-1]+luis ;

        }

        return ci;
    }

}
