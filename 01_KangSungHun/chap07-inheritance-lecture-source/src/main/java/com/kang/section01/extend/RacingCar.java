package com.kang.section01.extend;

public class RacingCar extends Car {


  /* RacingCar 기본 생성자 */
  public RacingCar() {
    System.out.println("RacingCar 기본 생성자 형성");

  }

  /* RacingCar 안의 기능 */
  public void useBooster() {
    System.out.println("부스터를 사용합니다.");


  }

  /* Car 상속 받은 메서드 오버라이딩(재정의) */
  @Override
  public void run() {
    System.out.println("레이싱카가 매우 빠른 속도로 달린다.");
  }

  @Override
  public void stop() {
    System.out.println("레이싱카가 속도를 점점 줄인다.");

    /* super 참조 변수 :
    * - 자식이 상속 받은 부모 부분을 참조하는 변수
    *
    * */

    super.stop(); // 부모 부분의 stop() 호출 (오버라이딩 전 stop() 호출)


    // 자동차가 멈춘다.
  }
}
