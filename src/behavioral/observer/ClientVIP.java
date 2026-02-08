package behavioral.observer;

public class ClientVIP {

    private String nom;

    public ClientVIP(String nom) {
        this.nom = nom;
    }

    public void notifier(Promotion promotion) {
        System.out.println(
                "Client VIP " + nom + " notifié : " + promotion.getDescription()
        );
    }
}