package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {

    private List<ClientVIP> clientsVIP = new ArrayList<>();

    public void ajouterClient(ClientVIP client) {
        clientsVIP.add(client);
    }

    public void retirerClient(ClientVIP client) {
        clientsVIP.remove(client);
    }

    public void creerPromotionFlash(Promotion promotion) {
        System.out.println("🔥 Promotion flash BurgerFast !");
        notifierClients(promotion);
    }

    private void notifierClients(Promotion promotion) {
        for (ClientVIP client : clientsVIP) {
            client.notifier(promotion);
        }
    }
}