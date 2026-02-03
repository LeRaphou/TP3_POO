package creational.builder;

public class MainCreational {
    public static void main(String[] args) {
        Sandwich sandwich = new SandwichBuilder()
                .withBread("complet")
                .withMeat("steak")
                .withCheese("cheddar")
                .withTomato("no")
                .withSalad("yes")
                .withSauce("andalouse")
                .withGrill("saignant")
                .build();


        System.out.println("Pain : " + sandwich.getBread());
        System.out.println("Viande : " + sandwich.getMeat());
        System.out.println("Sauce : " + sandwich.getSauce());
        System.out.println("Cuisson : " + sandwich.getGrill());
        System.out.println("Fromage : " + sandwich.getCheese());
        System.out.println("Tomate : " + sandwich.getTomato());
        System.out.println("Salade : " + sandwich.getSalad());
        System.out.println("-----------------------------------------");


        Sandwich sandwich2 = new SandwichBuilder()
                .withBread("baguette")
                .withMeat("poulet")
                .withCheese("camambert")
                .withTomato("no")
                .withSalad("yes")
                .withSauce("algérienne")
                .withGrill("frie")
                .build();

        System.out.println("Pain : " + sandwich2.getBread());
        System.out.println("Viande : " + sandwich2.getMeat());
        System.out.println("Sauce : " + sandwich2.getSauce());
        System.out.println("Cuisson : " + sandwich2.getGrill());
        System.out.println("Fromage : " + sandwich2.getCheese());
        System.out.println("Tomate : " + sandwich2.getTomato());
        System.out.println("Salade : " + sandwich2.getSalad());
        System.out.println("-----------------------------------------");



        Sandwich sandwich3 = new SandwichBuilder()
                .withBread("Pain de mie")
                .withMeat("saumon")
                .withCheese("Madame Loic")
                .withTomato("no")
                .withSalad("yes")
                .withSauce("Mayo")
                .withGrill("no")
                .build();

        System.out.println("Pain : " + sandwich3.getBread());
        System.out.println("Viande : " + sandwich3.getMeat());
        System.out.println("Sauce : " + sandwich3.getSauce());
        System.out.println("Cuisson : " + sandwich3.getGrill());
        System.out.println("Fromage : " + sandwich3.getCheese());
        System.out.println("Tomate : " + sandwich3.getTomato());
        System.out.println("Salade : " + sandwich3.getSalad());
        System.out.println("-----------------------------------------");
    }
}
