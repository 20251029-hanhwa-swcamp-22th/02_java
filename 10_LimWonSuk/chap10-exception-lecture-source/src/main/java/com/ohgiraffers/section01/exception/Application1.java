package com.ohgiraffers.section01.exception;

public class Application1
{
    public static void main(String[] args)
            throws Exception // 호출한 곳으로 다시 던지는(전달하는) "*** 예외 처리 방법 ***"
    {
        System.out.println(" =============== 프로그램 시작했다 ================== " );

       ExceptionTest et = new ExceptionTest();

       /* throws 구문이 작성된 메서드를 호출하는 경우
       * 예외가 던져져서 올 수 있기 때문에
       * 그에 대한 알맞은 대비(예외처리)를 해야한다.
       * */
      // et.checkEnoughMoney(2000,3000); // 정상

        /* throws 로 예외 처리시
        * 더 이상 예외를 받을 곳이 없다면 "비정상 종료" 된다
        * (main에서 throws 될경우 더 이상 던질 곳이 없음)
        * */
        et.checkEnoughMoney(2000000000,3000); // 비정상



        System.out.println(" =============== 프로그램 종료했다 ================== " );
    }
}
