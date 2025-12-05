package org.ho.section03.uses;

import java.io.IOException;

public class Application1 {
  public static void main(String[] args) {
    /* Checked, UnChecked Exception 확인하기
    *
    * - Checked   : 개발자가 반드시 예외 처리 구문을 작성해야되는 예외
    * - UnChecked : 개발자가 선택적으로 예외 처리 구문을 작성해도 되는 예외
    * */
    // - Checked
    // error : Unhandled exception: java.io.IOException
    // solution : 예외 처리 구문(try-catch, throws) 작성 **필수**
    try {
      if(1==0)throw new IOException();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // - Unchecked
    // 치명적이지 않은 예외 (가벼운 실수, if문 누락)
//    throw new RuntimeException();

    // NullPointerException (Unchecked)
    // 어떻게 처리할까?
    // 1) 예외처리 / 2) if문 / 3) 그냥 둔다
    // 2)if문을 선호!, 안되면 1) 예외처리
    String str = null;
    if(str!=null)
      System.out.println(str.length());
  }
}
