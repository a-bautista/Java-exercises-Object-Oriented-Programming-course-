package printing_interface;

public class BWcartridge implements ICartridge {

    @Override
    public String toString(){

        return "Black!";
    }

    public String getFillPercentage(){

        return "97%";

    }
}
