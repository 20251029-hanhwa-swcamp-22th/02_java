package com.my.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {
    Calculator calculator = new CYHCalculator();

    System.out.println("plus: " + calculator.plus(20, 70));
    System.out.println("minus: " + calculator.minus(20, 200));
    System.out.println("multiple: " + calculator.multiple(23, 7));
    System.out.println("divide: " + calculator.divide(5, 2));
    System.out.println("mod: " + calculator.mod(10, 3));
  }
}
