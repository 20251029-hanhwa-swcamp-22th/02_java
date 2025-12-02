package com.ohgiraffers.section03.interfaceimplements;

public class Application2 {

    public static void main(String[] args) {

        Calculator calculator = new KWSCalculatorv3();

        System.out.println("Plus : " + calculator.plus(10, 12));
        System.out.println("Minus : " + calculator.minus(10, 12));
        System.out.println("Multiple : " + calculator.multiple(10, 12));
        System.out.println("Divide : " + calculator.divide(10, 12));
        System.out.println("Mod : " + calculator.mod(10, 12));

    }
}
