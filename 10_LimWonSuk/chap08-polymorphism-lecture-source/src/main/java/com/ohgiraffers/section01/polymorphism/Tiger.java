package com.ohgiraffers.section01.polymorphism;

public class Tiger
extends Animal {
    @Override
    public void eat() {
        System.out.println(" 호랑이 고기를 ");
    }

    @Override
    public void move() {
        System.out.println(" 호랑이 어슬렁어슬렁 ");
    }

    @Override
    public void sleep() {
        System.out.println(" 호랑이 코골면서");
    }

    public void bite() {
        System.out.println(" 호랑이 이빨로 앙물어요 ");

    }
}

