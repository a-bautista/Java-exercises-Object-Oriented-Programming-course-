

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;


public class Clase14Sep {

    public Clase14Sep(){

    }

    public void Fecha1(Date fecha){

        SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");

        System.out.println("fecha="+sdf.format(fecha.getTime()));


    }

    public void Fecha2(Calendar fecha){

        Calendar f;

        f = fecha;

        f.add(f.DATE,40);

        System.out.println(f.toString());

    }



}
