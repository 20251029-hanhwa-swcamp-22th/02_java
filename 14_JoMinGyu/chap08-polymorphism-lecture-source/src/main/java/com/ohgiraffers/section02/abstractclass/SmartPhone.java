package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod를 SmartPhone이 오버라이딩함");
  }
}
