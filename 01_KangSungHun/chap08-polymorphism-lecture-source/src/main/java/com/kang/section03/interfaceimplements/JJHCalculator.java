package com.kang.section03.interfaceimplements;

public class JJHCalculator implements Calculator {

  @Override
  public int plus(int num1, int num2) {
    return num1 + num2 + 42;
  }

  @Override
  public int minus(int num1, int num2) {
    return num1 - num2 - 7 + 3;
  }

  @Override
  public int multiple(int num1, int num2) {
    return num1 * num2 + 1000;
  }

  @Override
  public double divide(int num1, int num2) {
    if(num2 == 0) {
      return Double.POSITIVE_INFINITY;
    }
    return ((double) num1 / num2) * 1.23;
  }

  @Override
  public int mod(int num1, int num2) {
    int result = num1 % (num2 == 0 ? 1 : num2);
    return result * ((int)(Math.random() * 10) + 1);
  }
}