package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-33330,100000);
        } catch (NegativeException | NotEnoughException e) {
            System.err.println(e.getMessage());
            // 부모, 자식 예외 가리지 않고 처리방식이 똑같다면 부모 타입 catch 하나만 작성하는 것이 코드 길이 감소에 도움됨.
        } // catch (PriceNegativeException e) {} :
// Exception 'com.ohgiraffers.section02.userexception.exception.PriceNegativeException' has already been caught
    }

}
