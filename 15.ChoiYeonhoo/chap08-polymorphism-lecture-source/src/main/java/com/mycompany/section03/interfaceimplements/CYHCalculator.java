package com.mycompany.section03.interfaceimplements;

public class CYHCalculator implements Calculator{
  @Override
  public int plus(int num1, int num2) {
    int sum = num1 += num2;
    if (sum > Calculator.MAX_NUM) {
      sum = Calculator.MAX_NUM;
    } else if (sum < Calculator.MIN_NUM) {
      sum = Calculator.MIN_NUM;
    }
    return sum;
  }

  @Override
  public int minus(int num1, int num2) {
    int minus = num1 - num2;
    if (minus > Calculator.MAX_NUM) {
      minus = Calculator.MAX_NUM;
    } else if (minus < Calculator.MIN_NUM) {
      minus = Calculator.MIN_NUM;
    }
    return minus;
  }

  @Override
  public int multiple(int num1, int num2) {
    int multiple = num1 * num2;

    if (multiple > Calculator.MAX_NUM) {
      multiple = Calculator.MAX_NUM;
    } else if (multiple < Calculator.MIN_NUM) {
      multiple = Calculator.MIN_NUM;
    }
    return multiple;
  }

  @Override
  public double divide(int num1, int num2) {
    if(num2 == 0) {
      System.out.println("0으로 나눌수 없습니다");
      return Integer.MAX_VALUE;
    }

    double divide = (double)num1 / num2;

    if (divide > Calculator.MAX_NUM) {
      divide = Calculator.MAX_NUM;
    } else if (divide < Calculator.MIN_NUM) {
      divide = Calculator.MIN_NUM;
    }

    return divide;
  }

  @Override
  public int mod(int num1, int num2) {
    if(num2 == 0) {
      System.out.println("0으로 나눌수 없습니다");
      return Integer.MAX_VALUE;
    }
    int mod = num1 % num2;

    if (mod > Calculator.MAX_NUM) {
      mod = Calculator.MAX_NUM;
    } else if (mod < Calculator.MIN_NUM) {
      mod = Calculator.MIN_NUM;
    }

    return mod;
  }
}
