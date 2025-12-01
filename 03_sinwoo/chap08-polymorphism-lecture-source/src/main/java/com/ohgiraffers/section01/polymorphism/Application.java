package com.ohgiraffers.section01.polymorphism;

public class Application {

    public static void main(String[] args) {
        /* 다형성 : 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것.
        *   - Tiger는 Tiger 이기도 하지만, Animal 이기도 하다.
        *   - Goat는 Goat이기도 하지만, Animal이기도 하다.
        *   - Rabbit 은 Rabbit이고 Animal이다.
        *
        *   참조 변수가 인스턴스의 타입을 결정한다.
        * */


        // 부모 타입 참조 변수 = 자식 인스턴스 (문제 없음)
        Animal animal = new Animal();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();
        Animal goat = new Goat();

        animal.move(); // Animal moving...
        tiger.move();
        rabbit.move();
        goat.move();

        // 정적(프로그램 실행 전) 바인딩
        // - 메서드 호출부가 참조 변수의 타입에 맞춰서 연결됨.


        // Upcasting: sub -> super
        // Down casting: super -> sub
        System.out.println("==========업캐스팅/다운캐스팅==========");
        // 참조 변수의 타입에 따라서 실제 인스턴스의 참조 부분이 달라짐
        // tiger, rabbit, goat는 현재 upcasting 상태.
        // -> 참조 하는 인스턴스의 super class 부분만 볼 수 있음.
        // 특징 : tiger, rabbit, goat는 애니멀의 멤버(메소드)만 참조 할 수 있다.

        // down casting
        ((Tiger)tiger).bite();
        ((Rabbit)rabbit).jump();
        ((Goat)goat).heading();

        Tiger t1 = (Tiger)tiger;
        t1.bite();

        /* 다운캐스팅 시 문제점 */
        Animal animal4 = new Goat();
//        ((Tiger)animal1).bite();  // <- 잘못된 다운 캐스팅. -> 실행시 에러 발생.
        System.out.println("====== 다운캐스팅 문제점 해결(instanceOf 연산자) =====");
        /* 작성법 : "참조형변수(a) instanceOf 클래스명(b)"
        *  -> a가 참조하고 있는 인스턴스가 b 타입이 맞는지 확인
        *   == a가 참조하고 있는 인스턴스가 b 타입을 상속하고 있는지 확인
        *   == a가 참조하고 있는 인스턴스에 b 타입이 있는지 확인
        * */
        System.out.println(animal4 instanceof Goat); // true
        System.out.println(animal4 instanceof Animal); // true

        Animal animal5 = new Rabbit();
        if (animal5 instanceof Tiger){
            ((Tiger)animal5).bite();
        }else if(animal5 instanceof Goat){
            ((Goat)animal5).heading();
        }else if (animal5 instanceof Rabbit){
            ((Rabbit)animal5).jump();
        }else{
            System.out.println("그냥 Animal");
        }


    }
}
