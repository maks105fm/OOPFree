package AutoSalon;

import Human.Clients;
import Marki.*;

import java.util.Scanner;

public class Autosalon {
    private final int PRICEMERCEDES = 150000;
    private final int PRICEBMW = 150000;
    private final int PRICEPEJO = 150000;
    private final int PRICEWV = 150000;

    Scanner scanner = new Scanner(System.in);
    Car autos[] = new Car[100];


    public void shopauto(Clients clients) {

        //вывести массив авто с салона и сделать проверку если это бмв то цена выодится 100000 и тд
        System.out.println("Укажите номер авто: ");
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] instanceof Car) {
                System.out.println(i + " " + ((Car) autos[i]).model + " - " + priceAuto(autos[i]) + "$");
            }
        }
        int vibor = Integer.parseInt(scanner.nextLine());

        clients.addautocl(autos[vibor]);
        System.out.println(" Вы приобрели " + ((Car) autos[(vibor)]).model);
        clients.setBalance(clients.getBalance() - priceAuto(autos[vibor]));
        autos[vibor] = null;
    }


    public void initauto() {
        int m = 0;

        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null & m < 30) {
                autos[i] = new Mercedes("Mercedes");
                m++;
            }
        }
        m = 0;

        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null & m < 20) {
                autos[i] = new BMW("BMW");
                m++;
            }
        }
        m = 0;

        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null & m < 4) {
                autos[i] = new WV("WV");
                m++;
            }
        }
        m = 0;

        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null & m < 7) {
                autos[i] = new Pejo("Pejo");
                m++;
            }
        }
    }

    public int priceAuto(Auto car) {
        if (car instanceof Mercedes) {
            return PRICEMERCEDES;
        } else if (car instanceof BMW) {
            return PRICEBMW;
        } else if (car instanceof WV) {
            return PRICEWV;
        } else if (car instanceof Pejo) {
            return PRICEPEJO;
        } else {
            return 0;
        }

    }
}
