package com.my.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인 */
/* 클래스 'SmartPhone'은(는) abstract로 선언되거나 'Product'에서 추상 메서드 'abstMethod()'을(를) 구현해야 합니다 */
public class SmartPhone extends Product {

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod()를 smartPhone이 오버라이딩함");
  }
}
