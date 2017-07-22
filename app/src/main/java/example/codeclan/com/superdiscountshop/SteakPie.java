package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class SteakPie implements Item {
    private int price = 8;
    private String name = "Steak Pie";

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String getName(){
        return name;
    }

}
