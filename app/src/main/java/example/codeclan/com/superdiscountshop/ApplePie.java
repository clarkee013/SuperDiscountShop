package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class ApplePie implements Item {
    private int price = 5;
    private String name = "Apple Pie";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
