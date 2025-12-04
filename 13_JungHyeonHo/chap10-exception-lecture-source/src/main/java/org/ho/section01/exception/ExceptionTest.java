package org.ho.section01.exception;

public class ExceptionTest {
  /* 메서드명() throws 예외클래스
  * - 해당 메서드 내에서 발생된 같은 클래스의 예외 객체를
  *   호출한 곳으로 다시 던지는(전달하는) **예외 처리 방법**
  * */
  public void checkEnoughMoney(int price, int money) throws Exception {
    System.out.println("지갑 : 나는 지금 "+money+"원이 안에 있어!");
    if (money >= price) {
      System.out.printf("나 : %d원만큼 있어! %d원 물건 정도는 살 수 있어!\n", price, money);
      if (money - price == 0)
        System.out.println("나 : 물론 그럼 내 주머니는 비겠지...");
      else
        System.out.printf("나 : 물론 %d만큼 돈이 남을거야...", money - price);
    } else {
      System.out.printf("나 : 음... 물건은 %d원이고 지갑엔 %d원 있어서 설거지해서 벌어야겠는데?\n", price, money);
      /* 예외 강제 발생(throw)
      * - 현재 위치에서 예외 객체를 만들어 던짐
      * */
      System.out.println("필요한 돈은 "+(price-money)+"원이야");
      throw new Exception("");
      // 이 예외를 처리하는 구문이 필요하다!
      // 메서드 옆에 throws를 붙이는 방식 채택!
    }

    System.out.println("점원 : 감사합니다. 안녕히 가세요~~~~~");
  }
}
