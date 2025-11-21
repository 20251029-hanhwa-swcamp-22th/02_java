package com.jinosoft.section02.variable;

public class Application1 {
  public static void main(String[] args) {
    // 기본 자료형

    // 정수형
    byte bnum;
    short snum;
    int inum;
    long lnum;

    // 실수형
    float fnum; // 4 Bytes
    double dnum; // 8 Bytes

    // 문자형
    char ch;

    // 논리형
    boolean isTrue; // 1 Byte

    // 참조 자료형
    String str; // 기본 자료형이 아님을 기억

    /* 변수 값 대입
    * - 선언(할당)된 변수에 값을 집어 넣는 것
    * - 대입 연산자 (=) 사용
    * - 초기화 : 선언된 변수에 최초로 값을 대입하는 것
    * */
    bnum = 1;
    snum = 2;
    inum = 3;
    lnum = 4;
    fnum = 5;
    dnum = 6;
    ch = 'a';
    str = "abc";
    isTrue = true;

    // 변수 사용
    System.out.println("int 자료형 : " + inum);


  }
}
