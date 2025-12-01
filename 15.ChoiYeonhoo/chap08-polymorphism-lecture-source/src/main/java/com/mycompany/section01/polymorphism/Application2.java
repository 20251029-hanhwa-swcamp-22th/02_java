package com.mycompany.section01.polymorphism;

public class Application2 {
  public static void main(String[] args) {
    /* 다형성을 적용하여 객체 배열을 만들어 사용할 수 있다. */

    // 배열 : 같은 자료형 변수의 묶음
    // 객체 배열 : 같은 가료형 참조 변수의 묶음
    // == 배열의 각 요소가 (주소를 저장하는)참조 변수다.

    Animal[] animals = new Animal[4];
                        // Animal 참조 변수 4개

    animals[0] = new Animal();
    animals[1] = new Tiger();   // Tiger  -> Animal upcasting
    animals[2] = new Goat();    // Goat   -> Animal upcasting
    animals[3] = new Rabbit();  // Rabbit -> Animal upcasting

    for(Animal a : animals){
      a.eat();
          // 정적 바인딩 -> Animal.eat()과 바인딩
          // 동적 바인딩 -> a가 참조하는 실제 인스턴스의 오버라이당된 eat()과 바인딩
    }
  }
}
