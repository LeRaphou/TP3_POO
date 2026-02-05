package creational.factory;

public class ChickenBurger implements Burger {
    @Override
    public String getNom() {
        return "Chiken Burger";
    }

    @Override
    public String getDescription() {
        return " pain burger, poulet pané croustillant, sauce BBQ ";
    }

    @Override
    public double getPrix() {
        return 10;
    }
}