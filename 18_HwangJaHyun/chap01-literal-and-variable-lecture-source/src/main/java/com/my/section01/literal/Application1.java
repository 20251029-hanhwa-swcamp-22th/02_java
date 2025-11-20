package com.my.section01.literal;
// package == directory == foldder
// 현재 클래스의 패키지 위치를 명시

// 한줄 주석 ctrl + /
/*
  범위 주석 ctrl + shift + /
*/

// 자동 정렬
// ctrl + alt + l
// ctrl + alt + shift + l

public class Application1 {
  // main method : 자바 프로그램을 실행시키는 구문
  public static void main(String[] args){
    System.out.println("Hello World");

    // System.out.println();
    // -> 시스템 기본 장치(console)에 출력(print)후 줄바꿈(line)

    // a. 숫자 형태의 값 출력
    System.out.println(123);
    System.out.println(1.23);

    // b. 문자 형태의 값 출력
    System.out.println('a'); // a 문자 1개, '' 홑따옴표로 감싸야 함

    // sout == System.out.println()의 snnipet
    System.out.println('1'); // '1' == 문자 1, 1 == 정수 1
                             // '1' == 1 -> false
    // System.out.println('ab'); // '' 내에는 한 글자만 작성 가능
    // System.out.println(''); // '' 내에는 한 ㄱ ==글자가 무조건 필요

    // c. 문자열 형태 값 출력
    System.out.println("안녕하세요"); // 문자열 ""(쌍따옴표)로 감싸야 함
    System.out.println("123");  // 정수X 문자X 문자열
    System.out.println("a");    // 한 글자만 들어가도 문자열
                                // 'a' == "a" -> false
    System.out.println("");     // 빈 문자열 : 내용은 없지만 ""로 감싸짐 == (문자열)

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);
  }
}
