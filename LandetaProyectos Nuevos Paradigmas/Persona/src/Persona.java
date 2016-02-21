
/**
 *
 * @author alexbr
 */
public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){

        nombre = "";
        apellido = "";
        edad = 0;

    }

    public void setEdad(int edad){
        this.edad=edad;
    }

    public int getEdad(){
        return edad;
    }


    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getApellido(){
        return apellido;
    }

   
}
