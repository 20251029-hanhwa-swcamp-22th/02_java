package org.ho.section01.literal;

public class Application3 {
  public static void main(String[] args) {
    /* 문자열 합치기(+) 테스트*/
    /* 1. 두 개의 문자열 합치기 */
    System.out.println(1 + "2"); // 12
    /* 2. 세 개의 문자열 합치기 */
    System.out.println(1 + "2" + 1); // 121
    System.out.println(1 + 1 + "2"); // 22
    System.out.println("2" + (1 + 1)); // 22
    /* 3. 문자열 합치기 응용 */
    System.out.println("======10과 20의 산술 연산 결과 =====");
    System.out.println(10 + 20);
    System.out.println(10 + "20");
    System.out.println("10" + 20);
    //System.out.println(10-"20"); 에러

    System.out.println("==== 보기 좋게 출력 ====");
    System.out.println("10 + 20 = " + (10 + 20));
    System.out.println("10 - 20 = " + (10 - 20));
    System.out.println("10 * 20 = " + (10 * 20));
    System.out.println("10 / 20 = " + (10 / 20));
    System.out.println("10 % 20 = " + (10 % 20));
  }
}
