// 한 줄 주석

/*
범위 주석
*/

//package == directory == folder
// 현재 클래스의 위치를 명시
package com.mycompany.section01.literal;

public class Application1 {

  //main methode : JAVA 프로그램을 실행 시키는 구문
  public static void main(String[] args) {

    // literal 출력
    // System.out.println();
    // > 시스템 기본 장치에 출력(print) 후 줄바꿈(line)

    // a. 숫자 형태의 값 출력
    System.out.println(123);
    System.out.println(1.23);

    // b. 문자 형태의 값 출력
    System.out.println('a'); // a 문자 1개, '' 홑 따옴표로 감싸야함

    // sout == System.out.println() 의 snippet(단편, 약어)
    System.out.println('1'); // '1' == 문자 1, 1 = 숫자 1 (정수)
    System.out.println('1' == 1); // false

//    System.out.println('ab'); // 에러 발생 : '' 내에는 한 글자만 작성 가능
//    System.out.println(''); // 에러 발생 : '' 내에는 반드시 한 글자가 작성되어야 한다.

    // c. 문자열 형태의 값 출력
    System.out.println("안녕하세요"); // 문자열은 "" 쌍 따옴표로 감싸야함
    System.out.println("123"); // 정수 x, 문자 x, 문자열
    System.out.println("a"); // 한 글자만 들어가도 문자열(")
    System.out.println(""); // 빈 문자열 : 내용은 없지만 "" 감싸짐

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);


  }
}
