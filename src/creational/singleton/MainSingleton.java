package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        TPE tpeCaissier1 = TPE.getInstance();
        TPE tpeCaissier2 = TPE.getInstance();
        TPE tpeCaissier3 = TPE.getInstance();

        System.out.println("Même instance ? " + (tpeCaissier1 == tpeCaissier2 && tpeCaissier2 == tpeCaissier3));
        System.out.println();

        System.out.println("--- JOURNÉE 1 ---");
        tpeCaissier1.enregistrerPaiement("Caissier 1", 25.50);
        tpeCaissier2.enregistrerPaiement("Caissier 2", 18.90);
        tpeCaissier3.enregistrerPaiement("Caissier 3", 32.00);
        tpeCaissier1.enregistrerPaiement("Caissier 1", 15.50);
        tpeCaissier2.enregistrerPaiement("Caissier 2", 22.40);

        tpeCaissier1.afficherBilanJournee();

        tpeCaissier1.journeeSuivante();

        System.out.println("--- JOURNÉE 2 ---");
        tpeCaissier3.enregistrerPaiement("Caissier 3", 45.00);
        tpeCaissier1.enregistrerPaiement("Caissier 1", 28.50);
        tpeCaissier2.enregistrerPaiement("Caissier 2", 19.90);

        tpeCaissier2.afficherBilanJournee();

        tpeCaissier3.journeeSuivante();

        System.out.println("--- JOURNÉE 3 ---");
        tpeCaissier2.enregistrerPaiement("Caissier 2", 35.60);
        tpeCaissier3.enregistrerPaiement("Caissier 3", 41.20);

        tpeCaissier3.afficherBilanJournee();
    }
}
