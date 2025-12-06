package com.ohgiraffers.section08.objectarray;

// import javax.swing.*;
public class Application2 {
    public static void main(String[] args) {
        Car2[] cars = new Car2[5];
        System.out.println(cars[0]);

        cars[0] = new Car2("부릉이", 150);
        cars[1] = new Car2("따릉이", 250);
        cars[2] = new Car2("팡팡이", 350);
        cars[3] = new Car2("퉁퉁이", 450);
        cars[4] = new Car2("빵빵이", 550);

        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }
        Car2[] cars1 =
                {
                        new Car2("달려달려붕붕", 300),
                        new Car2("날아날아싱싱", 500),
                        cars[4]
                };
        for (Car2 car : cars1) {
            car.driveMaxSpeed();
        }
    }
}
