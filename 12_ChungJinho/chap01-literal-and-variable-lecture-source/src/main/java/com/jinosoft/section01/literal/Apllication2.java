package com.jinosoft.section01.literal;

public class Apllication2 {

  public static void main(String[] args) {
    /* 값을 연산하여 결과를 출력할 수 있다.
     * 이 때, 값의 결과는 연산에 사용된 값의 형태에 따라
     * 또는 연산자의 종류에 따라 달라진다.
     * */

    // 1. 숫자와 숫자 연산
    System.out.println(123 + 456);
    System.out.println(123 - 23);
    System.out.println(123 * 10);
    System.out.println(123 / 10);

    /* 컴퓨터가 값을 처리하는 원칙
    * 같은 타입끼리만 연산이 가능
    * 같은 타입의 연산은 같은 타입이 된다.
    * */

    // 2. 실수와 실수 연산
    System.out.println("=== 실수와 실수 ===");
    System.out.println(1.23 + 1.23);
    System.out.println(1.23 - 0.5);
    System.out.println(1.23 * 0.5);
    System.out.println(1.23 / 0.5);
    System.out.println(1.23 % 1.0);

    // Java에서 실수(float, double)은 실제 값이 아니라 근사치

    // 자동 형변환
    System.out.println(123 + 0.5);
    System.out.println(123 - 0.5);
    System.out.println(123 * 0.5);
    System.out.println(123 / 0.5);
    System.out.println(123 % 0.5);

    // 문자와 문자의 연산
    System.out.println('A' + 'B');
    System.out.println('A' + 0);
    System.out.println('a' + 24);

    // 문자와 실수의 연산
    System.out.println('A' + 0.5);
    System.out.println('A' - 0.5);
    System.out.println('a' * 0.5);

    // 문자열과 문자열의 연산 +만 됨
    System.out.println("hello" + " " + "world!");

    // 문자열과 다른 리터럴의 연산
    System.out.println("helloworld" + 123);
    System.out.println("helloworld" + 123.456);
    System.out.println("helloworld" + 'a');
    System.out.println("helloworld" + true);
    System.out.println("123" + "456");

    System.out.println(true == true);
    System.out.println(true != true);



  }
}
