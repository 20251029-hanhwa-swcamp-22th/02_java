package org.ho.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인 */
/* 1. abstract SmartPhone => 추상 클래스로 바꿔서 구현 안할 상황을 만들던가
*  2. overriding abstMethod => abstMethod를 오버라이딩해서 구현해라
* */
public class SmartPhone extends Product{

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod를 SmartPhone에서 오버라이딩함");
  }


}
