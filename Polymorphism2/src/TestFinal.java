
public class TestFinal {
    
    private final int dato;
    
    public void setDato(int dato){
 //no hace falta el set porque una variable de tipo final
        //sólo se inicializa una vez
    }
    public int getDato(){
        return dato;
    }
    
    TestFinal(){
        dato=90;
    }
    
    
    
}
