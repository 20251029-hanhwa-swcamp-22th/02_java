package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {
    /* Constructor는 가질 수 없다. */

    // 상수형 필드
    public static final int MAX_NUM = 100;
    int MIN_NUM = 0;

    // 추상 메서드 (묵시적으로 모든 메서드는 public abstract)
    public abstract void nonStaticMethod();
    void abstMethod(); // public abstract 생략 가능.

    /* jdk1.8(java8)에서 추가된 기능 */
    /* 1) static 메서드 선언, 정의가 가능하다 */
    public static void staticMethod() {
        System.out.println("InterProduct에 정의된 staticMethod()");
    }
    /* 2) Default 메소드를 선언, 정의 할 수 있다
    *   - default 키워드를 명시
    *   - non-static method만 가능
    *   - Overriding이 강제되지 않는다
    * */
    public default void defaultMethod() {
        System.out.println("InterProduct에 정의된 defaultMethod()");
    }

}
