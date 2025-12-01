package com.beyond.section04.wrapper;

public class Application1 {
  public static void main(String[] args) {

    /* Wrapper Class 사용법 이해하기 */
    int num = 128;

    //  기본 자료형 변수는 객체가 아니다!! (. 연산자로 참조할 것이 없음)
    //  System.out.println(num.?);

    /* Boxing : int -> Integer */
    // Integer iNum = new Integer(num);  // jdk 1.9부터 Deprecated
    Integer iNum = Integer.valueOf(num);

    System.out.println(iNum.intValue());  // 저장된 값 int로 반환

    /* Auto Boxing(컴파일러) */
    Integer iNum2 = 300;  // Integer.valueOf(300);

    System.out.println("iNum2 = " + iNum2);


    /* Unboxing : Integer -> int */
    int num3 = iNum2.intValue();

    /* Auto unboxing */
    int num4 = iNum2; // == iNum2.intValue()

    // int == Integer ->  int == int
    System.out.println(num == iNum);  // Auto Unboxing


  }
}
