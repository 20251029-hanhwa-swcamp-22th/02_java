package com.ohgiraffers.section03.interfaceimplements;

public class Application {

    public static void main(String[] args) {
//        InterProduct interProduct = new InterProduct() {}

        InterProduct interProduct = new Product();

        /* Overriding Methods Calls */
        interProduct.nonStaticMethod();
        interProduct.abstMethod();
        interProduct.defaultMethod();


        /* 상수형 필드 확인 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);

        /* static method */
        InterProduct.staticMethod();

    }

}
