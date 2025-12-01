package com.kang.section03.interfaceimplements;

public class Application {

  public static void main(String[] args) {

    /* 인터페이스 인스턴스를 생설할 수 없다 */
    // InterProduct interProduct = new InterProduct();


    /* 인터페이스는 부모 타입 참조 변수가 될 수 있따. (업캐스팅) */
    InterProduct interProduct = new Product();

    /* 오버라이딩된 메서드 호출 */
    interProduct.nonStaticMethod();
    interProduct.abstMethod();

    /* 인터페이스 제공 default 메서드 호출 */
    interProduct.defaultMethod();

    /* 상수형 필드 확인 (인터페이스명.필드명 */
    System.out.println(InterProduct.MAX_NUM);
    System.out.println(InterProduct.MIN_NUM);

    /* static 메서드 호출 확인 (인터페이스명. 메서드명()) */
    InterProduct.staticMethod();


  }
}
