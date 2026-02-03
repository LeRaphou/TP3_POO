package creational;

public class MainCreational {
    public static void main(String[] args) {
        Sandwich sandwich = new SandwichBuilder()
                .withBread("complet")
                .withCheese(true)
                .withTomato(false)
                .withSalad(true)
                .build();


        System.out.println("Pain : " + sandwich.getBread());
        System.out.println("Fromage : " + sandwich.hasCheese());
        System.out.println("Tomate : " + sandwich.hasTomato());
        System.out.println("Salade : " + sandwich.hasSalad());
    }
}
