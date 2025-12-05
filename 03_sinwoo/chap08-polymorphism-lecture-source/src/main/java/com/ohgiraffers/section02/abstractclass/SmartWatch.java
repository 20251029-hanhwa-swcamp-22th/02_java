package com.ohgiraffers.section02.abstractclass;

public class SmartWatch extends Product{

    @Override
    public void abstractMethod() {
        System.out.println("Product abstMethod()를 SmartWatch가 Overriding함");
    }
}
