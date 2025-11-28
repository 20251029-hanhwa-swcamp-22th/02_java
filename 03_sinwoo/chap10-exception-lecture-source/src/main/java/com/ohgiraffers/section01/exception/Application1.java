package com.ohgiraffers.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {
        System.out.println("=========프로그램시작==========");

        ExceptionTest et = new ExceptionTest();

        /* throws 구문이 작성된 메서드를 호출하는 경우 예외가 던져서 올 수 있기 때문에 그에 대한 알맞은 예외처리를 해야 한다. */
        et.checkEnoughMoney(200000,3000);

        /* throws로 예외 처리 시 더 이상 예외를 받을 곳이 없다면 "비정상 종료" 된다.
        *  main에서 throws될 경우 더이상 던질 곳이 없음. */


        System.out.println("=========프로그램종료==========");

    }
}
