package com.kang.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {

    Calculator calculator = new KSHCalculator();
    System.out.println("plus : " + calculator.plus(100,70));
    System.out.println("minus : " + calculator.plus(20,200));
    System.out.println("multiple : " + calculator.plus(23,7));
    System.out.println("divide : " + calculator.plus(5,2));
    System.out.println("mod : " + calculator.plus(10,3));


  }
}
