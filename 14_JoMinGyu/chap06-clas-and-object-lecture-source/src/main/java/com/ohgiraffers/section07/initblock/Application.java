package com.ohgiraffers.section07.initblock;

import com.ohgiraffers.section07.initblock.Product;

public class Application {
  public static void main(String[] args) {

    Product p1 = new Product();
    System.out.println(p1.getInformation());

    System.out.println();

    Product p2 = new Product(60000);
    System.out.println(p2.getInformation());
    System.out.println();

    System.out.println(cars[0]);

    cars[0] = new Car("페라리", 300);
  }
}