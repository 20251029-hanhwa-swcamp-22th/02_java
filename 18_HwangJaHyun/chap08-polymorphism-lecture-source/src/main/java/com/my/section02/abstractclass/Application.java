package com.my.section02.abstractclass;

public class Application {
  public static void main(String[] args) {
    Product[] products = new Product[3];

    // 추상 클래스는 참조 변수 타입으로 사용 가능한가? O
    Product p;
    // 추상 클래스를 이용해 인스턴스를 만들 수 있는가? X
    // products[0] = new Product(); //에러

    //추상 클래스 참조 변수로 자식 인스턴스를 참조 가능한가? O
    // (업 캐스팅 상태, 다형성)
    products[0] = new SmartPhone();
    products[1] = new SmartWatch();

    for (int i = 0; i < products.length; i++) {
      /* 동적 바인딩을 이용한 메서드 호출
      * -> Product의 abstract 메서드가 아닌
      * 오버라이딩이 강제화 된 자식 메서드와 연결됨*/
      products[i].abstMethod(); //정적바인딩 상태
    }
  }
}
