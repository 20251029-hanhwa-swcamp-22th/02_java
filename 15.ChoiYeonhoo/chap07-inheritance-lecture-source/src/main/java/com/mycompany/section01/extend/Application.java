package com.mycompany.section01.extend;

public class Application {
  public static void main(String[] args) {

    Car car = new Car();

    /* FireCar, RacingCar 가 Car를 상속 받았는지 확인 */
    car.soundHorn();
    car.run();
    car.soundHorn();
    car.stop();
//    car.sprayWater();

    System.out.println("-----------------------");
    FireCar fireCar = new FireCar();
    fireCar.soundHorn();
    fireCar.run();
    fireCar.soundHorn();
    fireCar.stop();
    fireCar.sprayWater();

    System.out.println("-----------------------");
    RacingCar racingCar = new RacingCar();
    racingCar.soundHorn();
    racingCar.run();
    racingCar.useBooster();
    racingCar.soundHorn();
    racingCar.stop();

    System.out.println("-----------------------");
    F1Car f1Car = new F1Car();
    f1Car.run();
    fireCar.soundHorn();
    f1Car.useBooster();
    f1Car.stop();
  }
}
