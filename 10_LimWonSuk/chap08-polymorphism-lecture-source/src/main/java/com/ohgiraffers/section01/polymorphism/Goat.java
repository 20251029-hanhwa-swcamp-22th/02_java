package com.ohgiraffers.section01.polymorphism;

public class Goat
extends Animal {
    @Override
    public void eat() {
        System.out.println(" 염소는 잘먹어요 ");
    }

    @Override
    public void move() {
        System.out.println(" 염소는 절벽을 타고다닙니다 ");
    }

    @Override
    public void sleep() {
        System.out.println(" 염소는 자빠져 잡니다 ");
    }

    public void heading() {
        System.out.println(" 염소는 박치기 공격을 합니다 ");
    }
}
