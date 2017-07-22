package example.codeclan.com.superdiscountshop;

import java.util.ArrayList;

/**
 * Created by user on 21/07/2017.
 */

public class ShopKeeper extends Human {

    private int till;
    Customer customer;
    Item item;


    public ShopKeeper(String name, int till) {
        super(name);
        this.till = till;
    }

    public int getTillTotal() {
        return till;
    }

    public void setTillTotal(int till) {
        this.till = till;
    }


    public int getCustomerBasketTotal(Customer customer) {
        return customer.getBasketTotal();
    }

//      possible 10% dicsount calculation
//    public double checkFor10PercentDiscount(Customer customer) {
//        if (getCustomerBasketTotal(customer) > 20){
//             return (getCustomerBasketTotal(customer) - (getCustomerBasketTotal(customer)/100)*10);
//
//        }
//        return getCustomerBasketTotal(customer);
//    }
}
