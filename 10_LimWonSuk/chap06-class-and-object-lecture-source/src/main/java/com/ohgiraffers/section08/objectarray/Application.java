package com.ohgiraffers.section08.objectarray;

import javax.swing.*;

public class Application
{
    public static void main(String[] args)
    {
        /* 객체 배열 선언 및 할당*/

        Car[] cars = new Car[5];
        // 기본형 아니면 주소
        // new Car[5] : heap 영역여 Car 타입의 "참조형" 변수 5칸 만들기
        // Car 참조형 변수 5개 묶음

        // cars : Car 참조형 변수 5개가 묶인 배열을 참조하는 변수
        System.out.println(cars[0]); // null

        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 350);
        cars[2] = new Car("롤스로이스", 250);
        cars[3] = new Car("부가티베이론", 400);
        cars[4] = new Car("포터", 500);

        /* 같은 타입의 객체를 묶어놓은 배열임을 알고 있기때문에 for문으로 일괄 처리를 할 수 있다 */
        for (int i=0; i<cars.length; i++)
        {
            cars[i].driveMaxSpeed();
        }
        Car[] car2 =
                {
                 new Car("테슬러 사이버트럭", 300),
                 new Car("다마스", 140),
                        cars[3] // 얕은복사

                };
        /*령상된 for문*/
        for (Car car : car2)
        {
            car.driveMaxSpeed();
        }

    }
}
