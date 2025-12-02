package com.ohgiraffers.section02.exception.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money)
            throws  NegativeException, NotEnoughException
            // NegativeException은 우측둘의 부모 PriceNegativeException, MoneyNegativeException,
            //고로 부모타입 하나만 던져도 자식 타입도 같이 묶어서 처리
            // 예외처리 + 다형성(업캐스팅)
    {


        System.out.println("가지고 계신돈은  = " + money + "원 입니다.");
        System.out.println(money + " - " + price + " = " + (money - price));


//System.out.println(price / money);


        if(price < 0)
        {
         //   System.out.println(" 상품가격이 음수일수 없습니다 ");
            throw new PriceNegativeException(" 상품가격이 음수일수 없습니다 ");
        }
        if(money < 0)
        {
            throw new MoneyNegativeException(" 가지고있는 돈이 없습니다 ");

        }
        if(money < price)
        {
            //System.out.println(" 가진 돈보다 상품이 더 비쌉니다 ");
            throw new NegativeException(" 가진 돈보다 상품이 더 비쌉니다 ");
        }
        System.out.println(" 잘가~ ");
    }
}

