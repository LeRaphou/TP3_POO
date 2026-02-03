package creational;

public class Sandwich {
    private final String bread;
    private final boolean cheese;
    private final boolean tomato;
    private final boolean salad;

    public Sandwich(SandwichBuilder builder){
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.salad = builder.salad;

    }

    public String getBread() { return bread; }
    public boolean hasCheese() { return cheese; }
    public boolean hasTomato() { return tomato; }
    public boolean hasSalad() { return salad; }

}
