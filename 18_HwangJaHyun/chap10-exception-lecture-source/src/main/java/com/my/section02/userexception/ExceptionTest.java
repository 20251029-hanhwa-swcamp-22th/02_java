package com.my.section02.userexception;

import com.my.section02.userexception.exception.MoneyNegativeException;
import com.my.section02.userexception.exception.NegativeException;
import com.my.section02.userexception.exception.NotEnoughException;
import com.my.section02.userexception.exception.PriceNegativeException;

import java.sql.SQLOutput;

public class ExceptionTest {
  public void checkEnoughMoney(int price, int money) throws NegativeException, NotEnoughException {
    // NegativeException
    // == PriceNegativeException, MoneyNegativeException의 부모클래스
    // -> 부모 타입의 예외 하나만 던져도 자식타입까지 같이 묶어서 처리
    // == 예외처리 + 다형성(업캐스팅)
      System.out.println("가지고 계신 돈은 " + money +"원 입니다.");
      System.out.println(money + " - " + price + " = " + (money - price));

      // System.out.println(price/money);
      // System.out.println("0으로 나눌 수 없습니다.");
      /* 상품 가격이 잘못됨 */
      if(price < 0){
        // System.out.println("상품 가격은 음수일 수 없습니다.");
        // return;

        // throw new Exception("상품 가격은 음수일 수 없습니다.");
        throw new PriceNegativeException("상품 가격은 음수일 수 없습니다.");
      }

      if(money < 0){
        //System.out.println("가지고 있는 돈은 음수일 수 없습니다.");
        throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");
      }

      if(money < price){
        throw new NegativeException("가진 돈보다 상품이 더 비쌉니다.");
      }

      System.out.println("감사합니당~~~~~~");
    }
}
