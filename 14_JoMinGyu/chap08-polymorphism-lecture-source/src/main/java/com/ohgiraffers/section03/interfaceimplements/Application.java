package com.ohgiraffers.section03.interfaceimplements;

public class Application {
  public static void main(String[] args) {

    //InterProduct interProduct = new InterProduct();

    InterProduct interProduct = new Product();

    interProduct.nonStaticMethod();
    interProduct.abstMethod();

    interProduct.defaultMethod();

    System.out.println(InterProduct.MAX_NUM);
    System.out.println(InterProduct.MIN_NUM);

    InterProduct.staticMethod();
  }
}
