package com.my.section02.userexception.exception;

/*
* MoneyNegativeException / PriceNegativeException
* NegativeException이 공통됨 -> 추상화
* */
public class NegativeException extends Exception {
  public NegativeException(String message) {
    super(message);
  }
}
