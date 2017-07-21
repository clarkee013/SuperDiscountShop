package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class ChickenTikka implements Items {
    private int price = 8;
    private String name = "Chicken Tikka";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
