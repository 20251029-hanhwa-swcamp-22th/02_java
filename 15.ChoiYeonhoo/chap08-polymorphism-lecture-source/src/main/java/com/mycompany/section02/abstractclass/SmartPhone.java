package com.mycompany.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인 */
public class SmartPhone extends Product{
  public SmartPhone() {
    super();
  }
  // 오버라이딩 강제됨
  @Override
  public void abstractMethod() {
    System.out.println("Product의 abstractMethod()를 SmartPhone이 오버라이드 함");

  }
}
