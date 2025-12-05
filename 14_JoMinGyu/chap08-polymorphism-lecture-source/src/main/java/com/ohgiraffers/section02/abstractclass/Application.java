package com.ohgiraffers.section02.abstractclass;

public class Application {
  public static void main(String[] args) {
    Product[] products = new Product[2];

    //products[0] = new Product();
    products[0] = new SmartPhone();
    products[1] = new SmartWatch();

    for (int i = 0; i < products.length; i++) {
      products[i].abstMethod();
    }
  }
}
