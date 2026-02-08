package structural.facade;

public class CommandeValidation{

    private validationServices validationService;
    private paiementServices paiementService;
    private preparationServices preparationService;
    private livraisonServices livraisonService;

    public CommandeValidation() {
        this.validationService = new validationServices();
        this.paiementService = new paiementServices();
        this.preparationService = new preparationServices();
        this.livraisonService = new livraisonServices();
    }

    public void passerCommande() {
        System.out.println("=== Début commande BurgerFast ===");

        if (validationService.validerCommande()) {
            paiementService.traiterPaiement();
            preparationService.preparerCommande();
            livraisonService.lancerLivraison();
        }

        System.out.println("=== Commande terminée ===");
    }
}