package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class FishPie implements Items {
    private int price = 6;

    @Override
    public int getPrice() {
        return price;
    }
}
