package com.mycompany.section02.userexception;

import com.mycompany.section02.userexception.exception.NegativeException;
import com.mycompany.section02.userexception.exception.NotEnoughException;

public class ExceptionTest {

  public void checkEnoughMoney(int price, int money)
      throws NegativeException, NotEnoughException {
    // NegativeException은
    // PriceNegativeException,MoneyNegativeException 의 부모 클래스
    // -> 부모 타입의 예외 하나만 던져도 자식 타입도 같이 묶어서 처리
    //    == 예외 처리 + 다형성(업캐스팅)

    System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
    System.out.println(money + "-" + price + "=" + (money - price));

    /* 상품 가격이 잘못됨 */

    if(price <0){
//      System.out.println("상품 가격은 음수일 수 없습니다.");
//      throw new Exception("상품 가격은 음수일 수 없습니다.");
      throw new NegativeException("상품 가격은 음수일 수 없습니다.");
    }

    if(money < 0){
//      System.out.println("가지고 있는 돈은 음수일 수 없습니다.");
      throw new NegativeException("가지고 있는 돈은 음수일 수 없습니다.");
    }

    if(money < price){
      System.out.println("가진 돈보다 상품이 더 비쌉니다.");
    }


  }

}
