package structural.adapter;

import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {

    private LecteurCSV lecteurCSV;

    public CSVAdapter(LecteurCSV lecteurCSV) {
        this.lecteurCSV = lecteurCSV;
    }

    @Override
    public double getTotalVentes() {
        double total = 0.0;

        for (int i = 1; i < lecteurCSV.getNbLignes(); i++) { // skip header
            String[] colonnes = lecteurCSV.getColonnes(i);
            String[] prixQuantite = colonnes[2].split("x");

            double prix = Double.parseDouble(prixQuantite[0]);
            int quantite = Integer.parseInt(prixQuantite[1].trim());

            total += prix * quantite;
        }

        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteurCSV.getNbLignes() - 1; // sans l’en-tête
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> caParProduit = new HashMap<>();

        for (int i = 1; i < lecteurCSV.getNbLignes(); i++) {
            String[] colonnes = lecteurCSV.getColonnes(i);

            String produit = colonnes[1];
            String[] prixQuantite = colonnes[2].split("x");

            double prix = Double.parseDouble(prixQuantite[0]);
            int quantite = Integer.parseInt(prixQuantite[1].trim());

            double ca = prix * quantite;
            caParProduit.put(produit, caParProduit.getOrDefault(produit, 0.0) + ca);
        }

        return caParProduit;
    }
}