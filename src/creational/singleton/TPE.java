package creational.singleton;

public class TPE {
    private static volatile TPE instance;
    private double chiffreAffairesJournalier;
    private double chiffreAffairesTotal;
    private int numeroJournee;

    private TPE() {
        this.chiffreAffairesJournalier = 0.0;
        this.chiffreAffairesTotal = 0.0;
        this.numeroJournee = 1;
        System.out.println("TPE initialisé - Journée " + numeroJournee);
    }

    public static TPE getInstance() {
        if (instance == null) {
            synchronized (TPE.class) {
                if (instance == null) {
                    instance = new TPE();
                }
            }
        }
        return instance;
    }

    public synchronized void enregistrerPaiement(String caissier, double montant) {
        chiffreAffairesJournalier += montant;
        chiffreAffairesTotal += montant;
        System.out.println(caissier + " a enregistré un paiement de " + montant + "€");
    }

    public double getChiffreAffairesJournalier() {
        return chiffreAffairesJournalier;
    }

    public double getChiffreAffairesTotal() {
        return chiffreAffairesTotal;
    }

    public void afficherBilanJournee() {
        System.out.println("\n=== Bilan Journée " + numeroJournee + " ===");
        System.out.println("Chiffre d'affaires du jour : " + chiffreAffairesJournalier + "€");
        System.out.println("Chiffre d'affaires total : " + chiffreAffairesTotal + "€");
        System.out.println("========================\n");
    }

    public void journeeSuivante() {
        numeroJournee++;
        chiffreAffairesJournalier = 0.0;
        System.out.println("Passage à la journée " + numeroJournee + "\n");
    }
}
