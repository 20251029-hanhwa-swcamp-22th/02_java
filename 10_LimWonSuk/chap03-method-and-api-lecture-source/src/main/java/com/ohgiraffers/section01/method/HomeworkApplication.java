package com.ohgiraffers.section01.method;

public class HomeworkApplication {
    public static void main(String[] args){
        Homework HW = new Homework();
        HW.Method();

        int result1 = HW.sum10();
        System.out.println("1~10의 합 : " + result1);

        HW.PlusMethod(10, 20);

        int sum = HW.PlusMethod(10, 20);

        int minus = HW.MinusMethod(20, 10);
        System.out.println("20 - 10 = " + minus);
    }
}
