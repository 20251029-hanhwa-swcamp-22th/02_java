package com.wjdqudwls.section02.abstractclass;

public class SmartPhone extends  Product{

  // 오버라이딩 강제됨
  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod를 오버라이딩함");
  }
}
