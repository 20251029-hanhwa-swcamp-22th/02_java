package com.ohgiraffers.setion04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Warpper 클래스 사용법 이해하기 */
        int num = 128;
        // int iNum = 128;
        // 기본 자료형 변수는 객체가 아니다 !! ([.] 연산자로 참조할 것이 없음)
        //  System.out.println(num.?);

        /* Boxing : int -> Integer*/
        // Integer iNum = new Integer(Num); // JDK 1.9 부터 막힘
        Integer iNum = Integer.valueOf(num);

        System.out.println(iNum.intValue()); // 저장된 값 int로 반환

        /*Auto Boxing - 자동으료 Interger 라는 객체를 만드는것 포장식 / 하지만 형변환과는 다름
         * 컴파일러가 주도함
         * 기본(같은자료형) 형변환 (int->double) 10 + 1.3 = 11/3
         *  상속 형변환 Animal a = new Tiger(); -> ((Tiger)a).bite();*/

        Integer iNum2 = 300; // integer.valueOf(300)
        System.out.println("iNum2 = " + iNum2);

        /*UnBoxing : Integer -> int*/
        int num3 = iNum2.intValue();

        /*Auto UnBoxing*/
        int num4 = iNum2; // === iNum2.intValue()

        // int == Integer -> int == int / num, iNum 과의 동일비교
        System.out.println(num == iNum); // Auto UnBoxing

    }
}
