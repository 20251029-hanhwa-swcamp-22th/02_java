package com.wjdqudwls.section02.abstractclass;

public class SmartWatch extends Product{

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod()를 SmartPhone이 오버라이딩함");
  }
}
