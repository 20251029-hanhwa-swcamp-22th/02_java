package com.mycompany.section04.wrapper;

public class Application1 {
  public static void main(String[] args) {

    /* Wrapper Class 사용법 이해하기 */

    int num = 128;

    // 기본 자료형 변수는 객체가 아니다(. 연산자로 참조할 것이 없음)
//    System.out.println(num.?);

    /* Boxing : int -> Integer */
//    Integer iNum = new Integer(num); // jdk 1.9 부터 Deprecated
    Integer iNum = Integer.valueOf(num);

    System.out.println(iNum.intValue()); // 저장된 값 int로 반환

    /* Auto Boxing (컴파일러)*/
    Integer iNum2 = 300;
    /* 배운 형변환 종류
    * 1) 기본 자료형의 형변환
    * 2) 상속 관계내 부모/자식 형변환(업/다운캐스팅)
    *
    * 위의 형변환과 다른 개념으로, 300이란 int 자료형을 Integer 클래스로 자동으로 변환 해줌 (100-> Interger.valueOf(100))으로 변환)
    * */

    System.out.println("iNum2 = " + iNum2);

    /* Unboxing : Integer -> int */
    int num3 =  iNum2.intValue();

    /* Auto Unboxing */
    int num4 = iNum2; // 컴파일러가 .intValue() 넣어줌

    // int == Integer -> int == int
    System.out.println(num == iNum); // Auto-Unboxing
  }
}