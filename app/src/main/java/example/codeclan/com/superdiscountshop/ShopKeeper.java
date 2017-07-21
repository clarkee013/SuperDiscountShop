package example.codeclan.com.superdiscountshop;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class ShopKeeper extends Human {

    private int till;

    public ShopKeeper(String name, int till){
        super(name);
        this.till = till;
    }

    public int getTillTotal() {
        return till;
    }

    public void setTillTotal(int till) {
        this.till = till;
    }
}



