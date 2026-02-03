package creational;

public class Sandwich {
    private final String bread;
    private final String cheese;
    private final String tomato;
    private final String salad;
    private final String sauce;
    private final String grill;
    private final String meat;

    public Sandwich(SandwichBuilder builder){
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.tomato = builder.tomato;
        this.salad = builder.salad;
        this.sauce = builder.sauce;
        this.grill = builder.grill;
        this.meat = builder.meat;

    }

    public String getBread() { return bread; }
    public String getCheese() { return cheese; }
    public String getTomato() { return tomato; }
    public String getSalad() { return salad; }
    public String getSauce(){return sauce;}
    public String getGrill(){return grill;}
    public String getMeat(){return meat;}

}
