package org.ho.section01.exception;

public class Application2 {
  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();
    /* try : 예외를 발생할 수 있는 구문을 작성하는 블럭 */
    try {
      System.out.println("==============가게 입장================");
      et.checkEnoughMoney(2000,3000);
      System.out.println("==============가게 퇴장================");
      System.out.println("==============가게 입장================");
      et.checkEnoughMoney(2000000000,3000);
      System.out.println("==============가게 퇴장================");
    }
    /* catch : try에서 던져진 예외를 잡아서 처리하는 블럭
     * -> 예외가 처리됨 == 예외가 사라짐 -> 프로그램이 다시 정상 동작함
     * */
    catch (Exception e) {
      System.out.println("발생한 Exception 처리 완료");
    }
  }
}
