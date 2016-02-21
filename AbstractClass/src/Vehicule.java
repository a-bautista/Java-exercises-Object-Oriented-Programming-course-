
public abstract class Vehicule {

    private int cylinder;

    Vehicule() {
        cylinder = 0;
    }

    Vehicule(int cylinder) {
        this.cylinder = cylinder;
    }

    public abstract double performance();

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
