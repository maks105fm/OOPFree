package Human;

import Marki.Auto;
import Marki.Car;

public class Clients extends Human {
    private Car autos[] = new Car[100];

    public Clients(String name, int age) {
        super(name, age);
    }



    public void addautocl(Car auto) {
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

    public Car autoYach(int index) { //получение инфы из ячейки которую указали
        return autos[index];
    }

    public void utilAuto(int index){
        autos[index] = null;
    }


}
