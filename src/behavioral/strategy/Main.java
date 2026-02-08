package behavioral.strategy;

public class Main {
    public static void main(String[] args) {

        Commande commande1 = new Commande(new LivraisonStandard());
        Commande commande2 = new Commande(new LivraisonExpress());
        Commande commande3 = new Commande(new ClickAndCollect());

        commande1.effectuerLivraison();
        commande2.effectuerLivraison();
        commande3.effectuerLivraison();
    }
}
