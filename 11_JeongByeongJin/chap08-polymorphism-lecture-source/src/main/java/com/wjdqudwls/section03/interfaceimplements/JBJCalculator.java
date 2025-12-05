package com.wjdqudwls.section03.interfaceimplements;

public class JBJCalculator implements Calculator{
  @Override
  public int plus(int num1, int num2) {
    return num1+num2+3;
  }

  @Override
  public int minus(int num1, int num2) {
    return num1 - num2 -25;
  }

  @Override
  public int multiple(int num1, int num2) {
    return num1 * num2 * 10;
  }

  @Override
  public double  divide(int num1, int num2) {
    return (num1 / (double) num2) * 2 ;
  }

  @Override
  public int mod(int num1, int num2) {
    return (num1 % num2) / 15;
  }
}
