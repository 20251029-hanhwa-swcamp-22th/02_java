package com.ohgiraffers.section01.polymorphism;

public class Application4 {

    public static void main(String[] args) {
        getAnimal(1).eat();
    }

    public static Animal getAnimal(int num) {
        Animal animal = null;
        switch (num) {
            case 1: animal = new Animal(); break;
            case 2: animal = new Tiger(); break;
            case 3: animal = new Goat(); break;
            case 4: animal = new Rabbit(); break;
        }
        return animal;
    }
}
