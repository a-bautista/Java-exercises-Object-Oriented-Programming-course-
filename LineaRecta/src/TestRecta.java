
public class TestRecta {

    public static void main(String args[]){
        Recta testRecta= new Recta();
        System.out.println(""+testRecta.calculaDistancia(-2,4,-2,-6));
       // System.out.println(""+testRecta.calculaPendiente(-2,-4,-2,-6));
        testRecta.calculaPendiente(-8,-9,87,-6);
        
       /* for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 10; j++) {
                
                for (int k = 0; k < 10; k++) {
                    
                    for (int l = 0; l < 10; l++) {
                        System.out.println(""+testRecta.calculaDistancia(i, j, k, l));
                        
                    }
                    System.out.println();
                }
            }
        }
        //haga un programa que me calcule la distancia de  los puntos
        // 0,0,0,0 hasta 9,9,9,9.*/
    }
}
