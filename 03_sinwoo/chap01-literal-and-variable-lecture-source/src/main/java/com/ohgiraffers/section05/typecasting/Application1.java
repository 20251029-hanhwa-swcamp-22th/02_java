package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        /* 자동 형병환
        *  - 서로 다른 자료형의 연산 수행 시 컴파일러가 자동으로 값의 범위가 '작은' 자료형을 '큰' 자료형으로 변환 */

        int inum1 = 10;
        long lnum1 = inum1;

        System.out.println(lnum1);

        int inum2 = 20;
        long lnum2 = 100L;
        long result = inum2 + lnum2;
        System.out.println("result = " + result);

        int inum3 = 100;
        float fnum3 = 1.5f;
        float result2 = inum3 + fnum3;
        System.out.println("result2 = " + result2);

        /* long(8byte) -> float(4byte) */
        long lnum4 = 100L;
        float fnum4 = lnum4;
        System.out.println("fnum4 = " + fnum4);

        /* char -> Int 변환 */
        char ch5 = 'a';
        int inum5 = ch5;
        System.out.println("inum5 = " + inum5);



    }
}
