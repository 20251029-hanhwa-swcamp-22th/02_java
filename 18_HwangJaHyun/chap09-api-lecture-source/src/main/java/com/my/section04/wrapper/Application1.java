package com.my.section04.wrapper;
/* 참고
 * 기본 자료형의 형변환
 * (int -> double) 10 + 1.3 = 11.3
 * 10.0 + 1.3 =11.3
 *
 * 상속 관계 내 부모/자식 형변환
 * Animal a = new Tiger(); 업캐스팅
 * ((Tiger)a).bite(); 다운캐스팅
 * */
public class Application1 {
  public static void main(String[] args) {
    /* Wrapper Class 사용법 이해하기 */
    int num = 128;

    // 기본 자료형 변수 != 객체
    // ( .연산자로 참조 불가 )


    /* Boxing : int -> Integer */
    //Integer iNum = new Integer(num); // jdk 1.9 부터 Deprecated
    Integer iNum = Integer.valueOf(num);

    System.out.println(iNum.intValue());

    /* Auto Boxing(컴파일러) */
    Integer iNum2 = 300;
    /*
    ==> 컴파일러가 Integer.valueOf(300)로
    Integer : 참조자료형 extends Object
    300 : int
    Integer inum2 = new Integer()
    박싱 : 형변환 X, 객체 생성 O
    */
    System.out.println("iNum2 : " + iNum2);

    /* unboxing : Integer -> int */
    int num3 = iNum2.intValue();

    /* Auto unboxing */
    int num4 = iNum2; // == iNum2.intValue();

    // int == Integer -> int == int
    System.out.println(num == iNum);
  }
}

