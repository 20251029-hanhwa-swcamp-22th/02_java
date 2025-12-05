package com.mycompany.section01.polymorphism;

import java.lang.annotation.Target;

public class Application {
  public static void main(String[] args) {

    /* 다형성 :
    * - 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것
    *
    * Tiger는 Tiger이기도 하지만, Animal 이기도 하다.
    * Goat는 Goat이기도 하지만, Animal 이기도 하다.
    * Rabbit은 Rabbit이기도 하지만, Animal 이기도 하다.
    *
    * - 참조 변수가 인스턴스의 타입을 결정힌다.
    * */


    /* 자식 타입 참조 변수 = 자식 인스턴스  (문제 없음) */
    Tiger tiger1 = new Tiger();

    /* 부모 타입 참조 변수 = 자식 인스턴스 (문제 없음)
    * - 부모 = 자식 <- 값 처리 원칙에 위배 되지만
    *  "자식 인스턴스" 내부에 "부모 인스턴스"가 존재하기 때문에
    *  참조 변수가 "부모 인스턴스"만을 참조하는 형태가 된다.
    * */

    // Tiger는 Animal이 될수도, Tiger가 될수도 있음 : 다형성
    Animal animal0 = new Animal();
    Animal animal1 = new Tiger();
    Animal animal2 = new Goat();
    Animal animal3 = new Rabbit();

    animal0.move(); // Animal.move() : 동물이 움직입니다. 출력 됨

//    tiger1.move();
    System.out.print("animal1.move() : ");
    animal1.move(); // 호랑이는 위엄있게 움직입니다. 출력 됨

    // [정적(프로그램 실행 전 == 컴파일 단계) 바인딩]
    // - 메서드 호출부가, 참조 변수의 타입에 맞춰서 연결됨
    // 프로그램 실행 전 animal1.move() -> Animal 클래스의 move()

    // [동적 바인딩]
    // - 실제 인스턴스의 타입에 맞춰서 메서드가 연결됨
    // 프로그램 실행 후 animal1.move() -> Tiger에 오버라이딩한 move()

    // Animal animal1은 보이기엔 Animal 으로 보이지만 실제로는 Tiger의 일부분은 Animal만 보고 있는상태
    // 그러므로 실제로 불러올때는 Animal의 move가 아니라 Tiger의 overriding 된 move가 호출

    animal2.move(); // 컴파일 단계 : Animal, 런타임 : Goat
    animal3.move(); // 컴파일 단계 : Animal, 런타임 : Rabbit

    System.out.println("======== 업캐스팅/다운캐스팅 ==========");
    
    /* 참조 변수의 타입에 따라서 실제 인스턴스의 참조 부분이 달라진다.
    *
    * 업캐스팅 : 자식 -> 부모 
    * - 부모참조변수 = 자식인스턴스
    * 
    * 
    * 다운캐스팅 : 부모 -> 자식
    *  - 부모->자식참조변수 = 자식인스턴스 
    *  : (자식자료형)부모참조변수 = 자식인스턴스
    *  -> 자식참조변수 = 자식인스턴스 
    * */
    
    // animal1,2,3 는 업캐스팅 상태
    // -> 왜? 참조 변수가 부모(Animal) 타입
    //  == 참조하는 '자식' 인스턴스 중 '부모' 부분만 볼수 있음
    // * 특징 : animal1,2,3은 Animal의 멤버(메서드)만 참조할 수 있다.

    // 업캐스팅 상태 -> 자식 멤버 호출 불가
//    animal1.bite();
//    animal2.heading();
//    animal3.jump();

    /* 다운 캐스팅 1 : 강제 형변환 */
    // . 연산자 (1순위). (자료형) 연산자 (2순위)
    ((Tiger)animal1).bite();
    ((Goat)animal2).heading();
    ((Rabbit)animal3).jump();

    /* 다운 캐스팅 2 : 얕은 복사 */
    Tiger t1 = (Tiger)animal1;
    t1.bite();

    /* 다운 캐스팅 시 문제점 */

    Animal animal4 = new Goat();

    // 잘못된 다운 캐스팅 시도 -> 컴파일 오류가 발생하지 않음
//    ((Tiger)animal4).bite(); // Goat는 Tiger로 형변환 할 수 없다.
    // java.lang.ClassCastException
    // Goat cannot be cast to class
    // -> 부모 - 자식 관계에서만 형변환이 가능하다

    System.out.println("======= 다운 캐스팅 문제점 해결 (instanceof 연산자) =======");

    /* 참조형변수(a) instanceof 클래스명(A)
    * - a가 참조하고 있는 인스턴스가 A 타입이 맞는지 확인
    *  == a가 참조하고 있는 인스턴스가 A 타입을 상속하고 있는지 확인
    *  == a가 참조하고 있는 인스턴스에 A 타입이 있는지 확인
    * - 맞으면 true 아니면 false
    *
    * - 결과가 ture 인 경우, a를 A로 업/다운 캐스팅할 수 있음을 확인
    * */

    System.out.println(animal4 instanceof Goat); //true
    System.out.println(animal4 instanceof Animal); // trur
    System.out.println(animal4 instanceof Tiger); // false


    Animal animal5 = new Rabbit();

    // animal5가 참조하는 인스턴스가 Tiger가 맞다면 전용 메서드 수행
    if(animal5 instanceof Tiger){
      ((Tiger)animal5).bite();
    }
    else if (animal5 instanceof Goat) {
      ((Goat)animal5).heading();
    }
    else if (animal5 instanceof Rabbit) {
      ((Rabbit)animal5).jump();
    }
    else {
      System.out.println("그냥 Animal 입니다");
    }
  }
}
