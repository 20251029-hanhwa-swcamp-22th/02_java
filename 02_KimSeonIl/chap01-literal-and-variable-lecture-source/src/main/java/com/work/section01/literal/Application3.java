package com.work.section01.literal;

public class Application3 {
  public static void main(String[] args) {
    /* 문자열 합치기(+) 테스트*/

    /*1. 두 개의 문자열 합치기*/
    System.out.println(9 + 9);
    System.out.println("9" + 9);
    System.out.println(9 + "9");
    System.out.println("9" + "9");
    /*2. 세 개의 문자열 합치기*/
    System.out.println(9 + 9 + "9");
    System.out.println(9 + "9" + 9);
    System.out.println("9" + 9 + 9);
    System.out.println("9" + (9 + 9));

    /*3. 문자열 합치기 응용 */
    System.out.println("===== 10과 20의 산술 연산 결과 =====");
    System.out.println(10 + 20);
    System.out.println(10 - 20);
    System.out.println(10 * 20);
    System.out.println(10 / 20);
    System.out.println(10 % 20);

    System.out.println("==== 보기좋게 출력 ====");
    System.out.println("10 + 20 = " + (10 + 20));
    System.out.println("10 - 20 = " + (10 - 20));
    System.out.println("10 * 20 = " + (10 * 20));
    System.out.println("10 / 20 = " + (10 / 20));
    System.out.println("10 % 20 = " + (10 % 20));

    /*  bit: 전기 신호 최소 단위
    *   byte : data처리 최소 단위
  *   word : 컴퓨터 os 별로 한번에 묶어서 처리할수 있는 수 32bit ~ 64bit*/
  }
}