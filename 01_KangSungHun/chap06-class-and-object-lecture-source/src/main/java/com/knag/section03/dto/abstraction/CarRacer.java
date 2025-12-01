package com.knag.section03.dto.abstraction;

public class CarRacer {

  // filed
  private Car car = new Car();

  public void startUp() {
    car.startUp();
  }


  public void stepAccelerator() {
    car.go();
  }

  public void stepBreak() {
    car.stop();
  }

  public void turnOff() {

    car.turnOff();

  }
}
