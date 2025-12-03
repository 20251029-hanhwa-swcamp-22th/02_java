package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {

  public static final int MAX_NUM = 100;
  int MIN_NUM = 0;

  //public InterProduct(){}

  public abstract void nonStaticMethod();
  void abstMethod();

  public static void staticMethod() {
    System.out.println("InterProduct에 정의된 staticMethod()");
  }

  public default void defaultMethod() {
    System.out.println("InterProduct에 정의된 defaultMethod()");
  }

}
