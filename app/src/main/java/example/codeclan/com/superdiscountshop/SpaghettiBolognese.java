package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class SpaghettiBolognese implements Item {
    private int price = 9;
    private String name = "Spaghetti Bolognese";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}

