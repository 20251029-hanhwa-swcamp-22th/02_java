package com.ohgiraffers.section01.extend;

public class RacingCar extends Car{

    {
        setName( "Racing Car");
        setSpeed(100);
    }

    public RacingCar() {
        super();
        System.out.println("RacingCar 기본 생성자");
    }

    @Override
    public void run() {
        System.out.println("RC run");
    }

    @Override
    public void stop() {
        System.out.println("RC stop");
        super.stop();
    }

    @Override
    public void soundHorn() {
        System.out.println("위잉");
    }

}
