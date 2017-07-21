package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class ChickenKorma implements Items {
    private int price = 6;
    private String name = "Chicken Korma";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
