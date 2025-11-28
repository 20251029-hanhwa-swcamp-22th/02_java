package org.ho.section02.abstractclass;

public class Application {
  public static void main(String[] args) {

    // 추상 클래스인 Product 참조 변수의 묶음(배열) 생성
    Product[] products = new Product[2];

    // 추상 클래스는 참조 변수 타입으로 사용 가능한가? O
    Product p; // => 사용 가능
    // 추상 클래스를 이용해 인스턴스를 만들 수 있는가? X
    //products[0] = new Product(); => Product는 추상클래스이므로 instance를 만들지 못한다.
    //                             => 'Product' is abstract; cannot be instantiated

    // 추상 클래스 참조 변수로 자식 인스턴스를 참조 가능한가? O
    // (업 캐스팅 상태)
    products[0] = new SmartPhone();
      // 그럼 추상클래스는 instance를 못만든다고 했는데, SmartPhone 내부에는 product 객체가 없다고 생각하면 되는가?
        // 정적 바인딩 상태에서는 Product를 바라봄. 동적 바인딩 상태에서 SmartPhone 부분을 봄.
        // 근데 abstract여서 실행 못함 = 정적바인딩
        // 실행 중(동적 바인딩)에는 자식(smartphone)을 바라보고 있음. = 동적바인딩
        // 실제로 참조하고 있는 인스턴스의 타입에 맞춰 메서드 연결.
    products[1] = new SmartWatch();

    for (int i = 0; i < products.length; i++) {
      /* 동적 바인딩을 이용한 메서드 호출
      *  -> Product의 abstract 메서드가 아닌
      *     오버라이딩이 강제화된 자식 메서드와 연결됨
      * */
      products[i].abstMethod(); //정적 바인딩 상태에서는 코드만 봄.
    }

  }
}
