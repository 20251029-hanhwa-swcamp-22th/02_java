package com.my.section03.uses;

import java.io.IOException;

public class Application1 {
  public static void main(String[] args) {
    /* Checked, UnChecked Exception 확인하기
     * Checked    : 개발자가 반드시 예외 처리 구문을 작성해야되는 예외
     * UnChecked  : 개발자가 선택적으로 예외 처리 구문을 작성해야되는 예외
    * */

    // Checked Exception
    // 오류 내용 : 처리되지 않은 예외
    // throw new IOException();
    // 해결방법 : 예외처리구문(try-catch, throws) 작성 필수
    try {
      throw new IOException();
    } catch (IOException e) {
      e.printStackTrace();
    }


    // UnChecked Exception
    // 치명적이지 않은 예외(가벼운 실수, if문 누락)
    // throw new NullPointerException();
    String str = null; // 참조하고 있는게 없다.
    System.out.println(str.length());
    // NullPointerException은 어떻게 처리할까?
    // if문
    // 처리가 안되면 예외처리
  }
}
