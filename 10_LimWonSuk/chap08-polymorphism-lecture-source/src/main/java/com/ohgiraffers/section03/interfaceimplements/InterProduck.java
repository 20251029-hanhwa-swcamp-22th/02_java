package com.ohgiraffers.section03.interfaceimplements;

/* 인터페이스 */
public interface InterProduck
{
    // 상수형 필드 (public static final을 작성하지 ㅇ낳아도 자동으로 붙음)
    public static final int MAX_NUM = 100;
    int MIN_NUM = 0;

    // 추상 메서드 (묵시적으로 모든 메서드는 public abstract)
    /*public InterProduck()
    {
    }
    생성자는 가질 수 없다 !!*/
 /*   public abstract void nonStaticMethod();
   *//* void abstMethod;*/
   public abstract void nonStaticMethod();
    void abstMethod();
    /* JDK 1.8 (Java 8)에서 추가된 기능
    * 1) static 메서드 선언, 정의가 가능
    * */
    public static void staticMethod()
    {
        System.out.println("InterProduct에 정의된 staticMethod()");
    }
    /*2 Default 메서드 선언, 정의할 수 있다
    *  - default 키워드를 명시
    *  - non-static 메서드만 가능
    *  - 오버라이딩이 강제되지 않는다*/
     public default void defaultMethod()
     {
         System.out.println("InterProduct에 정의된 defaultMethod");
     }
}
