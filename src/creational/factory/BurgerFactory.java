package creational.factory;

public class BurgerFactory {
    public static Burger creerBurger(BurgerType type) {
        switch (type) {
            case VEGGIE:
                return new BurgerVeggie();
            case CHEESE:
                return new CheeseBurger();
            case CHICKEN:
                return new ChickenBurger();
            default:
                throw new IllegalArgumentException("Type de burger inconnu");
        }
    }
}

