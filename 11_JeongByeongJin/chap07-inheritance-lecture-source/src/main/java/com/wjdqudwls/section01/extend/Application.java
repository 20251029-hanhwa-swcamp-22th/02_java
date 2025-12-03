package com.wjdqudwls.section01.extend;

public class Application {
  public static void main(String[] args) {

    Car car = new Car();



    /* FireCar, RacingCar가 Car를 상속 받았는지 확인 */
    car.soundHorn();
    car.run();
    car.soundHorn();
    car.stop();

    System.out.println("----------------------------");

    FireCar fireCar = new FireCar();
    fireCar.soundHorn();
    fireCar.run();
    fireCar.soundHorn();
    fireCar.stop();
    fireCar.sprayWater();

    System.out.println("----------------------------");

    RacingCar racingCar = new RacingCar();
    racingCar.soundHorn();
    racingCar.run();
    racingCar.useBooster();
    racingCar.soundHorn();
    racingCar.stop();

    System.out.println("----------------------------");

    F1Car F1Car = new F1Car();
    F1Car.soundHorn();
    F1Car.run();
    F1Car.useBooster();
    F1Car.soundHorn();
    F1Car.stop();

  }
}
