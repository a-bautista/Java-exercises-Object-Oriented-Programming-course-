//Clase principal

public class Principal_clase02 {


    public static void main(String[] args){

        Clase02 marco = new Clase02(); //instanciar la clase con marco
        marco.createGUI();              /*Se llama al método que creará toda la ventana
                                         * del objeto marco. createGUI es la función
                                         * que desempeña el objeto marco.
                                         */
        marco.setSize(500,500);
        marco.setVisible(true);

    }
}
