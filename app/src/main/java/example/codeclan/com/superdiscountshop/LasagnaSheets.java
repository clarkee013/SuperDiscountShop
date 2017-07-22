package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public class LasagnaSheets implements Item {
    private int price = 3;
    private String name = "Lasagna Sheets";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName(){
        return name;
    }
}
