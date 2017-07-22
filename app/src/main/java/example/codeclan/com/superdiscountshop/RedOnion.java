package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class RedOnion implements Item {
    private int price = 2;
    private String name = "Red Onion";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
