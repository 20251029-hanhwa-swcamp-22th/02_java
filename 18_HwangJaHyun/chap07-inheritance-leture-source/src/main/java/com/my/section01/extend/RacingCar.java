package com.my.section01.extend;

public class RacingCar extends Car{

  /* RacingCar 기본 생성자 */
  public RacingCar(){
    System.out.println("RacingCar 기본 생성자 호출됨");
  }

  /* RacingCar만의 메서드(기능)*/
  public void useBooster(){
    System.out.println("부아아아아앙");
  }

  /* Car 상속받은 메서드 오버라이딩(재정의) */
  @Override
  public void run(){
    super.run();
    System.out.println("레이싱카가 매우 빠른 속도로 달린다.");
  }

  @Override
  public void stop() {
    System.out.println("레이싱카가 속도를 점점 줄인다.");
    super.stop();
  }
}
