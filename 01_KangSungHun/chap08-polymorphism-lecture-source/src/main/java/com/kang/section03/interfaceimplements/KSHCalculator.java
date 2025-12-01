package com.kang.section03.interfaceimplements;

public class KSHCalculator implements Calculator {

  @Override
  public int plus(int num1, int num2) {
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
    // 0으로 나누기 방지
    if (num2 == 0) return 0;
    return (double) num1 / num2;
  }

  @Override
  public int mod(int num1, int num2) {
    // 0으로 나누기 방지
    if (num2 == 0) return 0;
    return num1 % num2;
  }


}

