package example.codeclan.com.superdiscountshop;

/**
 * Created by user on 21/07/2017.
 */

public abstract class Human {

    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}