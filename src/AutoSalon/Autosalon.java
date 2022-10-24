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
    Auto autos[] = new Auto[100];


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


//        switch (vibor) {
//            case "1" -> {
//                for (int i = 0; i < autos.length; i++) {
//                    if (autos[i] instanceof BMW) { //
//                        clients.addautocl(autos[i]);
//                        autos[i] = null;
//                        break;
//                    }
//                }
//                clients.setBalance(clients.getBalance() - 100000);
//                System.out.println("Вы приобрели BMW");
//                System.out.println("С Вас списано - 100 000$");
//
//            }
//            case "2" -> {
//                for (int i = 0; i < autos.length; i++) {
//                    if (autos[i] instanceof Mercedes) {
//                        clients.addautocl(autos[i]);
//                        autos[i] = null;
//                        break;
//                    }
//                }
//                clients.setBalance(clients.getBalance() - 150000);
//                System.out.println("Вы приобрели Mercedes");
//                System.out.println("С Вас списано - 150 000$");
//
//            }
//            case "3" -> {
//                for (int i = 0; i < autos.length; i++) {
//                    if (autos[i] instanceof Pejo) {
//                        clients.addautocl(autos[i]);
//                        autos[i] = null;
//                        break;
//                    }
//                }
//                clients.setBalance(clients.getBalance() - 50000);
//                System.out.println("Вы приобрели Pejo");
//                System.out.println("С Вас списано - 75 000$");
//
//            }
//            case "4" -> {
//                for (int i = 0; i < autos.length; i++) {
//                    if (autos[i] instanceof WV) {
//                        clients.addautocl(autos[i]);
//                        autos[i] = null;
//                        break;
//                    }
//                }
//                clients.setBalance(clients.getBalance() - 75000);
//                System.out.println("Вы приобрели WV");
//                System.out.println("С Вас списано - 75 000$");
//
//            }
//            default -> shopauto(clients);
//        }
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
