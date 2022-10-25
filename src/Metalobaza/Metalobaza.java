package Metalobaza;

import Human.Clients;
import Marki.Auto;
import Marki.Car;

public class Metalobaza {

    public boolean utilAuto(Auto auto) {
        System.out.println(((Car) auto).model + " util ");
        return true;
    }
}
