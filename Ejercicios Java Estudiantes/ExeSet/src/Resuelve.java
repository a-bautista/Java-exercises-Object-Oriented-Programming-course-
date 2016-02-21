

//MÉTODOS QUE LLAMAN A OTROS MÉTODOS

public class Resuelve {

    public int primerPaso(int x, int y, int z){

        return horas(x)+minutos(y)+segundos(z);
    }

    public int horas(int hours){
       return hours*3600 ;
    }

    public int minutos(int minutes){
        return minutes*60 ;
    }

    public int segundos (int seconds){
        return seconds;
    }

}
