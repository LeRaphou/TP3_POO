package behavioral.strategy;

public class ClickAndCollect implements StrategieLivraison {

    @Override
    public void livrer() {
        System.out.println("Commande prête au comptoir (Click & Collect)");
    }
}
