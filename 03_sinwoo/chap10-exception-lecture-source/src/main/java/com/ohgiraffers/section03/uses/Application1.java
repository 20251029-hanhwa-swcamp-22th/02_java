package com.ohgiraffers.section03.uses;

import java.io.IOException;

public class Application1 {

    public static void main(String[] args) {

        /* checked, unchecked exception 확인하기.
        *   checked : 개발자가 반드시 예외처리 구문을 작성해야 함
        *   unchecked : 개발자가 선택적으로 예외처리 구문을 작성할 수 있음.
        * */

        // checked Exception
        // 오류 내용: 처리되지 않은 예외
        // 해결 방법: 예외 처리 구문(try-catch, throws) 작성 필수
//        try {
//            throw new IOException();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // Unchecked Exception
        // 치명적이지 않은 예외 (가벼운 실수, if문 누락)
        // throw new RuntimeException();


        // NullPointerException은 어떻게 처리할까?
        // if문 -> 안되면 예외처리.
        String str = null;
        if (str != null){
            System.out.println(str.length());
        }else{
            throw new NullPointerException();
        }
    }
}
