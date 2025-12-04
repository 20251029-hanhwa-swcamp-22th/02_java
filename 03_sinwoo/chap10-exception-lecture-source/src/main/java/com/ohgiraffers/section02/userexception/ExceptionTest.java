package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws NegativeException, NotEnoughException /*Price, Money negative exception*/ {
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");
        System.out.println(money + " - " + price + " = " + (money - price));

        if (price < 0) { /* 잘못된 상품 가격 설정*/
            throw new NegativeException("상품 가격은 음수일 수 없습니다.");
        }

        if (money < 0) {
            throw new NegativeException("가지고 있는 돈은 음수일 수 없습니다");
        }

        System.out.println("감사합니다 안녕히 가세요 ~");
    }
}
