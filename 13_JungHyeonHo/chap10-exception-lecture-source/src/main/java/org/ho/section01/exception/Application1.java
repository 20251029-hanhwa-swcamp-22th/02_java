package org.ho.section01.exception;

public class Application1 {
  public static void main(String[] args) throws Exception {
    System.out.println("==============가게 입장================");

    ExceptionTest et = new ExceptionTest();
    /* throws 구문이 작성된 메서드를 호출하는 경우
    * 예외가 던져져서 올 수 있기 때문에
    * 그에 대한 알맞은 대비(예외 처리)를 해야 한다!!!
    * */
    // 나 : 예외를 던지는 메서드를 쓰는 순간 예외 처리 방법을 명시해야 한다
//    et.checkEnoughMoney(2000,3000);


    /*throws로 예외 처리 시
    * 더이상 예외를 받을 곳이 없다면 "비정상 종료" 된다
    * (main에서 throws 될 경우 더 이상 던질 곳이 없음)*/
    et.checkEnoughMoney(2000000000,3000);
    System.out.println("==============가게 퇴장================");
  }
}
