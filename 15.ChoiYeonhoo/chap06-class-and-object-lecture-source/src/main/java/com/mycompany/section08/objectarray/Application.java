package com.mycompany.section08.objectarray;

public class Application {
  public static void main(String[] args) {

    /* 객체 배열 선언 및 할당 */

    Car[] cars = new Car[5];
//    Car car1 = new Car("페라리",350);  이런 거 5개 묶음
    // new Car[5] : heap 영역에 Car 타입의 "참조형 변수" 5칸 만들기
    //  == Car 참조형 변수 5개 묶음

    System.out.println(cars[0]); // 아무것도 안들어가있어서 null

    cars[0] = new Car("페라리", 300);
    cars[1] = new Car("람보르기니", 350);
    cars[2] = new Car("롤스로이스", 250);
    cars[3] = new Car("부가티베이론", 400);
    cars[4] = new Car("포터", 500);

    /* 같은 타입의 객체를 묶어놓은 배열임을 알고 있기 때문에
    * for문으로 일괄처리 가능 */
    for(int i = 0 ; i < cars.length ; i++) {
      cars[i].driveMaxSpeed();
    }

    Car[] cars2 = {new Car("사이버트럭", 300),
                  new Car("다마스", 100),
                  cars[3] // 얕은 복사
                  };

    // 향상된 for문
    for(Car car : cars2) {
      car.driveMaxSpeed();
    }
  }
}
