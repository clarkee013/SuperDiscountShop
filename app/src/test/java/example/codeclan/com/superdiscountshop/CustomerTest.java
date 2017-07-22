package example.codeclan.com.superdiscountshop;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 21/07/2017.
 */

public class CustomerTest {

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
    public void getCustomerName() {
        assertEquals("David", customer.getName());
    }

    @Test
    public void setCustomerName() {
        customer.setName("Fee");
        assertEquals("Fee", customer.getName());
    }

    @Test
    public void getWallet() {
        assertEquals(100, customer.getWallet());
    }

    @Test
    public void setWallet() {
        customer.setWallet(5);
        assertEquals(5, customer.getWallet());
    }

    @Test
    public void getLoyaltyCard() {
        assertEquals(true, customer.getLoyaltyCard());
    }

    @Test
    public void setLoyaltyCard() {
        customer.setLoyaltyCard(false);
        assertEquals(false, customer.getLoyaltyCard());
    }

    @Test
    public void getBasketSize() {
        assertEquals(0, customer.getBasketSize());
    }

    @Test
    public void canEmptyBasket() {
        customer.addToBasket(applePie);
        customer.emptyBasket();
        assertEquals(0, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_applePie() {
        customer.addToBasket(applePie);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_carrots() {
        customer.addToBasket(carrots);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_cherryPie() {
        customer.addToBasket(cherryPie);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_chickenKorma() {
        customer.addToBasket(chickenKorma);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_chickenTikka() {
        customer.addToBasket(chickenTikka);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_edamCheese() {
        customer.addToBasket(edamCheese);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_fishPie() {
        customer.addToBasket(fishPie);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_lasagnaSheets() {
        customer.addToBasket(lasagnaSheets);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_mixedPeppers() {
        customer.addToBasket(mixedPeppers);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_naanBread() {
        customer.addToBasket(naanBread);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_redOnion() {
        customer.addToBasket(redOnion);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_shiitakeMushrooms() {
        customer.addToBasket(shiitakeMushrooms);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_spagBol() {
        customer.addToBasket(spaghettiBolognese);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_steakPie() {
        customer.addToBasket(steakPie);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void canAddToBasket_whiteBread() {
        customer.addToBasket(whiteBread);
        assertEquals(1, customer.getBasketSize());
    }

    @Test
    public void getBasketTotal_singleItem() {
        customer.addToBasket(whiteBread);
        assertEquals(1, customer.getBasketTotal());
    }

    @Test
    public void getBasketTotal_severalItems() {
        customer.addToBasket(whiteBread);
        customer.addToBasket(steakPie);
        customer.addToBasket(mixedPeppers);
        assertEquals(11, customer.getBasketTotal());
    }

    @Test
    public void removeFirstItemFromBasket() {
        customer.addToBasket(whiteBread);
        customer.addToBasket(steakPie);
        customer.addToBasket(mixedPeppers);
        customer.removeFirstItemFromBasket();
        assertEquals(2, customer.getBasketSize());
    }

    @Test
    public void getLastItemIndex() {
        customer.addToBasket(whiteBread);
        customer.addToBasket(steakPie);
        customer.addToBasket(mixedPeppers);
        customer.lastItemIndexInBasket();
        assertEquals(2, customer.lastItemIndexInBasket());
    }

    @Test
    public void removeLastItemFromBasket() {
        customer.addToBasket(whiteBread);
        customer.addToBasket(steakPie);
        customer.addToBasket(mixedPeppers);
        customer.removeLastItemFromBasket();
        assertEquals(2, customer.getBasketSize());
    }

    @Test
    public void getItemIndex() {
        customer.addToBasket(whiteBread);
        assertEquals(0, customer.getItemIndex(whiteBread));
    }

    @Test
    public void removeItemFromBasketByItemIndex() {
        customer.addToBasket(whiteBread);
        customer.removeItemFromBasketByItemIndex(whiteBread);
        assertEquals(0, customer.getBasketSize());
    }

    @Test
    public void removeItemFromBasketByName(){
        customer.addToBasket(whiteBread);
        customer.removeItemByName();
        assertEquals(1, customer.getBasketSize());
    }





}


