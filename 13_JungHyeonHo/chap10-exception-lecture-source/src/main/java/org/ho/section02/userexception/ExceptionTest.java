package org.ho.section02.userexception;

import org.ho.section02.userexception.exception.MoneyNegativeException;
import org.ho.section02.userexception.exception.NegativeException;
import org.ho.section02.userexception.exception.NotEnoughException;
import org.ho.section02.userexception.exception.PriceNegativeException;

import java.sql.SQLOutput;

public class ExceptionTest {

  public void checkEnoughMoney(int price, int money)
      throws NegativeException, NotEnoughException,
        PriceNegativeException, MoneyNegativeException
     /* NegativeException은
     *  PriceNegativeException, MoneyNegativeException의 부모 클래스
     * -> 부모 타입의 예외 하나만 던져도 자식 타입도 같이 묶어서 처리
     *  == 예외처리 + 다형성(업캐스팅)
     * */
  {
    System.out.println("나 : 나는 지금 " + money + "원이 있어!");


    /* 상품 가격이 잘못됨 = 음수 */
    if (price < 0) {
//      return; 기능은 맞지만 의미론적으로 try-catch문을 사용하는 것이 좋다
      throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
      // Unhandled exception: java.lang.Exception
      // => 메서드 내에 이 exception을 처리할 구문이 없다
    }
    if (money < 0) {
      throw new MoneyNegativeException("소지 금액은 음수일 수 없습니다.");
    }
    if (money < price) {
      throw new NegativeException("가진 돈보다 상품이 더 비쌉니다.");
    }

  }
}
