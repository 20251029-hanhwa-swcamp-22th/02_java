package org.ho.section07.initblock;

public class Product {
  /* 필드(== 멤버 변수)
  * 1. 인스턴스 변수 (non-static)
  *   - 생성 : new 연산자에 의해서 생성
  *   - 소멸 : 참조되지 않을 때 GC에 의해 제거
  * 2. 클래스 변수 (static)
  *   - 생성 :
  * */
  static private int productNumber;
  static private String name="텀블러";
  static private int price=40000;
  static private String brand="as";

  {
    price=50000;
    System.out.println("인스턴스 초기화 블럭 동작함");
  }

  /* static 초기화 블럭 (클래스 변수 초기화 용도) */
  static{
//    price=100000; // 프로그램 시작 시점에 Product 인스턴스 생성 X
                    // -> 인스턴스 변수 price 초기화 불가능
    brand="메머드커피";
    System.out.println("static 초기화 블럭 동작함");
  }
  /*4. 생성자*/
  /* 기본 생성자*/
  public Product(){
    System.out.println("기본 생성자로 생성함");
  }

  public Product(int price){
    this.price = price;
    System.out.println("매개 변수 있는 생성자 동작함");
  }

  /* static 초기화 블럭 (클래스 변수 초기화 용도)
  * + 프로그램 실행 시 1회만 동작함
  * */
  public String getInformation(){
    // String.format("") : printf 처럼 문자열을 패턴으로 입력하여
    //                     완성된 문자열을 반환
    return String.format("productNumber: %d , name: %s , price: %d , brand: %s",
        productNumber, name, price, brand);
  }
}
