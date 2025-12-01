package com.ohgiraffers.section01.polymorphism;

public class Application3 {

    public static void main(String[] args) {
        feed(new Rabbit());
        feed(new Goat());
        feed(new Tiger());
        feed(new Animal());
    }

    public static void feed(Animal animal) {
        System.out.println("feeding " + animal.getClass().getSimpleName());
    }

}
