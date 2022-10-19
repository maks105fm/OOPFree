package menu;

import AutoSalon.Autosalon;
import Human.Clients;

import java.util.Scanner;

public class Menu {
    Autosalon autosalon = new Autosalon();
    Clients clients = new Clients("Имя1", 5);
    Scanner scanner = new Scanner(System.in);
    public void menu(){
        System.out.println("1 - Отправиться в автосалон");
        System.out.println("2 - Вывести список моих авто");
        String salon = scanner.nextLine();
        switch (salon){
            case "1" -> {autosalon.initauto();autosalon.shopauto(clients);}
            case "2" -> {clients.spisok(clients);} //Вывод списка авто клиента
            default -> menu();
        }
    }
}
