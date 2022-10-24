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
    Auto autos[] = new Auto[10];


    public void shopauto(Clients clients) {

        //вывести массив авто с салона и сделать проверку если это бмв то цена выодится 100000 и тд
        System.out.println("Укажите номер авто: ");
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] instanceof Car) {
                System.out.println(i + " " + ((Car) autos[i]).model + " - " + priceAuto(autos[i]) + "$");
            }
        }
        String vibor = scanner.nextLine();

        clients.addautocl(autos[Integer.parseInt(vibor)]);
        System.out.println(" вы преобрели " + ((Car) autos[Integer.parseInt(vibor)]).model);
        autos[Integer.parseInt(vibor)] = null;


        switch (vibor) {
            case "1" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof BMW) { //
                        clients.addautocl(autos[i]);
                        autos[i] = null;
                    }
                }
                clients.setBalance(clients.getBalance() - 100000);

                System.out.println("С Вас списано - 100 000$");

            }
            case "2" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof Mercedes) {
                        clients.addautocl(autos[i]);
                        autos[i] = null;
                    }
                }
                clients.setBalance(clients.getBalance() - 150000);
                System.out.println("Вы приобрели Mercedes");
                System.out.println("С Вас списано - 150 000$");

            }
            case "3" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof Pejo) {
                        clients.addautocl(autos[i]);
                        autos[i] = null;
                    }
                }
                clients.setBalance(clients.getBalance() - 50000);
                System.out.println("Вы приобрели WV");
                System.out.println("С Вас списано - 75 000$");

            }
            case "4" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof WV) {
                        clients.addautocl(autos[i]);
                        autos[i] = null;
                    }
                }
                clients.setBalance(clients.getBalance() - 75000);
                System.out.println("Вы приобрели WV");
                System.out.println("С Вас списано - 75 000$");

            }
            default -> shopauto(clients);
        }
    }


    public void initauto() {
        //аполнить массив автосалона 20 бмв 30 мерсов 4 фв 15 пежо
        autos[0] = new BMW("BMW");
        autos[1] = new BMW("BMW");
        autos[2] = new BMW("BMW");
        autos[3] = new BMW("BMW");
        autos[4] = new Mercedes("Mersedes");
        autos[5] = new Pejo("Pejo");
        autos[6] = new Pejo("Pejo");
        autos[7] = new Pejo("Pejo");
        autos[8] = new WV("WV");
        autos[9] = new WV("WV");

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
          return  0;
        }

    }
}
