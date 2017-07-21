package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class MixedPeppers implements Items {
    private int price = 2;

    @Override
    public int getPrice() {
        return price;
    }
}
