package structural.adapter;

public class Main {
    public static void main(String[] args) {

        LecteurCSV lecteurCSV = new LecteurCSV("ventes.csv");

        AnalyseurVentes analyseur = new CSVAdapter(lecteurCSV);

        BurgerAnalytics analytics = new BurgerAnalytics(analyseur);

        analytics.genererRapport();
    }
}