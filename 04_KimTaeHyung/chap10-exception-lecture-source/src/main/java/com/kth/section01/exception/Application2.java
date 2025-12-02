package com.kth.section01.exception;

public class Application2 {

  public static void main(String[] args)  {
    System.out.println("===== 프로그램 시작 =====");

    ExceptionTest et = new ExceptionTest();

    /* try : 예외가 발생할 수 있는 구문을 작성하는 블럭 */
    try{
      et.checkEnoughMoney(2000, 3000); // 정상
      et.checkEnoughMoney(2000000, 3000); // 예외 발생
    } catch(Exception e){
      /* catch : try에서 던져진 예외를 잡아서 처리하는 블럭
      * -> 예외가 처리됨 == 예외가 사라짐 -> 프로그램이 다시 정상 동작함
      * */

      System.out.println("발생한 Exception 처리 완료");

    }

    System.out.println("===== 프로그램 종료 =====");
  }
}
