package com.work.section02.variable;

public class Application1 {
  public static void main(String[] args) {
    /*변수 선언
    * -메모리에 값을 저장할 공간을 할당한고 공간을 부를 이름을 붙인다.
    * -자료형 : 변수 할당 시 할당될 크기와 저장될 데이터의 형식을 지정
    *
    * [작성법]
    * 자료형 변수명;
    * */

    /* 기본 자료형(primitive type) */

    /* 정수형 */
    byte  bnum;  //1byte
    short snum;  //2byte
    int   inum;  //4byte, 정수 기본형
    long  lnum;  //8byte

    /* 실수형 */
    float fnum;  //4byte
    double dnum; //8byte,  실수 기본형

    /* 문자형 */
    char ch;         //2byte
    boolean isTrue;  //1byte

    /* 문자열(String) 참조자료형 */
    String str;  // 기본 자료형이 아님을 기억해라!!

    /* 2. 변수 대입
    * - 선언(할당)된 변수에 값을 집어 넣는것
    * - 대입  연산자(=) 사용
    * - A = B -> B를 A변수에 대입하겠다.
    *
    * - 초기화 : 선언된 변수에 최초로 값을 대입하는 것~~~~*/

    bnum = 1;
    snum = 2;
    inum = 4;
    lnum = 8L;
    fnum = 4.0f;
    dnum = 8.0;
    ch = 'a';
    isTrue = true;
    str = "Hello World?!";

    /*3. 변수 사용*/
    // 변수에 저장된 값이 사용됨!
    System.out.println("str = " + str);
    System.out.println("isTrue = " + isTrue);
    System.out.println("ch = " + ch);
    System.out.println("dnum = " + dnum);
    System.out.println("fnum = " + fnum);
    System.out.println("lnum = " + lnum);
    System.out.println("inum = " + inum);
    System.out.println("inum = " + inum);
    System.out.println("bnum = " + bnum);


  }
}
