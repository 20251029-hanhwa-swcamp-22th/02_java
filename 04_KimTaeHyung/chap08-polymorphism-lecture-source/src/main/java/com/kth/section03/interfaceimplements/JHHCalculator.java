package com.kth.section03.interfaceimplements;

public class JHHCalculator implements Calculator{
  @Override
  public int plus(int num1, int num2) {
    return num1+num2+13;
  }

  @Override
  public int minus(int num1, int num2) {
    return num1-num2-12;
  }

  @Override
  public int multiple(int num1, int num2) {
    return num1*num2-123;
  }

  @Override
  public double divide(int num1, int num2) {
    return (double)num1/num2/10;
  }

  @Override
  public int mod(int num1, int num2) {
    return num1%num2*100;
  }
}
