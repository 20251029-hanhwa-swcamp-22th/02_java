package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        FireCar fireCar = new FireCar();
        RacingCar racingCar = new RacingCar();
        F1Car f1Car = new F1Car();

        System.out.println("fireCar.name = " + fireCar.getName());
        System.out.println("fireCar.speed = " + fireCar.getSpeed());

        System.out.println("racingCar.name = " + racingCar.getName());
        System.out.println("racingCar.speed = " + racingCar.getSpeed());

        fireCar.run();
        fireCar.stop();

        racingCar.run();
        racingCar.stop();

        fireCar.soundHorn();

        f1Car.stop();
    }

}
