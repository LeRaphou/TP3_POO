package creational.factory;

public class CheeseBurger implements Burger {
    @Override
    public String getNom() {
        return "Cheese Burger";
    }

    @Override
    public String getDescription() {
        return " pain sesame, steak haché, cheddar fondu ";
    }

    @Override
    public double getPrix() {
        return 10;
    }
}


