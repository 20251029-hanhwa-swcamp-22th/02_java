package com.mycompany.section02.variable;

public class Application1 {
  public static void main(String[] args) {

    /* 변수 선언
    - 메모리에 값을 저장할 공간을 할당하고, 이름을 붙임
    - 자료형 : 변수 할당 시, 할당될 크기와 저장될 데이터의 형식을 지정

    * [작성법]
    * 자료형 변수명;
    * */
    
    /* 기본 자료형 (primitive type)*/
    
    /* 정수형 */
    
    byte  bNum;  // 1 byte
    short sNum;  // 2 byte
    int   iNum;  // 4 byte, 정수 기본형
    long  lNum;  // 8 byte

    /* 실수형 */
    float   fNum; // 4byte
    double  dNum; // 8byte, 실수 기본형

    /* 문자형 */
    char ch; // 2byte

    /* 논리형 */
    boolean isTrue;
    
    /* 문자열(String) - 참조 자료형 */
    String str; // 기본 자료형이 아님

    /* 2. 변수 값 대입
    - 선언(할당)된 변수에 값을 집어 넣는 것
    - 대입 연산자 (=) 사용
    - A = B -> B를 A 변수에 대입하겠다.

    - 초기화 : 선언된 변수에 최초로 값을 대입하는 것.
    * */

    bNum = 1;
    sNum = 2;
    iNum = 4;
    lNum = 8L;
    fNum = 4.0f;
    dNum = 8.0;
    ch = 'a';
    isTrue = true;
    str = "Hello World";

    /* 변수 사용 */
    // 변수에 저장된 값이 사용됨
    System.out.println("bNum = " + bNum);
    System.out.println("sNum = " + sNum);
    System.out.println("iNum = " + iNum);
    System.out.println("lNum = " + lNum);
    System.out.println("fNum = " + fNum);
    System.out.println("dNum = " + dNum);
    System.out.println("ch = " + ch);
    System.out.println("isTrue = " + isTrue);
    System.out.println("str = " + str);
  }
}
