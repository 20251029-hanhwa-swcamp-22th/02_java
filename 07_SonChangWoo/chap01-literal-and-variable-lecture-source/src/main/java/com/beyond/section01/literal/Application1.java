package com.beyond.section01.literal;
// package == directory == folder
// 현재 클래스의 패키지 위치를 명시

// 한 줄 주석
/*
  범위 주석
 */


public class Application1 {

  // main method : 자바 프로그램을 실행 시키는 구문
  public static void main(String[] args) {
    // System.out.println();
    // -> 시스템 기본 장치(console)에 출력(print) 후 줄바꿈(line)

    // a. 숫자 형태의 값 출력
    System.out.println(123);
    System.out.println(1.23);

    // b. 문자 형태의 값 출력
    System.out.println('a'); // a 문자 1개, '' 홑 따옴표로 감싸야 함

    // sout == System.out.println()의 snippet(단편, 약어)
    System.out.println('1'); // '1' == 문자 1, 1 == 정수 1
    // System.out.println('ab'); // '' 내에는 한 글자만 작성 가능
    // System.out.println(''); // '' 내에는 한 글자가 무조건 필요!

    // c. 문자열 형태
    System.out.println("안녕하세요"); // "" (쌍타옴표)로 감싸져 있어야 한다
    System.out.println("123"); // 정수x, 문자x, 문자열o
    System.out.println("a"); // 한 글자만 들어가도 문자열
                             // 'a' == "a" -> false
    System.out.println(""); // 빈 문자열 : 내용은 없지만 "" 감싸짐 == (문자열)

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);


  }
}
