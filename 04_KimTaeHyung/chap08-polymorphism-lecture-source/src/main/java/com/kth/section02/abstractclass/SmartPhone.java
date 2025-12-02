package com.kth.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인*/
public class SmartPhone extends Product{

  // 오버라이딩 강제됨
  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod()를 SmartPhone이 오버라이딩함");
  }
}
