package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application1 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(-33330,100000);
        } catch (NegativeException | NotEnoughException e) {
            System.err.println(e.getMessage());
        }
    }

}
