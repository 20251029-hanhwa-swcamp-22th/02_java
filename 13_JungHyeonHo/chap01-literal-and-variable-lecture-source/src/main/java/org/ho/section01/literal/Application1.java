package org.ho.section01.literal;
//package는 directory 이자 folder이다옹
//현재 클래스가 어디 패키지에 있는지 알려준다옹

// 한줄 주석이다옹
/*
여러줄 주석이다옹
범위 주석이다옹
 */
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
    //System.out.println('ab'); // ''내에는 한글자만 작성 가능하다옹
    //System.out.println(''); // ''내에 한글자는 무조건 들어가야 된다옹

    // c. 문자열 형태 값 출력
    System.out.println("안녕하세요! 저는 현호입니다!"); // 문자열은 쌍따옴표 붙인다옹
    System.out.println("123"); //문자열
    System.out.println("a"); //한글자만 드가도 문자열("")

    // d. 논리형 값 출력
    System.out.println(true);
    System.out.println(false);
  }
}
