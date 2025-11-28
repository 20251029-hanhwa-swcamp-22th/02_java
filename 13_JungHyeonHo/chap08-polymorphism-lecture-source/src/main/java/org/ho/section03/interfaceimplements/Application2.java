package org.ho.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {

    Calculator calculator = new JHHCalculator();
    System.out.println("JHHCalculator의 계산 결과");
    System.out.println("plus      : " + calculator.plus(100,70));
    System.out.println("minus     : " + calculator.minus(20,10));
    System.out.println("multiple  : " + calculator.multiple(11,12));
    System.out.println("divide    : " + calculator.divide(41,18));
    System.out.println("mod        " + calculator.mod(30,21));

    calculator = new JJHCalculator();
    System.out.println("JJHCalculator의 계산 결과");
    System.out.println("plus      : " + calculator.plus(100,70));
    System.out.println("minus     : " + calculator.minus(20,10));
    System.out.println("multiple  : " + calculator.multiple(11,12));
    System.out.println("divide    : " + calculator.divide(312689,99532));
    System.out.println("mod       : " + calculator.mod(30,21));
  }
}
