package com.ohgiraffers.section01.literal;

public class Application3 {

    public static void main(String[] args) {

        // 문자열 합치기 테스트
        // 문자열 두개 합치기
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");

        // 문자열 3개 합치기
        System.out.println(9 + 9 + "9");
        System.out.println(9 + "9" + 9);
        System.out.println("9" + 9 + 9);
        System.out.println("9" + (9 + 9));

        System.out.println("10 + 20 : " + (10 + 20));
        System.out.println("10 - 20 : " + (10 - 20));
        System.out.println("10 / 20 : " + (10 / 20));
        System.out.println("10 % 20 : " + (10 % 20));
        System.out.println("10 * 20 : " + (10 * 20));

    }

}
