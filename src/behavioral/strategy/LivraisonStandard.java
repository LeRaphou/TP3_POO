package behavioral.strategy;

public class LivraisonStandard implements StrategieLivraison {

    @Override
    public void livrer() {
        System.out.println("Livraison standard sous 45 minutes");
    }
}