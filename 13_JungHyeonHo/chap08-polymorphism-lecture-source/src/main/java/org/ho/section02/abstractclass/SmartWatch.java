package org.ho.section02.abstractclass;

public class SmartWatch extends Product{

  @Override
  public void abstMethod() {
    System.out.println("Product의 abstMethod를 SmartWatch에서 오버라이딩함");
  }
}
