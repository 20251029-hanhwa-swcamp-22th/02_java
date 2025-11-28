package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;

public class Application3 {

  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();

    try{
      //et.checkEnoughMoney(-30000, 10000); // PriceNegativeException
      et.checkEnoughMoney(30000, -10000); // MoneyNegativeException
      //et.checkEnoughMoney(30000, 5000); // NegativeException

    } catch (NegativeException | NotEnoughException | RuntimeException e){
      /* | : 동일한 레벨의 서로 다른 예외를 하나의 catch 에
      *      작성할 수 있게하는 구문.
      * 단, 상위 타입을 같이 작성할 순 없다.
      * */

      System.err.println(e.getMessage());
    }

    /*catch (NotEnoughException e){
      System.err.println(e.getMessage());
    }*/

  }
}
