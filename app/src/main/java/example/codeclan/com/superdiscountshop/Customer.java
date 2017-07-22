package example.codeclan.com.superdiscountshop;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class Customer extends Human {

    private ArrayList<Item> basket;
    private int wallet;
    private boolean loyaltyCard;
    Item item;


    public Customer(String name, int wallet, boolean loyaltyCard) {
        super(name);
        this.basket = new ArrayList<Item>();
        this.wallet = wallet;
        this.loyaltyCard = loyaltyCard;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public boolean getLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }

    public int getBasketSize() {
        return basket.size();
    }

    public void addToBasket(Item item) {
        basket.add(item);
    }

    public void emptyBasket() {
        basket.clear();
    }

    public int getBasketTotal() {
        int total = 0;
        for (Item item : basket) {
            total += item.getPrice();
        }
        return total;
    }

    public void removeFirstItemFromBasket() {
        basket.remove(0);
    }

    public int lastItemIndexInBasket() {
        return (getBasketSize() - 1);
    }

    public void removeLastItemFromBasket() {
        basket.remove(lastItemIndexInBasket());
    }

    public int getItemIndex(Item item) {
        return basket.indexOf(item);
    }

    public void removeItemFromBasketByItemIndex(Item item) {
        basket.remove(getItemIndex(item));
    }

    public void removeItemByName() {
        basket.remove(item);
    }


}


