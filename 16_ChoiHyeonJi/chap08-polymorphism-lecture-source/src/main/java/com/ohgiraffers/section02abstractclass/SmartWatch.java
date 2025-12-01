package com.ohgiraffers.section02abstractclass;

public class SmartWatch extends Product{

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod()를 SmartWatch가 오버라이딩함");
  }
}
