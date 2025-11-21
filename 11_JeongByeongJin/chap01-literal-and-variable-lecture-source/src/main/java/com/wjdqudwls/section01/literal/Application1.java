package com.wjdqudwls.section01.literal;

public class Application1 {

  //main method: 자바 프로그램을 실행시키는 구문
  public static void main(String[] args) {
    // 시스템 기본 장치에 출력 후 줄바꿈 하겠다.
    System.out.println(123);
    System.out.println(1.23);

    //b. 문자 형태의 값 출력
    System.out.println('a');

    //sout == System.out.println()의 약어
    System.out.println('1'); // '1' == 문자 1, 1 == 정수1
    // '1' == 1 -> false
    // System.out.println('ab'); // ''내에는 한글자만 작성 가능하다옹
    // System.out.println(''); // ''내에 한글자는 무조건 들어가야 된다옹

    // c. 문자열 형태 값 출력
    System.out.println("안녕하세요"); // 문자열은 ""(쌍따옴표)로 감싸져 있어야 한다.
    System.out.println("123"); // 정수 x 문자 x 문자열 o
    System.out.println("a"); // 한 글자만 들어가도 문자열("")
                             // 'a' == "a" --> false
    System.out.println("");  // 빈 문자열 : 내용은 없지만 "" 감싸짐 == (문자열)

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);
  }
}