package menu;

import AutoSalon.Autosalon;
import Human.Clients;
import Marki.Auto;
import Marki.Car;
import Metalobaza.Metalobaza;

import java.util.Scanner;

public class Menu {
    Autosalon autosalon = new Autosalon();
    Clients clients = new Clients("Имя1", 5);
    Scanner scanner = new Scanner(System.in);
    Metalobaza metalobaza = new Metalobaza();

    public void glavMenu(){
        autosalon.initauto();
        menu();
    }

    public void menu(){


        System.out.println("1 - Отправиться в автосалон");
        System.out.println("2 - Вывести список моих авто");
        System.out.println();
        System.out.println("3 - Баланс клиента: " + clients.getBalance());
        System.out.println("4 - Отправиться на металобазу");

        String salon = scanner.nextLine();
        switch (salon){
            case "1" -> {autosalon.shopauto(clients);menu();}
            case "2" -> {clients.spisok(); menu();} //Вывод списка авто клиента
            case "4" -> {goToMetal();} //Вывод списка авто клиента
            default -> menu();
        }
    }

    public void goToMetal(){
        clients.spisok();
        int indexAuto = Integer.parseInt(scanner.nextLine());
        Auto auto = clients.autoYach(indexAuto);
        metalobaza.utilAuto(auto);
    }



}
