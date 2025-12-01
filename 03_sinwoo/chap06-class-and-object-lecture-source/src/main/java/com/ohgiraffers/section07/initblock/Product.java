package com.ohgiraffers.section07.initblock;

public class Product {
    /*
    필드 (==멤버변수)
    1. 인스턴스 변수 (Non-static)
     - 생성 : new연산자에 의해서 생성
      - 소멸 : 참조되지 않을 때 GC에 의해 제거

    2. 클래스 변수 (static)
     - 생성 : 프로그램 실행 시
     - 소멸 : 프로그램 종료 시
     */

    // 1. JVM 기본 값.
    private int productNumber;

    // 2. 명시적 초기화.
    private String name = "텀블러";

    private int price = 40000;

    private static String brand = "스타벅스";

    // 3. 인스턴스 초기화 블럭
    {
        price = 50000;
        System.out.println("인스턴스 초기화 블럭 동작함");
    }

    /* static 초기화 블럭(프로그램 실행 시 딱 한번만 동작) */
    static {
        brand = "dadadad";
        System.out.println("static 초기화 블럭 동작함");
    }

    public Product() {
        System.out.println("기본 생성자 동작");
        this.brand = "qwdawd";
    }

    public Product(int price) {
        this.price = price;
        System.out.println("매개 변수가 있는 생성자가 동작함.");
    }

    /**
     * 객체에 저장된 필드 값을 하나의 문자열로 만들어서 반환하는 메서드.
     * @return
     */
    public String getInformation() {
        return String.format("productNumber: %d, name: %s, price: %d, brand: %s", productNumber, name, price, Product.brand);
    }

}
