package com.jinosoft.section01.literal;
// package == directory == folder


// 한 줄 주석 (CTRL + /)
//미아ㅣㅁ나,ㅇ
//ㅁ임ㄴ아ㅣ만이만ㅇ
//    마ㅣ나이ㅏㅁㄴㅇ
/*
범위 주석
어때요
*/

import java.util.Arrays;

public class Application1 {
  //메인 메서드 (main method) : 자바 프로그램을 실행시키는 구문
  public static void main(String[] args) {
    // 리터럴 출력

    // System에 print 하겠다 ln 출력 후 줄바꿈
    System.out.println(123);
    System.out.println(1.23);

    // b. 문자 향태의 값 출력
    System.out.println('a'); // a라는 문자 한 개

    // sout == System.out.println()의 snippet
    System.out.println('1'); // 1이라는 글자
                             // 1 == '1' false

    System.out.println("ab"); // '' 안에는 한 글자만 작성 가능

    // System.out.println(''); // ''안에는 무조건 한 글자가 필요
    
    // c. 문자열 형태 값 출력
    System.out.println("안녕하세요."); // 문자열은 "" 로 감싸져 있어야한다.
    System.out.println("123"); // 정수x 문자x 문자열o
    System.out.println("a"); // 'a' == "a" false

    System.out.println(""); // 빈 문자열

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);



  }
}
