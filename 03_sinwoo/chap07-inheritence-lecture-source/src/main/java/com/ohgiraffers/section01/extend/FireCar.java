package com.ohgiraffers.section01.extend;

public class FireCar extends Car{

    {
        setName("Fire Car");
        setSpeed(1000);
    }

    public FireCar() {
        super();
        System.out.println("FireCar 기본 생성자");
    }

    @Override
    public void run() {
        System.out.println("FC run");
    }

    @Override
    public void stop() {
        System.out.println("FC stop");
    }

    @Override
    public void soundHorn() {
        System.out.println("빠ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅇ!");
    }


}
