package behavioral.strategy;

public class LivraisonExpress implements StrategieLivraison {

    @Override
    public void livrer() {
        System.out.println("Livraison express sous 15 minutes");
    }
}