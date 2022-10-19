package AutoSalon;

import Human.Clients;
import Marki.*;
import menu.Menu;

import java.util.Scanner;

public class Autosalon {
    Menu menu = new Menu();
    Scanner scanner = new Scanner(System.in);
    Auto autos[] = new Auto[10];

    public void shopauto(Clients clients) {

        System.out.println("1 BMW - 100000$");
        System.out.println("2 Mersedes - 150000$");
        System.out.println("3 Pejo - 50000$");
        System.out.println("4 WV - 75000$");
        String vibor = scanner.nextLine();
        switch (vibor) {
            case "1" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof BMW) {
                        clients.addautocl(autos[i]);
                    }
                }
                clients.setBalance(clients.getBalance() - 100000);
                System.out.println("Вы приобрели BMW");
                System.out.println("С Вас списано - 100 000$");
                menu.menu();
            }
            case "2" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof Mercedes) {
                        clients.addautocl(autos[i]);
                    }
                }
                clients.setBalance(clients.getBalance() - 150000);
                System.out.println("Вы приобрели Mercedes");
                System.out.println("С Вас списано - 150 000$");
                menu.menu();
            }
            case "3" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof Pejo) {
                        clients.addautocl(autos[i]);
                    }
                }
                clients.setBalance(clients.getBalance() - 50000);
                System.out.println("Вы приобрели WV");
                System.out.println("С Вас списано - 75 000$");
                menu.menu();
            }
            case "4" -> {
                for (int i = 0; i < autos.length; i++) {
                    if (autos[i] instanceof WV) {
                        clients.addautocl(autos[i]);
                    }
                }
                clients.setBalance(clients.getBalance() - 75000);
                System.out.println("Вы приобрели WV");
                System.out.println("С Вас списано - 75 000$");
                menu.menu();
            }
            default -> shopauto(clients);
        }
    }


    public void initauto() {
        autos[0] = new BMW();
        autos[1] = new BMW();
        autos[2] = new BMW();
        autos[3] = new BMW();
        autos[4] = new Mercedes();
        autos[5] = new Pejo();
        autos[6] = new Pejo();
        autos[7] = new Pejo();
        autos[8] = new WV();
        autos[9] = new WV();

    }
}
