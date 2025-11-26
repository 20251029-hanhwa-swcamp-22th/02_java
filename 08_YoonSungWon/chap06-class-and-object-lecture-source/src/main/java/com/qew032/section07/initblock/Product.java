package com.qew032.section07.initblock;

public class Product {

  /*  필드(멤버 변수)
  *   1. 인스턴스 변수(non-static)
  *   2. 생성 : new 연산자에 의해서 / 소멸 : 참조를 당하지 않을때 GC에 의해서 소멸
  *   3. 클래스 변수(static)
  *   4. 생성 : 프로그램 실행 시 static 붙은 애들 전부다
  *   5. 소멸 : 프로그램 종료 시 소멸
  *
  * */
  private int productNumber;

  private String name = "텀블러";

  private int price = 40000;

  private static String brand = "스타벅스";

  {
    price = 50000;
    System.out.println("인스턴스 초기화 블럭 동작함");
  }

  /* statci 초기화 블럭 (클래스 변수 초기화 용도)
  *   프로그램 실행 시 1회만 동작함
  * */
  static {
    //  price = 100000;   // 프로그램 시작 시점에 Product 인스턴스 생성X
                                        // -> 인스턴스 변수 price 초기화 불가능
    brand = "메머드커피";
    System.out.println("static 초기화 블럭 동작함");
  }

  /* 4. 생성자 */
  /* 기본 생성자 */
  public  Product() {
    System.out.println("기본 생성자 동작함");
  }

  public  Product(int price) {
    this.price = price;
    System.out.println("매개 변수 있는 생성자 동작함");
  }



  public String getInformation(){
    // String.format("") : printf 처럼 문자열을 패턴으로 입력하여
    //                     완성된 문자열을 반환
    return String.format("productNumber: %d , name: %s , price: %d , brand: %s",
            productNumber, name, price, Product.brand);
  }


}

