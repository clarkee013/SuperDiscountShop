package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class EdamCheese implements Item {
    private int price = 3;
    private String name = "Edam Cheese";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}

