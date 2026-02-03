package creational;

public class SandwichBuilder {

    String bread;
    String cheese;
    String tomato;
    String salad;
    String sauce;
    String grill;
    String meat;

    public SandwichBuilder withBread(String bread) {
        this.bread = bread;
        return this;
    }

    public SandwichBuilder withCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    public SandwichBuilder withTomato(String tomato) {
        this.tomato = tomato;
        return this;
    }

    public SandwichBuilder withSalad(String salad) {
        this.salad = salad;
        return this;
    }

    public SandwichBuilder withSauce(String sauce){
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder withGrill(String grill){
        this.grill = grill;
        return this;
    }

    public SandwichBuilder withMeat(String meat){
        this.meat = meat;
        return this;
    }

    public Sandwich build() {
        if (bread == null || bread.isEmpty()) {
            throw new IllegalStateException("Le pain est obligatoire");
        }
        return new Sandwich(this);
    }
}
