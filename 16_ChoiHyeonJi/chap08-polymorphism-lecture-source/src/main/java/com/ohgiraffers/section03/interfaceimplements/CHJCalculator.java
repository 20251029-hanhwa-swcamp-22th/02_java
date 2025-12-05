package com.ohgiraffers.section03.interfaceimplements;

public class CHJCalculator implements Calculator{
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
    return 0;
  }

  @Override
  public double divide(int num1, int num2) {
    return 0;
  }

  @Override
  public int mod(int num1, int num2) {
    return 0;
  }
}
