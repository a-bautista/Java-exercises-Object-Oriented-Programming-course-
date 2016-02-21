
import java.awt.*;

public class Alberca {

    public void linea_arriba(Graphics papel){

        papel.drawLine(50, 60, 150, 60);

    }

      public void linea_izquierda(Graphics papel, int slider1){

          papel.drawLine(50, 60, 50, 60+slider1);
    }

        public void linea_derecha(Graphics papel, int slider2){

            papel.drawLine(150, 60, 150, 60+slider2);
    }

      public void linea_abajo(Graphics papel, int slider1, int slider2){

          papel.drawLine(50, 60+slider1, 150, 60+slider2);

      }

}
