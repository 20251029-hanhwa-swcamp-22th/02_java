package com.ohgiraffers.section03.interfaceimplements;

public class Product implements InterProduct, java.io.Serializable{

  @Override
  public void nonStaticMethod() {
    System.out.println("Product가 구현한 nonStaticMethod()");
  }

  @Override
  public void abstMethod() {
    System.out.println("Product가 구현한 abstMethod()");
  }
}
