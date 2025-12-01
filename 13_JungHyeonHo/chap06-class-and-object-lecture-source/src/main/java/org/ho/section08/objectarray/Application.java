package org.ho.section08.objectarray;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Application {
  public static void main(String[] args) {
    Car[] cars = new Car[5];

    // new Car[5] : heap 영역에 Car 타입의 "참조형" 변수 5칸 만들기
    // cars : Car 참조형 변수 5개가 묶인 배열을 참조하는 변수

    cars[0] = new Car("페라리", 300);
    cars[1] = new Car("람보르기니", 350);
    cars[2] = new Car("롤스로이스", 250);
    cars[3] = new Car("부가티베이론", 400);
    cars[4] = new Car("포터", 500);

//    for (int i = 0; i < cars.length; i++) {
//      cars[i].driveMaxSpeed();
//    }
    Car[] cars2 = {
        new Car("테슬라 사이버트럭", 300),
        new Car("다마스", 140),
        cars[3] // 얕은 복사
    };
    for (Car car : cars2) {
      car.driveMaxSpeed();
    }
  }
}

