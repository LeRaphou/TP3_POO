package behavioral.strategy;

public class Commande {

    private StrategieLivraison strategieLivraison;

    public Commande(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    public void changerStrategie(StrategieLivraison strategieLivraison) {
        this.strategieLivraison = strategieLivraison;
    }

    public void effectuerLivraison() {
        strategieLivraison.livrer();
    }
}
