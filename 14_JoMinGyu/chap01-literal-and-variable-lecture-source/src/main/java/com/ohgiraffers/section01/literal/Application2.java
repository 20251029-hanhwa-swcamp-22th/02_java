package com.ohgiraffers.section01.literal;

public class Application2 {

  public static void main(String[] args) {
    System.out.println(1.23 + 1.23);
    System.out.println(1.23 / 0.5);

    // 왜 0.23이 아닌 0.229999...가 나오나?
    System.out.println(1.23 % 1.0);
    // 이진수 표현 + 부동소수점 때문에
    // java에서 실수는 근사치 -> 은행권에서 사용 안함

    System.out.println("정수와 실수");
    System.out.println(123 + 0.5);
    System.out.println(123 - 0.5);
    System.out.println(123 * 0.5);
    System.out.println(123 / 0.5);
    System.out.println(123 % 0.5);

    System.out.println("문자와 문자");
    System.out.println('a' + 0);
    System.out.println('a' + 'b');
    System.out.println('a' - 'b');
    System.out.println('a' * 'b');
    System.out.println('a' / 'b');
    System.out.println('a' % 'b');

    System.out.println("문자와 정수");
    System.out.println('A' + 0);
    System.out.println('A' + 1);
    System.out.println('A' - 1);
    System.out.println('A' * 2);
    System.out.println('A' / 2);
    System.out.println('A' % 2);

    System.out.println("문자와 실수");
    System.out.println('a' + 1.0);
    System.out.println('a' - 1.0);
    System.out.println('a' * 1.2);
    System.out.println('a' / 0.5);
    System.out.println('a' % 0.5);

    System.out.println("문자열과 문자열");
    System.out.println("hello" + "world");

    System.out.println("문자열과 다른 리터럴");
    System.out.println("helloworld"+123);
    System.out.println("helloworld"+123.456);
    System.out.println("helloworld"+'a');
    System.out.println("helloworld"+true);
    System.out.println("123"+"456");
  }

}
