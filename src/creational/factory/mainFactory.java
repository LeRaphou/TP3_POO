package creational.factory;

public class mainFactory {
    public static void main(String[] args) {
        Burger burger1 = BurgerFactory.creerBurger(BurgerType.VEGGIE);
        Burger burger2 = BurgerFactory.creerBurger(BurgerType.CHEESE);
        Burger burger3 = BurgerFactory.creerBurger(BurgerType.CHICKEN);

        System.out.println(burger1.getNom() + " : " + burger1.getDescription() + " - " + burger1.getPrix() + "€");
        System.out.println(burger2.getNom() + " : " + burger2.getDescription() + " - " + burger2.getPrix() + "€");
        System.out.println(burger3.getNom() + " : " + burger3.getDescription() + " - " + burger3.getPrix() + "€");
    }
}
