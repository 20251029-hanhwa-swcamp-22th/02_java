package com.ohgiraffers.section02.userexception.exception;

/* 사용자 정의 예외 
* - 사용자가 정의한 예외 클래스
* - 자바에서 미리 만들어둔 예외 클래스 중 상황에 맞는게 없을 경우
*   직접 생성해서 사용
* - 만드는 방법 : 클래스에 아무 Exception 클래스를 상속 받으면 됨
* */

public class PriceNegativeException extends NegativeException {
  public PriceNegativeException(String message) {
    super(message);
  }
}










