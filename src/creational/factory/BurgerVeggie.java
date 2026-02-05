package creational.factory;

public class BurgerVeggie implements Burger {
    @Override
    public String getNom() {
        return "Burger Veggie";
    }

    @Override
    public String getDescription() {
        return " pain complet, salade, tomate, carotte ";
    }

    @Override
    public double getPrix() {
        return 8;
    }
}