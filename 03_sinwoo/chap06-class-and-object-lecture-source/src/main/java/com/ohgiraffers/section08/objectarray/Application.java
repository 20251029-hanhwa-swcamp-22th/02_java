package com.ohgiraffers.section08.objectarray;

public class Application {

    public static void main(String[] args) {
        /* 객체 배열 선언 및 할당 */
        Car[] cars = new Car[5]; // Car 참조형 변수 5개 묶음.
        System.out.println(cars[0]);

        cars[0] = new Car("소나타1",100);
        cars[1] = new Car("소나타2",200);
        cars[2] = new Car("소나타3",300);
        cars[3] = new Car("소나타4",400);
        cars[4] = new Car("소나타5",500);

        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        Car[] cars2 = {
                new Car("ㅅ12ㅇ",100),
                new Car("ㅅ12ㅇ1",200),
                new Car("ㅅ12ㅇ2",300),
                new Car("ㅅ12ㅇ3",400),
                new Car("ㅅ12ㅇ4",500),
                cars[3]
        };

        for (Car car : cars2) { //
            car.driveMaxSpeed();
        }

    }
}
