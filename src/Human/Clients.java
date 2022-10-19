package Human;

import Marki.Auto;

public class Clients extends Human {
    private Auto autos[] = new Auto[10];

    public Clients(String name, int age) {
        super(name, age);
    }

    public void addautocl(Auto auto){
        for (int i = 0; i < autos.length; i++) {
            if(autos[i] == null){
                autos[i] = auto;
            }


            }
        }
        //Вывод списка авто купленных авто клиента
    public void spisok(Clients clients) {
        for (int i = 0; i < autos.length; i++) {
            if (autos[i] == null){
                System.out.println(autos[i]);
            }
        }
    }
}
