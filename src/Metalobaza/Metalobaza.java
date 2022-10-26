package Metalobaza;

import AutoSalon.Autosalon;
import Human.Clients;
import Marki.Auto;
import Marki.Car;

public class Metalobaza {
private int trubi = 1000;

    public boolean utilAuto(Auto auto,Autosalon autosalon, Clients clients) {
        System.out.println(((Car) auto).model + " util ");
        int summ = autosalon.priceAuto(auto) / 100 * 10;
        clients.setBalance(summ + clients.getBalance());
        return true;
    }
}
