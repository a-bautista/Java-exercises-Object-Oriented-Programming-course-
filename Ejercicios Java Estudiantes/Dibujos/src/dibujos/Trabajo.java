

package dibujos;

import java.awt.*;


public class Trabajo {

    public void dibujaTriangulo(Graphics areaDibujo, int inicio_x,
                                               int inicio_y,
                                               int anchura,
                                               int altura){



        areaDibujo.drawLine(inicio_x, inicio_y, inicio_x, inicio_y+altura);

        areaDibujo.drawLine(inicio_x, inicio_y+altura,inicio_x+anchura,inicio_y+altura);

        areaDibujo.drawLine(inicio_x, inicio_y, inicio_x+anchura, inicio_y+altura);


    }


    public int calculaareas(int x, int y){

        return ((x*y)/2);
    }


    public void dibujaCasa(Graphics areaDibujo,
                                       int inicio_x,
                                       int inicio_y,
                                       int ancho,
                                       int alto){

//triángulo equilátero= todos sus lados son iguales


        areaDibujo.drawLine(inicio_x, inicio_y, ancho-inicio_x, alto+inicio_y);
        areaDibujo.drawLine(ancho-inicio_x, alto+inicio_y, ancho+ancho, alto+inicio_y);
        areaDibujo.drawLine(ancho+ancho, alto+inicio_y, inicio_x, inicio_y);

        areaDibujo.drawLine(ancho-inicio_x, alto+inicio_y, ancho-inicio_x, alto);
        areaDibujo.drawLine(alto, alto, ancho+ancho, alto);
        areaDibujo.drawLine(ancho+ancho, alto, ancho+ancho, alto+alto);


    }


}
