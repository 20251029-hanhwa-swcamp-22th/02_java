package com.ohgiraffers.section01.polymorphism;

public class Application2 {

    public static void main(String[] args) {

        /* 다형성을 적용하여 객체 배열을 만들어 사용할 수 있다. */

        // 객체 배열 : 같은 자료형 참조 변수의 묶음
        //  == 배열의 각 요소가 참조 변수다

        Animal[] animals = new Animal[4];
        animals[0] = new Tiger();
        animals[1] = new Rabbit();
        animals[2] = new Goat();
        animals[3] = new Animal();

        for (Animal animal : animals) {
            animal.move();
        }



    }

}
