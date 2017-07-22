package example.codeclan.com.superdiscountshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class ShopKeeperTest {

    ShopKeeper shopKeeper;
    Customer customer;
    Item item;
    ApplePie applePie;
    Carrots carrots;
    CherryPie cherryPie;
    ChickenKorma chickenKorma;
    ChickenTikka chickenTikka;
    EdamCheese edamCheese;
    FishPie fishPie;
    LasagnaSheets lasagnaSheets;
    MixedPeppers mixedPeppers;
    NaanBread naanBread;
    RedOnion redOnion;
    ShiitakeMushrooms shiitakeMushrooms;
    SpaghettiBolognese spaghettiBolognese;
    SteakPie steakPie;
    WhiteBread whiteBread;
    ArrayList<Item> basket;


    @Before
    public void before() {
        shopKeeper = new ShopKeeper("Ricky", 0);
        customer = new Customer("David", 100, true);
        applePie = new ApplePie();
        carrots = new Carrots();
        cherryPie = new CherryPie();
        chickenKorma = new ChickenKorma();
        chickenTikka = new ChickenTikka();
        edamCheese = new EdamCheese();
        fishPie = new FishPie();
        lasagnaSheets = new LasagnaSheets();
        mixedPeppers = new MixedPeppers();
        naanBread = new NaanBread();
        redOnion = new RedOnion();
        shiitakeMushrooms = new ShiitakeMushrooms();
        spaghettiBolognese = new SpaghettiBolognese();
        steakPie = new SteakPie();
        whiteBread = new WhiteBread();
        basket = new ArrayList<>();

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


    @Test
    public void canGetCustomerBasketTotal(){
        customer.addToBasket(whiteBread);
        customer.getBasketTotal();
        assertEquals(1, shopKeeper.getCustomerBasketTotal(customer));
    }



}
