package com.my.section03.uses;

import com.my.section02.userexception.exception.NotEnoughException;

import java.io.IOException;

public class Application2 {
  public static void main(String[] args) {
    /* finally 확인하기
     * try 구문 내에서 예외 발생 여부와 관계 없이
     * 마지막에 반드시 수행함
     * try, catch에서 return을 만나도 먼저 finally가 수행 됨
     * 황자현씨는 몸이 너무 허약하다
    * */

    try{
      System.out.println("try 구문 수행");
      //if(1==1) throw new IOException();
      // try, catch, finally
      if(1==0) throw new IOException();
      // try, finally
    }catch(IOException e){
      System.out.println("catch 구문 수행");
    }finally{
      System.out.println("finally 구문 수행");
    }
  }
}
