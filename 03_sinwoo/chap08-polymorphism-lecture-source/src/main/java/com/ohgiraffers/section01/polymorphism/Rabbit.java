package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println( "Rabbit eating carrots...");
    }

    @Override
    public void move() {
        System.out.println( "Rabbit moving...");
    }

    @Override
    public void sleep() {
        System.out.println( "Rabbit sleeping...");
    }

    public void jump() {
        System.out.println( "Rabbit jumping...");
    }
}
