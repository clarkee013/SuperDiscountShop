package example.codeclan.com.superdiscountshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class ShopKeeperTest {

    ShopKeeper shopKeeper;
    Customer customer;

    @Before
    public void before() {
        shopKeeper = new ShopKeeper("Ricky", 0);
    }

    @Test
    public void getName(){
        shopKeeper.getName();
    }

    @Test
    public void setName(){
        shopKeeper.setName("Alison");
        assertEquals("Alison", shopKeeper.getName());
    }

    @Test
    public void getTillTotal(){
        assertEquals(0, shopKeeper.getTillTotal());
    }

    @Test
    public void setTillTotal(){
        shopKeeper.setTillTotal(5);
        assertEquals(5, shopKeeper.getTillTotal());
    }

}
