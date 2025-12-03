package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnouchException;

public class Application3 {

  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();

    try {
      //et.checkEnoughMoney(-30000,-10000);
      et.checkEnoughMoney(30000,-10000);
      //et.checkEnoughMoney(30000, 5000);
      //et.checkEnoughMoney(1234,0);

    }  catch (NegativeException | NotEnouchException  | RuntimeException e) { // | 또는
      /* | : 동일한 레벨의 서로 다른 예외를 하나의 catch에
            작성할 수 있게하는 구문
            단, 상위 타입을 같이 작성할 순 없다.
      * */
      System.err.println(e.getMessage());
    }
//    } catch (NotEnouchException e){
//      System.err.println(e.getMessage());
//    }

  }
}
