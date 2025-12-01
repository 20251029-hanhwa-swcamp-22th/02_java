package com.my.section01.polymorphism;

public class Application {
  public static void main(String[] args) {
    /* 다형성 :
    *   하나의 인스턴스가 여러가지 타입을 가질 수 있는 것
    *
    *   Tiger는 Tiger이기도 하지만, Animal이기도 하다.
    *   Goat는 Goat이기도 하지만, Animal이기도 하다.
    *   Rabbit은 Rabbit이기도 하지만, Animal이기도 하다.
    *
    * 참조 변수가 인스턴스의 타입을 결정한다.
    * */

    /* 자식 타입 참조 변수 = 자식 인스턴스(문제 없음) */
    Tiger tiger1 = new Tiger();

    /*부모 타입 참조 변수 = 자식 인스턴스(문제 없음)
    * - 부모 = 자식 <- 값 처리 원칙에서 위배되지만
    * "자식 인스턴스" 내부에 "부모 인스턴스"가 존재하기 때문에
    * 참조 변수가 "부모 인스턴스"만을 참조하는 형태가 된다.
    *
    *    Animal  ---------------->     Tiger
    *  ---------                \   ------------
    * |         |               v |    Animal    |
    * ----------              ->  |   -------    |
    *                             |  |       |   |
    *                             |  --------   |
    *                               -----------
    * Tiger의 Animal만 보고 있음
    * Tiger의 bite는 쓸 수가 없음
    * ((Tiger)animal1).bite
    * */
    Animal animal0 = new Animal();
    Animal animal1 = new Tiger();
    Animal animal2 = new Goat();
    Animal animal3 = new Rabbit();

    animal0.move(); //Animal.move();
    tiger1.move();  //Tiger.move();
    System.out.print("animal1.move() : ");
    animal1.move();
    // [정적(프로그램 실행 전 == 컴파일단계) 바인딩]
    // 메서드 호출부분이 참조변수의 타입에 맞춰서 연결됨 Animal..
    // 프로그램 실행 전 animal1.move() -> Animal 클래스의 move()

    // [동적 바인딩]
    // 실제 인스턴스의 타입(Tiger)에 맞춰서 메서드가 연결됨
    // 프로그램 실행 중 animal1.move() -> Tiger에 오버라이딩한 move()

    animal2.move(); // 컴파일 단계 : Animal, 런타임: Goat
    animal3.move(); // 컴파일 단계 : Animal, 런타임: Rabbit

    System.out.println();
    System.out.println("=====업캐스팅/다운캐스팅=====");
    /* 참조 변수의 타입에 따라서 실제 인스턴스의 참조 부분이 달라짐!
    *
    *   1. 업캐스팅: 자식 -> 부모
    *   - 부모참조변수 = 자식인스턴스
    *   2. 다운캐스팅: 부모 -> 자식
    *   - (자식자료형)부모 -> 자식참조변수 = 자식인스턴스
    *     -> 강제형변환
    * */

    // animal1,2,3 업캐스팅 상태이다.
    // 참조변수가 부모(Animal) 타입
    // == 참조하는 '자식' 인스턴스 중 '부모' 부분만 볼 수 있음.
    // == 자식이 부모로 변한 것 처럼 보임. (시야가 좁다)
    // @@@특징: animal1,2,3은 Animal의 멤버(필드, 메서드)만 참조할 수 있다.

    // animal1.bite();
    // animal2.heading();
    // animal3.jump();

    /* 다운 캐스팅 1 : 강제 형변환*/
    // 연산자 우선순위
    // 1순위) . 연산자
    // 2순위) (자료형) 연산자
    ((Tiger)animal1).bite();
    ((Goat)animal2).heading();
    ((Rabbit)animal3).jump();

    /* 다운 캐스팅 2 : 얕은 복사_강사님추천ㅎㅎㅎ*/
    Tiger t1 = (Tiger)animal1;
    t1.bite();

    /* 다운 캐스팅 할 때의 문제점 */
     Animal animal4 = new Goat(); // 업캐스팅 상태

    //((Tiger)animal4).bite();
    /* 잘못된 다운 캐스팅 시도 (Goat)여야하는데..
     -> 컴파일 오류가 발생하지 않음
     -> 실행 시 오류
     java.lang.ClassCastException
     Goat cannot be cast to class Tiger
     Goat는 Tiger로 형 변환할 수 없다.
     -> 부모 - 자식 관계만 형변환이 가능하다 */

    System.out.println("===== 다운 캐스팅 문제점 해결(instanceof 연산자) =====");
    /* 참조형변수(a) instanceof 클래스명(b)
    *  a가 참조하고 있는 인스턴스가 b타입이 맞는 지 확인
    * == a가 참조하고 있는 인스턴스가 b타입을 상속하고 있는 지 확인
    * == a가 참조하고 있는 인스턴스에 b타입이 있는지 확인
    * 맞으면 true 아니면 false
    * 결과가 true인 경우
    * -> a를 b로 업/다운 캐스팅할 수 있음을 확인
    * */
    System.out.println(animal4 instanceof Goat);  //true
    System.out.println(animal4 instanceof Animal);  //true
    System.out.println(animal4 instanceof Tiger); //false

    Animal animal5 = new Rabbit();
    if(animal5 instanceof Tiger){
      // animal5가 참조하는 인스턴스가 Tiger가 맞다면 전용 메서드 수행
      ((Tiger)animal5).bite();
    }else if(animal5 instanceof Goat){
      // animal5가 참조하는 인스턴스가 Goat가 맞다면 전용 메서드 수행
      ((Goat)animal5).heading();
    }else if(animal5 instanceof Rabbit){
      // animal5가 참조하는 인스턴스가 Rabbit 맞다면 전용 메서드 수행
      ((Rabbit)animal5).jump();
    }else{
      System.out.println("그냥 Animal입니다.");
    }
  }
}
