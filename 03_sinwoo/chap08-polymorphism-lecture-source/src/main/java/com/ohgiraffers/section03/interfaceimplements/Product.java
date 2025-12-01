package com.ohgiraffers.section03.interfaceimplements;

/* 인터페이스 상속 키워드: implements */
public class Product extends Object implements InterProduct, java.io.Serializable {

    @Override
    public void nonStaticMethod() {
        System.out.println( "Product nonStaticMethod()");
    }

    @Override
    public void abstMethod() {
        System.out.println( "Product abstMethod()");
    }
}
