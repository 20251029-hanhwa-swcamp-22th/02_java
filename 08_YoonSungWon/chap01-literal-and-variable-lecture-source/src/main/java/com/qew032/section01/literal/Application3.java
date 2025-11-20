package com.qew032.section01.literal;

public class Application3 {

  public static void main(String[] args) {

    // 문자열 합치기 테스트

    // 1. 두 개의 문자열 합치기
    System.out.println(9 + 9);          //  18
    System.out.println("9" + 9);       //  "99"
    System.out.println(9 + "9");       //  "99"
    System.out.println("9" + "9");    //  "99"

    // 2. 세 개의 문자열 합치기
    System.out.println(9 + 9 + "9");      // "189"
    System.out.println(9 + "9" + 9);      // "999"
    System.out.println("9" + 9 + 9);      // "999"
    System.out.println("9" + (9 + 9));    // "918"

    // 3. 문자열 합치기 응용
    System.out.println("===== 10과 20의 산술 연산 결과=====");
    System.out.println("10 + 20 =" + (10 + 20));
    System.out.println("10 - 20 =" + (10 - 20));
    System.out.println("10 * 20 = " + (10 * 20));
    System.out.println("10 / 20 ="+ (10 / 20));
    System.out.println("10 % 20 =" + (10 % 20));

  }

}
