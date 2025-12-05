package com.my.section01.exception;

public class ExceptionTest {

  /* method명() throws 예외클래스
  * 해당 메서드 내에서 발생된 같은 클래스의 예외 객체를
  * 호출한 곳으로 다시 던지는(전달하는) @@@@ 예외처리방법 @@@@
  * */
  public void checkEnoughMoney(int price, int money) throws Exception {
    System.out.println("가지고 계신 돈은 " + money +"원 입니다.");

    System.out.println(money + " - " + price + " = " + (money - price));

    if(money >= price){
      System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
    }else{
      System.out.println("금액이 충분하지 않습니다.");

      /* 에외 강제 발생(throw)
      * 현재 위치에서 예외 객체를 만들어 던짐
      * */
      throw new Exception();
    }
    System.out.println("감사합니당~~~~~~");
  }

}
