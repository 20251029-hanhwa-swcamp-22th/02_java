package com.wjdqudwls.section01.exception;

public class Application2 {

  public static void main(String[] args) throws Exception {
    System.out.println("=== 프로그램 시작 ===");

    /* throws 구문이 작쇠온 메서드를 호출하는 경우
     * 예외가 던져져서 올 수 있기 떄문에 그에 대한 알맞은 대비(예외 처리)를 해야한다!!
     * */
    ExceptionTest et = new ExceptionTest();

    /*try : 예외가 발생할 수 있는 구문을 작성하는 블럭 */
    try {

      et.checkEnoughMoney(2000, 3000);
      et.checkEnoughMoney(20000, 3000);
    } catch (Exception e) {
    /* catch : try에서 던져진 예외를 잡아서 처리하는 블럭
    * -> 예오가 처리됨 == 예외가 사라짐 -> 프로그램이 다시 정상 작동함 */
      System.out.println("발생한 Exception 처리 완료");
      System.out.println("=== 프로그램 종료 ===");


    }
  }
}