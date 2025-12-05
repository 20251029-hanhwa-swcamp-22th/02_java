package com.wjdqudwls.section02.userexception;

import com.wjdqudwls.section02.userexception.exception.NegativeException;
import com.wjdqudwls.section02.userexception.exception.NotEnoughException;
import com.wjdqudwls.section02.userexception.exception.PriceNegativeException;

public class Application1 {
  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();


    try {
//      et.checkEnoughMoney(-2000,-10000);
//      et.checkEnoughMoney(2000,-3000);
//      et.checkEnoughMoney(1234,0);
      et.checkEnoughMoney(30000, 5000);
//      et.checkEnoughMoney(1000,20000);
      /*
      |  : 동일한 레벨의 서로 다른 예외를 하나의 catch에 작성할 수 있게 하는 구문
      * */
    } catch (NegativeException | NotEnoughException e) {
      System.err.println(e.getMessage());
    }
    /*catch (NotEnoughException e) {
      System.err.println(e.getMessage());
    }*/


  }
}
