package com.ohgiraffers.section02.variable;

public class Application1 {
    public static void main(String[] args) {
        /* 변수 선언 - 메모리에 값을 저장할 공간을 할당하고 이름을 붙임
        * - 자료형 : 변수 할당 시 할당 된 크기와 저장된 데이터의 형식을 지정.
        * [작성법]
        * 자료형 변수명;
        * */

        /* 기본 자료형 Primitive type */

        /* 정수형 */
        byte bnum; // 1byte
        short snum; // 2byte
        int inum; // 4byte
        long lnum; // 8byte

        /* 실수향 */
        float fnum; // 4byte
        double dnum; // 8byte, 실수 기본형

        /* 문자형 */
        char ch; // 2byte

        /* 논리형 */
        boolean isTrue; // 1byte

        /* 문자열 (참조 자료형) */
        String str; // 기본 자료형이 아님을 명시.

        /* 2. 변수 값 대입
        * 선언, 할당된 변수의 값을 집어 넣는 것
        * 대입 연산자 (=) 사용.
        * A = B > B를 A에 대입하겠다.
        * 초기화 : 선언된 변수에 최초로 값을 대입하는 것.
        * */

        bnum = 1;
        snum = 2;
        inum = 3;
        lnum = 4;

        fnum = 1.23f;
        dnum = 1.23;

        ch = 'a';

        isTrue = true;
        str = "hello world";

        /* 3.변수 사용 */
        System.out.println("bnum = " + bnum);
        System.out.println("snum = " + snum);
        System.out.println("inum = " + inum);
        System.out.println("lnum = " + lnum);
        System.out.println("fnum = " + fnum);
        System.out.println("dnum = " + dnum);
        System.out.println("ch = " + ch);
        System.out.println("isTrue = " + isTrue);
        System.out.println("str = " + str);
    }
}
