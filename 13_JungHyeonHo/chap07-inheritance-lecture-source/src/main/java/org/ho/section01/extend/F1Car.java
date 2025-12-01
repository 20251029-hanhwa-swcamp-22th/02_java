package org.ho.section01.extend;

public class F1Car extends RacingCar{
  public F1Car() {
    super();
    System.out.println("F1Car 기본 생성자 호출됨");
  }

  @Override
  public void stop() {
    System.out.println("레이싱카가 속도를 점점 줄인다....");
  }
}
