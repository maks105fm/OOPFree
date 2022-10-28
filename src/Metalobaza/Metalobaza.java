package Metalobaza;

import AutoSalon.Autosalon;
import Human.Clients;
import Marki.Auto;
import Marki.BMW;
import Marki.Car;
import menu.Metal;
import Metal.Trubi;

public class Metalobaza {
private int trubi = 1000;
private int metal = 0;
private int cenakg = 20;



    public void nametal(Metal metal,Clients clients) {
        int summ = metal.getMassa() * cenakg;
        clients.setBalance(summ + clients.getBalance());
        this.metal += metal.getMassa();
    }

}
