package com.ohgiraffers.section02.abstractclass;

/*
* 추상 클래스
*   - 인스턴스로 생성 불가능한 클래스
* */
public abstract class Product {

    // 추상 클래스는 일반적인 필드를 가질 수 있다.
    private int nonStaticField; // 인스턴스 변수
    private static int staticField; // 클래스 변수

    // constructor
    public Product() {} // 추상클래스는 직접 인스턴스를 생성할 수 없지만 상속받은 sub class 내부에 super class부분 생성을 위해 필요하다.

    // methods
    // 추상클래스는 일반적인 메서드를 가질 수 있다.
    public void nonStaticMethod() {
        System.out.println("Product Class nonStaticMethod()");
    }

    public static void staticMethod() {
        System.out.println("Product Class staticMethod()");
    }

    /*추상 메서드
    *   - 추상 메서드가 존재하는 클래스에는 반드시 abstract 키워드가 붙어야 한다.
    *   - 추상메서드를 상속받은 서브클래스는 추상클래스를 무조건 오버라이딩 해야 한다.
    * */

    public abstract void abstractMethod();

}
