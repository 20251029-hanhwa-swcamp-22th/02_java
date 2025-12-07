package com.ohgiraffers.section01.jupiter;
 // 전달인자가 0이면 잘못된 것
public class NumberValidation {
    public void checkDividableNumbers
            (int firstNum, int secondNum) {
        if(secondNum == 0)
            throw new IllegalArgumentException
                    ("0으로 나눌 수 없습니다.");
    }
}
