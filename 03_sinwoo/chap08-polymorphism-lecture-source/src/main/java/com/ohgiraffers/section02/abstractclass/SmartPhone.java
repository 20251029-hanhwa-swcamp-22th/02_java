package com.ohgiraffers.section02.abstractclass;

/* 추상 클래스 상속 받기 -> 오버라이딩 강제화 확인 */
public class SmartPhone extends Product {


    @Override
    public void abstractMethod() {
        System.out.println("Product abstMethod()를 SmartPhone이 Overriding함");
    }


}
