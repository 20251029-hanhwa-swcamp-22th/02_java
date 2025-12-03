package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] args) {

        // 1. 값의 의미 부여
        System.out.println("보너스를 포함한 급여 : " + (1_000_000 + 200_000) + "원");

        int salary = 200_000;
        int bonus = 1_000_000;
        System.out.println("보너스를 포함한 급여 : " + (bonus + salary) + "원");


        // 3. 상수 -> 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        final int age = 200;
        // 값 선언 이후에는 값 변경이 불가능하다.
        final int MAX_SCORE = 100;
        final int MIN_SCORE = 0;
    }
}
