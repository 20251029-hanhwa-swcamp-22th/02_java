package com.ohgiraffers.section03.interfaceimplements;

public class Application2
{
    public static void main(String[] args)
    {
     // Calculator calculator = new LWSCalculator();
     Calculator calculator = new LWSCalculator();

        System.out.println("plus : " + calculator.plus(240, 710));
        System.out.println("minus : " + calculator.minus(230, 22));
        System.out.println("multiple : " + calculator.multiple(120, 7));
        System.out.println("divide : " + calculator.divide(4220, 70));
        System.out.println("mod : " + calculator.mod(2, 20));
    }
}

