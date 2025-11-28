package com.my.section02.userexception;

import com.my.section02.userexception.exception.MoneyNegativeException;
import com.my.section02.userexception.exception.NegativeException;
import com.my.section02.userexception.exception.NotEnoughException;
import com.my.section02.userexception.exception.PriceNegativeException;

public class Application3 {

  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();

    try {
      //et.checkEnoughMoney(-30000, -10000);
      et.checkEnoughMoney(30000, -10000); // PriceNegaticeException
      //et.checkEnoughMoney(30000, -10000);// MoneyNegativeException
      //et.checkEnoughMoney(30000, 5000); // NegativeException
    }
    catch(NegativeException | NotEnoughException e){
      /* | : 동일한 레벨의 서로 다른 예외를 하나의 catch에 작성할 수 있게 하는 구문
      * 단, 상위 타입을 같이 작성할 순 없다. ex) catch(NegativeException | NotEnoughException e | Exception)
      * 처리 내용이 같을 때만..?
      * */
      System.err.println(e.getMessage());
    }
//    catch(NotEnoughException e){
//      System.err.println(e.getMessage());
//    }
  }
}

