package com.kth.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {

    Calculator calculator = new JHHCalculator();

    System.out.println("plus : " + calculator.plus(110, 70));
    System.out.println("minus : " + calculator.minus(20, 100));
    System.out.println("multiple : " + calculator.multiple(20, 4));
    System.out.println("divide : " + calculator.divide(7, 3));
    System.out.println("mod : " + calculator.mod(13, 3));
  }
}
