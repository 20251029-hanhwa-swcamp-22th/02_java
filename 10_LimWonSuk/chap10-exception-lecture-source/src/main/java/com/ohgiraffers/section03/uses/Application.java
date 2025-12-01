package com.ohgiraffers.section03.uses;

import java.io.IOException;

public class Application
{
    public static void main(String[] args)
    {
        /*Checked, unChecked Exception 확인하기
        *
        * - Checked : 개발자가 반드시 예외 처리 구문을 작성해야 되는 예외
        * - Unchecked : 개발자가 선택적으로 예외 처리 구문을 작성해도 되는 예외
        *
        * */


        // CHECKED eXCEPTION
        // 오류내용 : 처리되지 않은 예외
        // 해결방법 : 예외 처리 구문 (TRY-CATCH, THROWS) 작성필수
        try
        {
            throw new IOException();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        // Unchecked Exception
        // - 치명적이지 않은 예외 (가벼운 실수, if문 누락)
        // throw new RuntimeException();


        // NullPointerException은 어떻게 처리할까? -> if문사용
        // if문, 안됨면 예외 처리 구문

        String str = null; // null = 참조하는 값
        if (str !=null)
        System.out.println(str.length());

    }
}
