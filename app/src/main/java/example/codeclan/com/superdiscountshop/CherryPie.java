package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class CherryPie implements Items {
    private int price = 4;
    private String name = "Cheery Pie";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
