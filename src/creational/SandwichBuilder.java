package creational;

public class SandwichBuilder {

    String bread;
    boolean cheese;
    boolean tomato;
    boolean salad;

    public SandwichBuilder withBread(String bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder withCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder withTomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public SandwichBuilder withSalad(boolean salad) {
        this.salad = salad;
        return this;
    }

    public Sandwich build() {
        if (bread == null || bread.isEmpty()) {
            throw new IllegalStateException("Le pain est obligatoire");
        }
        return new Sandwich(this);
    }
}
