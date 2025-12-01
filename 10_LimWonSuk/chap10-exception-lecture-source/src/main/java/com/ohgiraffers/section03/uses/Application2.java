package com.ohgiraffers.section03.uses;

import java.io.IOException;

public class Application2
{
    public static void main(String[] args)
    {
        /* finally
        *  - try 구문 내에서 예외 발생 여부와 관계없이 반드시 마지막에 수행함
        *  try, catch에서 return을 만나도 먼저 finally는 무조건 실행됨
         * */


        try
        {
            System.out.println(" try 구분 수행 ");
            if(1 == 0) throw new IOException();
            // 1 == 1 -> try, catch, finally
            // 1 == 0 -> try, finally

           // throw new IOException();
        }
        catch (IOException e)
        {
            System.out.println(" catch 구분 수행 ");
        }
        finally
        {
            System.out.println(" finally 구분 수행 ");
        }
    }
}
