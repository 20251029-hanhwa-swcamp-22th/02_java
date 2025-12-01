package com.ohgiraffers.section01.polymorphism;

public class Rabbit
    extends Animal
{
    @Override
    public void eat() {
        System.out.println(" 토끼는 당근을 먹어요 ");
    }

    @Override
    public void move() {
        System.out.println(" 토끼는 엉덩이 흔들면서요  ");
    }

    @Override
    public void sleep() {
        System.out.println(" 토끼는 당근을 먹어요 ");
    }
    public void jump() {
        System.out.println(" 토끼는 깡총깡총 먹어요 ");
    }
}
