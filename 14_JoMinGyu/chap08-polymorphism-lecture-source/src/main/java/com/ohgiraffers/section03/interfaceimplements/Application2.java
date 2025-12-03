package com.ohgiraffers.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {
    Calculator calculator = new JMGCalculator();

    System.out.println("plus        : " + calculator.plus(10, 20));
    System.out.println("minus       : " + calculator.minus(10, 20));
    System.out.println("multiple    : " + calculator.multiple(10, 20));
    System.out.println("divide      : " + calculator.divide(10, 20));
    System.out.println("mod         : " + calculator.mod(10, 20));
  }
}
