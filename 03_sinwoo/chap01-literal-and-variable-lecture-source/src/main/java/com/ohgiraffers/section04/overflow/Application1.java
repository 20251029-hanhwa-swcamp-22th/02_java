package com.ohgiraffers.section04.overflow;

public class Application1 {

    public static void main(String[] args) {
        /*
        * 오버플로우
        *  - 초기화 외 연산 수행 시 저장되는 값이 변수 값의 범위르 초과할 때 발생하는 현상
        * */

        byte bnum = 127;
        System.out.println(++bnum);

        /* 오버플로우 발생 여부는 연산 후(프로그램 실행 중)에만 알 수 있기 때문에 처음 코드를 작성할 때 저장되는 값의 저장을 잘 예측해야 한다. */
    }
}
