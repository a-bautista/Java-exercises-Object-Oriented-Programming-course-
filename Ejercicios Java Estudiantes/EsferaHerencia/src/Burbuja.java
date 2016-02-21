

/**
 *
 * @author alexbr
 */
import java.awt.*;

public class Burbuja extends EsferaHerencia {
    
    protected int radio = 10;
    
    public void setTamaño(int tamaño){
        
        radio = tamaño;
    }
    
    public void mostrar(Graphics papel){ /*Este método redefine al método EsferaHerencia
                                          * cambiando algunos valores
                                          */
        
        papel.drawOval(x, y, 2, radio);
    }


}
