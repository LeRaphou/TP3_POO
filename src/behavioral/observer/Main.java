package behavioral.observer;
public class Main {
    public static void main(String[] args) {

        BurgerFastRestaurant restaurant = new BurgerFastRestaurant();

        ClientVIP alice = new ClientVIP("Alice");
        ClientVIP bob = new ClientVIP("Bob");

        restaurant.ajouterClient(alice);
        restaurant.ajouterClient(bob);

        Promotion promoFlash = new Promotion("1 menu acheté = 1 offert !");
        restaurant.creerPromotionFlash(promoFlash);
    }
}
