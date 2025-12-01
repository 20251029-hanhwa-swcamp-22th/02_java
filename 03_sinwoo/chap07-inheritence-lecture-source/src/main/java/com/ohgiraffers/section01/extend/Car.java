package com.ohgiraffers.section01.extend;

public class Car {

    private String name;
    private int speed;

    public Car() {
        System.out.println("Car 기본 생 성 자 호 출 됨");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        System.out.println("Car run");
    }

    public void stop() {
        System.out.println("Car stop");
    }

    public void soundHorn() {
        System.out.println("빵!");
    }

}
