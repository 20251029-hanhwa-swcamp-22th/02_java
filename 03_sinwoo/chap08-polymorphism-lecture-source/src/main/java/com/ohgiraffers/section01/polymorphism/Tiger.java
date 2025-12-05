package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger eating meat...");
    }

    @Override
    public void move() {
        System.out.println("Tiger moving...");
    }

    @Override
    public void sleep() {
        System.out.println("Tiger sleeping...");
    }

    public void bite() {
        System.out.println("Tiger biting...");
    }
}
