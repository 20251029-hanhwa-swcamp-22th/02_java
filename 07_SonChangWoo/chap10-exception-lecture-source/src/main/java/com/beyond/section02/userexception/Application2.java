package com.beyond.section02.userexception;


import com.beyond.section02.userexception.exception.MoneyNegativeException;
import com.beyond.section02.userexception.exception.NegativeException;
import com.beyond.section02.userexception.exception.PriceNegativeException;

public class Application2 {

  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();
    try {
      // et.checkEnoughMoney(-30000, 10000); // PriceNegativeException
      // et.checkEnoughMoney(30000, -10000); // MoneyNegativeException
      et.checkEnoughMoney(30000, 5000);  // NegativeException

    } catch (NegativeException e) {
      // - 부모 타입의 예외를 매개 변수로 설정하면
      // 모든 자식 예외를 잡아서 처리할 수 있다!!@
      // - 부모, 자식 예외 가리지 않고 처리 방법이 똑같다면
      //   부모 타입 catch 하나만 작성하는 것이 코드 길이 감소에 도움됨
      System.err.println(e.getMessage());

    } /*catch (PriceNegativeException e) {
      System.err.println(e.getMessage());
      // e.printStackTrace();

    } catch (MoneyNegativeException e) {
      System.err.println(e.getMessage());
    } */
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
