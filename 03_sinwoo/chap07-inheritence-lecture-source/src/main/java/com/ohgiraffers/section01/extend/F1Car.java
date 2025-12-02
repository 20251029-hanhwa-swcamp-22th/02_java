package com.ohgiraffers.section01.extend;

public class F1Car extends RacingCar {

    public F1Car() {
        super();
    }

    @Override
    public void stop() {
        System.out.println("F1Car stop");
    }

}
