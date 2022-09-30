package cz.martin;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Random;

@Named("user")
@RequestScoped
public class User {

    private int favouriteNumber = 0;
    private int age;
    public String getName() {
        return "Martin";
    }

    public String[] features() {
        return new String[]{"a", "b", "c"};
    }

    public void setAge() {
        this.age = new Random().nextInt(100);
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }

    public void setFavouriteNumber(int favouriteNumber) {
        this.favouriteNumber = favouriteNumber;
    }

    public int getAge() {
        return age;
    }
}
