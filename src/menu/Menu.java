package menu;

import AutoSalon.Autosalon;
import Human.Clients;
import Marki.Auto;
import Marki.Car;
import Metal.Trubi;
import Metalobaza.Metalobaza;

import java.util.Scanner;

public class Menu {
    Autosalon autosalon = new Autosalon();
    Clients clients = new Clients("Имя1", 5);
    Scanner scanner = new Scanner(System.in);
    Metalobaza metalobaza = new Metalobaza();
    Trubi trubi = new Trubi();

    public void glavMenu() {
        autosalon.initauto();
        menu();
    }

    public void menu() {
        System.out.println("\n1 - Отправиться в автосалон");
        System.out.println("2 - Вывести список моих авто");
        System.out.println("3 - Отправить авто на метал");
        System.out.println("\nВаш баланс " + clients.getBalance());


        String salon = scanner.nextLine();
        switch (salon) {
            case "1" -> {
                autosalon.shopauto(clients);
                menu();
            }
            case "2" -> {
                clients.spisok();
                menu();
            } //Вывод списка авто клиента
            case "3" -> {
                goToMetal();
                menu();
            } //Вывод списка авто клиента
            default -> menu();
        }
    }

    public void goToMetal() {


        clients.spisok();
        int indexAuto = Integer.parseInt(scanner.nextLine());
        Car car = clients.autoYach(indexAuto);
        metalobaza.nametal(car, clients);

            //тут надо у клиента вызвать метод который очистит ячейку в масииве
        }
    }

