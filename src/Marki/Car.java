package Marki;

import menu.Metal;

public abstract class Car implements Metal,Auto {

  public   String model;
  private int massa;

    public int getMassaAuto() {
        return massa;
    }

    @Override
    public int getMassa() {
       return  massa;
    }

    public Car(String model, int massaAuto) {
        this.model = model;
        this.massa = massaAuto;
    }
}
