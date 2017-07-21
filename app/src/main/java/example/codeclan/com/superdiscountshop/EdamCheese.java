package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class EdamCheese implements Items {
    private int price = 3;

    @Override
    public int getPrice() {
        return price;
    }
}

// TODO get name property and name getter into each food item.
