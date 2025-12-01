package com.my.section01.extend;

public class FireCar extends Car{

  /* FireCar 기본 생성자 */
  public FireCar(){
    /* super() 생성자
    * - 자식 객체 생성 시 부모 객체를 생성하기 위해
    * 부모의 생성자를 호출하는 메서드
    * - 항상 자식 생성자 첫 번째 줄에 작성해야 함
    * - 미작성 시 컴파일러가 자동으로 추가해줌
    * */
    super(); // -> 이렇게 쓰지 않아도 자동으로 실행됨
    System.out.println("FireCar 기본 생성자 호출됨");
  }

  /* FireCar만의 메서드 */
  public void sprayWater(){
    System.out.println("물을 뿌립니다.");
  }

  /* 오버라이딩(overriding)
  *  - 부모로부터 상속 받은 메서드를 자식이 재정의하는 것(덮어쓰기)
  *  - 성립요건
  *   1) 메서드명, 매개변수, 반환형 모두 동일
  *   2) 접근 제어자는 같거나 넓은 범위
  * */

  /* @Override 어노테이션
  * 역할 1 : 개발자가 메서드 오버라이딩 여부를 확인하는 용도
  * 역할 2 : 컴파일러에게 오버라이딩 성립 요건 맞는지 확인하라고 명령
  *
  * *** Annotation 이란
  * -> @(at)으로 시작
  * -> 컴파일러를 위한 주석
  * -> 컴파일러에게 상황 설명 또는 추가 명령을 내리는 구문
  * */
  @Override
  public void soundHorn(){
    System.out.println("애애앵- 애애앵-");
  }
}
