package com.ohgiraffers.section01.exception;

public class Application2 {

    public static void main(String[] args) {
        System.out.println("=========프로그램시작==========");

        ExceptionTest et = new ExceptionTest();

        /* try/catch: 예외를 “이 자리에서 처리할 때” 사용 */
        try { // try: 예외가 발생할 수 있는 구문을 작성하는 블럭
            et.checkEnoughMoney(200000000,3000);
        } catch (Exception e) { // catch: try에서 던져진 예외를 잡아서 처리하는 블럭
            System.out.println("거지야?");
        }

        System.out.println("=========프로그램종료==========");

    }
}
