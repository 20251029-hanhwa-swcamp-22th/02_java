package com.ohgiraffers.setion05.time;

import java.util.Date;

public class Application1 
{
    public static void main(String[] args) 
    {
        /* 기본생성자 */
        Date today = new Date();
        System.out.println("today = " + today); // 이 코드가 해석되는 시간

        /* 매개 변수 있는 생성자*/
        Date date = new Date(0L);
        System.out.println("date = " + date);

        Date date1 = new Date(1000L);
        System.out.println("date = " + date);

        Date date2 = new Date(1000L * 60);
        System.out.println("date = " + date);

        Date date3 = new Date(1000L * 60 * 60 );
        System.out.println("date = " + date);

        Date date4 = new Date(1000L * 60 * 60 * 24);
        System.out.println("date = " + date);

        Date date5 = new Date(1000L * 60 * 60 * 24 * 31);
        System.out.println("date = " + date);
    }
}
