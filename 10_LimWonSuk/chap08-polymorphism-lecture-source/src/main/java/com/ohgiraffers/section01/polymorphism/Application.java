package com.ohgiraffers.section01.polymorphism;

public class Application
{
    public static void main(String[] args)

        /* 다형성의 의미 : 하나의 인스턴스가 여러 가지 타입을 가질 수 있는 것
            *
            * Tige는 Tiger이기도 하지만, Animal 이기도 하다
            * Goat는 Goat이기도 하지만, Animal 이기도 하다
            * Rabbit는 Rabbit이기도 하지만, Animal 이기도 하다
            * 이걸 인스턴스의 다형성이라고함
            *
            * - "참조 변수"가 인스턴스의 타입을 결정한다!
            * */
    {
        /*자식 타입 참조 변수 = 자식 인스턴스 (문제없음)*/
        Tiger tiger1 = new Tiger();

        /* 부모 타입 참조 변수 = 자식 인스턴스 (문제없음)
        * - 부모 = 자식 이된거라 값처리 원칙에서 위배되지만
        *      "자식 인스턴스" 내부에 "부모 인스턴스"가 존재하기때문에
        *         참조변수가 "부모 인스턴스"만을 참조하는 형태가 된다
        * */
        Animal animall0 = new Animal();

        Animal animal1 = new Tiger(); // 중복되는것만있어도 가능 animal둔갑한것처럼 보인다

        Animal animal2 = new Goat();

        Animal animal3 = new Rabbit();

        animall0.move(); // Animal.move()

       // tiger1.move();
        System.out.println(" anima1.move() :  ");
        animal1.move(); // Animal.move()

     /*    [정적 (프로그램 실행 전 == 컴파일 단계) 바인딩]
        * - 매서드 호출부가 참조 변수의 타입에 맞춰서 연결됨
        * 프로그램 실행 전 animal1.mave() -> Anumal 클래스의 move()
        *
        * [동적 바인딩]
        * - 실제 인스턴스의 타입에 맞춰서 메서드가 연결됨
       * 프로그램 실행 중 animal.move() -> Tiger에 오바라이딩한 move()
       * */

        animal2.move(); // 컴파일 단계: Animal, 런타임: Goat

        animal3.move(); // 컴파일 단계: Animal, 런타임: Rabbit

        System.out.println("=========업캐스팅/다운캐스팅============= ");

        /* 참조 변수 타입에 따라서 실제 인스턴스의 참조 부분이 달라짐!
        *
        *업캐스팅 : 자식 -> 부모
        * - 부모참조변수 = 자식인스턴스
        *
        * 다운 캐스팅 : 부모 -> 자식
        * - (자식자료형)부모참조변수 = 자식인스턴스
        * -> 자식참조변수 = 자식인스턴스
        * */

        /* animal1, 2, 3은 "업캐스팅" 상태이다.
        * -> 왜? 참조 변수가 부모(Animal) 타입
        *  == 참조하는 '자식' 인스턴스 중 "부모" 부분만 볼 수 있음
        *
        * 특징 : animal1, 2, 3은 animal의 멤버 (메서드)만 참조할 수 있다
        *
        * 업캐스팅 상태 -> 자식 멤버 호출 불가
        * */

      //  animal1.bite();
      //  animal2.heading();
      //  animal3.jump();

        /*다운 캐스팅 1 : 강제 형변환
        * [.] 연산자 (1순위), (자료형)연산자 (2순위)*/
        //  animal1.bite(); 오류남
         // Tiger.bite(); 오류남
        ((Tiger)animal1).bite();
         ((Goat)animal2).heading();
          ((Rabbit)animal3).jump();

          /* 다운 캐스팅 2 : 얕은 복사 (주소만 복사하는것)
          *  */
        Tiger t1 = (Tiger)animal1;
        t1.bite();

        /* 다운 캐스팅 시 문제점
        * */

        Animal animal4 = new Goat(); // 업캐스팅 상태

        // 잘못된 다운 캐스팅 시도 -> 컴파일 오류가 발생하지 않음
        //((Tiger)animal4).bite();
        // -> 부모 - 자식 관계만 형변환이 가능하다! 자식 자식끼리 남이라 안됨

        System.out.println("========== 다운 캐스팅 문제점 해결 (InstanceOf 연산자) ===========");

        /*참조형 변수 (A) InstanceOf 클래스명 (B)
        * [ - a 가 참조하고 있는 인스턴스가 b 타입이 맞는지 확인
         == a 가 참조하고 있는 인스턴스가 b 타입을 상속학고 있는지 맞는지 확인
         == a 가 참조하고 있는 인스턴스에 b 타입이 있는지 확인 ]
         *
        * - 맞으면 true, 아니면 false
        *  - 결과가 true 인 경우 -> a를 b로 업/다운 캐스팅 가능함을 확인
        * */
        System.out.println(animal4 instanceof Goat); // true
        System.out.println(animal4 instanceof Animal); // true


        Animal animal5 = new Rabbit();
        if(animal5 instanceof Tiger)
        {
            // animal5 가 참조하는 인스턴스가 Tiger이 맞다면 전용 메서드 수행
            ((Tiger)animal5).bite();
        }
        else if (animal5 instanceof Goat)
        {
            ((Goat)animal5).heading();
        }
        else if (animal5 instanceof Rabbit)
        {
            ((Rabbit)animal5).jump();
        }
        else
        {
            System.out.println("그냥 동물 입니다");
        }

    }
}
