package Human;

import Marki.Auto;
import Marki.Car;

public class Clients extends Human {
    private Auto autos[] = new Auto[100];

    public Clients(String name, int age) {
        super(name, age);
    }

    public void addautocl(Auto auto) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null) {
                autos[i] = auto;
                break;
            }


        }
    }

    //Вывод списка авто купленных авто клиента
    public void spisok() {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] != null) {
                if (autos[i] instanceof Car) {
                    System.out.println(i + "  " + ((Car) autos[i]).model);
                }
            }
        }
    }

    public Auto autoYach(int index) {
        return autos[index];
    }
}
