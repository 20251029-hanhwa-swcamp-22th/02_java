package com.ohgiraffers.section03.interfaceimplements;

public class BDHCalculator implements Calculator{
  @Override
  public int plus(int num1, int num2) {
    if(num1 + num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 + num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;

    return num1 + num2 ;
  }

  @Override
  public int minus(int num1, int num2) {
    if(num1 - num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 - num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    return num1 - num2;
  }

  @Override
  public int multiple(int num1, int num2) {
    if(num1 * num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 * num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;
    return num1 * num2;
  }

  @Override
  public double divide(int num1, int num2) {
    if(num2 == 0) return 0;

    if(num1 / (double)num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 / (double)num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;

    return num1 / (double)num2;
  }

  @Override
  public int mod(int num1, int num2) {
    if(num2 == 0) return 0;

    if(num1 % num2 > Calculator.MAX_NUM) return Calculator.MAX_NUM;
    if(num1 % num2 < Calculator.MIN_NUM) return Calculator.MIN_NUM;

    return num1 % num2;
  }
}
