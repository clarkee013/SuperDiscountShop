package example.codeclan.com.superdiscountshop;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class Customer extends Human {

    private ArrayList<Items> basket;
    private int wallet;
    private boolean loyaltyCard;


    public Customer(String name, int wallet, boolean loyaltyCard){
        super(name);
        this.basket = new ArrayList<Items>();
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

    public void addToBasket(Items items){
        basket.add(items);
    }

    public void emptyBasket() {
        basket.clear();
    }

    public int getBasketTotal() {
        int total = 0;
        for (Items items : basket){
            total += items.getPrice();
        }
        return total;
    }

    public void removeFirstItemFromBasket() {
        basket.remove(0);
    }

    public int lastItemIndexInBasket() {
        return (getBasketSize()-1);
    }

    public void removeLastItemFromBasket() {
        basket.remove(lastItemIndexInBasket());
    }
}

// TODO get remove item from basket by name completed.
