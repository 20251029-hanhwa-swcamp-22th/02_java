package com.my.section03.interfaceimplements;

public class CYHCalculator implements Calculator{
  @Override
  public int plus(int num1, int num2) {
    int sum = num1 += num2;
    return sum;
  }

  @Override
  public int minus(int num1, int num2) {
    int minus = num1 - num2;
    return minus;
  }

  @Override
  public int multiple(int num1, int num2) {
    int multiple = num1 * num2;
    return multiple;
  }

  @Override
  public double divide(int num1, int num2) {
    double divide = (double)num1 / num2;
    return divide;
  }

  @Override
  public int mod(int num1, int num2) {
    int mod = num1 % num2;
    return mod;
  }
}
