package com.ohgiraffers.section01.extend;

public class F1Car
extends RacingCar
{
    public F1Car()
    {
        super();
        System.out.println(" F1Car 생성완료");
    }

    // Car -> RacingCar -> F1Car
    @Override
    public void stop()
    {
        super.stop();
    }
}
