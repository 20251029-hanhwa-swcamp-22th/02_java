package com.ohgiraffers.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인*/
public class SmartPhone
    extends Prodeuct
{

    // 강제로 오버라이딩
    @Override
    public void abstMethod()
    {
        System.out.println(" Product의 abstMethod를 SmartPhone이 오버라이딩함");
    }
}
