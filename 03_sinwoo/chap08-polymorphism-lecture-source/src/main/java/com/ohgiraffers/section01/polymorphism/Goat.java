package com.ohgiraffers.section01.polymorphism;

public class Goat extends Animal{

    @Override
    public void eat() {
        System.out.println( "Goat eating grass...");
    }

    @Override
    public void move() {
        System.out.println( "Goat moving...");
    }

    @Override
    public void sleep() {
        System.out.println( "Goat sleeping...");
    }

    public void heading() {
        System.out.println( "Goat heading...");
    }

}
