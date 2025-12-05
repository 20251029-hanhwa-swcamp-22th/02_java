package com.ohgiraffers.section01.extend;

public class Car
{
    private boolean runningStatus; //runningStatus라는 필드형성
    public Car()
    {
        System.out.println(" 기본생성자 호출됨 " );
    }
    public void run()
    {
        runningStatus = true;
        System.out.println(" 달린다 " );

        runningStatus = false;
        System.out.println(" 멈춘다 " );

    }
    public void soundHorn()
    {
        if(runningStatus)
        {
            System.out.println(" 빵빵 " );
        }
        else
        {
            System.out.println(" 주행중이아님 " );
        }
    }
    public void stop()

    {

    }
}
