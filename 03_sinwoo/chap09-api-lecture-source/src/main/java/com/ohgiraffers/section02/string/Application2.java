package com.ohgiraffers.section02.string;

public class Application2 {

    public static void main(String[] args) {

        /* Heap -> Constant Pool */
        /*  - ""리터럴 표기법을 이용해 생성된 문자열이 저장되는 공간
            - 동일한 값을 가진 문자열 인스턴스를 단일 인스턴스로 관리한다
        */


        /* String 객체를 만드는 방법
        * 1. String s1 = "abc";
        * -> Constant Pool에 생성
        *
        * 2. String s2 = new String("abc");
        * -> Heap 메모리 영역에 생성
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        /* 리터럴 형태로 만든 문자열 인스턴스는 동일한 값을 가지는 인스턴스는 하나의 인스턴스로 관리한다.
         * 따라서 주소값을 비교하는 == 연산으로 비교 시 서로 동일한 stack에 저장된 주소를 비교하여 true를 반환한다.
         * */
        System.out.println("str1 == str2 : " + (str1 == str2));

        /* new로 새로운 인스턴스를 생성하게 되면 기존 인스턴스를 두고 새로운 인스턴스를 할당했기 때문에
         * == 연산으로 비교 시 서로 다른 주소값을 가지고 있기 때문에 false를 반환한다.
         * */
        System.out.println("str2 == str3 : " + (str2 == str3));

        /* 동일한 방식으로 인스턴스를 생성하고 값 또한 같더라도
         * 새로운 인스턴스를 생성하는 방식은 서로 다른 주소를 가지고 있기 때문에 false를 반환한다.
         * */
        System.out.println("str3 == str4 : " + (str3 == str4));

        /* 하지만 4개의 문자열 모두 동일한 hashCode값을 가진다.
         * 동일한 문자열은 동일한 hashCode값을 반환하도록 재정의 되어 있기 때문이다.
         * */
        System.out.println("str1의 hashCode : " + str1.hashCode());
        System.out.println("str2의 hashCode : " + str2.hashCode());
        System.out.println("str3의 hashCode : " + str3.hashCode());
        System.out.println("str4의 hashCode : " + str4.hashCode());

    }
}
