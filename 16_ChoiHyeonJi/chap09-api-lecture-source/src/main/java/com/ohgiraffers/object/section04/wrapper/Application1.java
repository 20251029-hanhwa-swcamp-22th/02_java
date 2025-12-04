package com.ohgiraffers.object.section04.wrapper;

public class Application1 {
  public static void main(String[] args) {
    /* Wrapper Class 사용법 이해하기 */
    int num = 128;
    // 기본 자료형 변수는 객체가 아니다!!! (. 연산자로 참조할 것이 없음)
    // System.out.println(num.?); // 객체가 아니라서 참조 안됨

    /* Boxing : int -> Integer */
    //Integer iNum = new Integer(num); //jdk 1.9 부터 Deprecated
    Integer iNum = Integer.valueOf(num);

    System.out.println(iNum.intValue());// 저장된 값 int로 반환

    /* Auto Boxing(컴파일러) */ // 박싱과 캐스팅은 다른 것임. 포장과 형변환은 다름.
    Integer iNum2 = (Integer) 300; // 왜 이렇게 되는지 알아야됨 // -> Integer.valueOf(300)

    // 기본 자료형의 형변환,
    // (int -> double)  10 +  1.3 = 11.3
    //
    // 상속관계 내 부모/자식 형변환
    // Animal a = new Tiger();
    // ((Tiger)a).bite();

    System.out.println("iNum2 = " + iNum2); //  .intVlue inum에잇는 int값을 가져오겠다 // tostring string 값으로 바꿔서 보여줌

    /* Unboxing : Integer -> int */
    int num3 = iNum2.intValue();

    /* Auto Unboxing */
    int num4 = iNum2; // == iNum2.intValue()


    // int == Integer -> int == int
    System.out.println(num == iNum); // Auto Unboxing
    //                 int == Integer



  }
}
