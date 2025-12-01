package com.my.section01.extend;

public class Application {
  public static void main(String[] args) {


    /* FireCar, RacingCar가 Car를 상속받았는지 확인 */
    System.out.println("------------Car---------------");

    Car car = new Car(); // 객체 생성(new)
    car.soundHorn();
    car.run();
    car.soundHorn();
    car.stop();

    System.out.println("----------fireCar-------------");

    FireCar fireCar = new FireCar();
    fireCar.soundHorn();
    fireCar.sprayWater();
    fireCar.run();
    fireCar.soundHorn();
    fireCar.stop();

    System.out.println("----------RacingCar-----------");

    RacingCar racingCar = new RacingCar();
    racingCar.soundHorn();
    racingCar.run();
    racingCar.useBooster();
    racingCar.soundHorn();
    racingCar.stop();

    System.out.println("-----------F1Car------------");
    F1Car f1Car = new F1Car();
    f1Car.run();
    f1Car.soundHorn();
    f1Car.useBooster();
    f1Car.stop();

  }
}
