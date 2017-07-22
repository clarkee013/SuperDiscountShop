package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class NaanBread implements Item {
    private int price = 1;
    private String name = "Naan Bread";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
