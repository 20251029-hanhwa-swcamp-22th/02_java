package com.my.section03.interfaceimplements;

public class HJHCalculator implements Calculator{

  @Override
  public int plus(int num1, int num2) {
    if(num1 + num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 + num2 > Calculator.MIN_NUM) return Calculator.MIN_NUM;
    return num1 + num2;
  }

  @Override
  public int minus(int num1, int num2) {
    return num1 - num2;
  }

  @Override
  public int multiple(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public double divide(int num1, int num2) {
    return (double)num1 / (double)num2;
  }

  @Override
  public int mod(int num1, int num2) {
    return num1 % num2;
  }
}
