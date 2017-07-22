package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class FishPie implements Item {
    private int price = 6;
    private String name = "Fish Pie";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
