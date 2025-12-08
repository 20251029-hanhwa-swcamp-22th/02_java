package com.wjdqudwls.section03.uses;

import java.io.IOError;
import java.io.IOException;

public class Application2 {
  public static void main(String[] args) {

    /* finally 확인 하기
     * - try 구문 내에서 예외 발생 여부와 관계 없이
     *   마지막에 반드시 수행함
     * */

    try {
      System.out.println("try 구문 수행");

      if(1 == 0) throw new IOException();
      // 1 == 1 -> try, catch, finally
      // 1 == 0 -> try, finally

    } catch (IOException e) {
      System.out.println("catch 구문 수행");

    } finally {
      System.out.println("finally 구문 수행");
    }
  }
}
