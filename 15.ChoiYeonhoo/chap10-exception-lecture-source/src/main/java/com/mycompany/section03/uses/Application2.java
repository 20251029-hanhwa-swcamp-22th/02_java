package com.mycompany.section03.uses;

import java.io.IOException;

public class Application2 {
  public static void main(String[] args) {

    /* finally 확인 하기 
    * - try 구문 내에서, 예외 발생 여부와 관계없이
    *   마지막에 반드시 수행
    * - try, catch에서 return을 만나도 먼저 finally가 수행됨
    * */
    
    try {
      System.out.println("try 구문 수행");
      if(1 == 0) throw new IOException();
      // 1==1 -> try, catch, finally
      // 1=-0 -> try,finally
    }
    catch (IOException e){
      System.out.println("catch 구문 수행");
    }
    finally {
      System.out.println("finally 구문 수행");
    }
  }

  public static void testMethod(){
    try {
      System.out.println("111111111111");
      if(1 == 1) throw new IOException();
    }
    catch (IOException e){
      System.out.println("catch 구문 수행");
      return;
    }
    finally {
      System.out.println("finally 구문 수행");
    }
  }
}
