package com.ohgiraffers.section03.interfaceimplements;

public class JMGCalculator implements Calculator {
  @Override
  public int plus(int num1, int num2) {
    if(num1 + num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 + num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    System.out.println("Two inputs for plus are "+num1+", "+num2+" respectively");
    return num1+num2;
  }

  @Override
  public int minus(int num1, int num2) {
    if(num1 - num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 - num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    System.out.println("Two inputs for minus are "+num1+", "+num2+" respectively");
    return num1-num2;
  }

  @Override
  public int multiple(int num1, int num2) {
    if(num1 * num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 * num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    System.out.println("Two inputs for multiple are "+num1+", "+num2+" respectively");
    return num1*num2;
  }

  @Override
  public double divide(int num1, int num2) {
    if((double)num1 / num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if((double)num1 / num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    System.out.println("Two inputs for divide are "+num1+", "+num2+" respectively");
    return (double)num1/num2;
  }

  @Override
  public int mod(int num1, int num2) {
    if(num1 % num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 % num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    System.out.println("Two inputs for mod are "+num1+", "+num2+" respectively");
    return num1%num2;
  }
}
