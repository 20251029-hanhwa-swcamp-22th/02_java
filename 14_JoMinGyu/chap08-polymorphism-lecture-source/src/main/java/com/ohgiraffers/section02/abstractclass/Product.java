package com.ohgiraffers.section02.abstractclass;

public abstract class Product {
  private int nonStaticField;
  private static int staticField;

  public Product() {}

  public void nonStaticMethod() {
    System.out.println("Product 클래스의 nonStaticMethod()");
  }

  public static void staticMethod() {
    System.out.println("Product 클래스의 staticMethod()");
  }

  public abstract void abstMethod();
}
