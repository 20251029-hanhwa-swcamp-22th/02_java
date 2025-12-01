package com.mycompany.section03.interfaceimplements;

public class Product extends Object implements InterProduct, java.io.Serializable {

  /*
  *  부모 클래스 - 상속(extends) - 자식 클래스
  *  부모 인터페이스 -상속(implements) - 자식 클래스
  *  부모 인터페이스 -상속(extends) - 자식 인터페이스
  *  부모 클래스 -상속(X, 불가) - 자식 인터페이스
  * 
  *  - 클래스는 단일 상속만 가능
  *  - 인터페이스는 다중 상속이 가능함
  * */

  @Override
  public void nonStaticMethod() {
    System.out.println("Product가 구현한 nonStaticMethod()");
  }

  @Override
  public void abstractMethod() {
    System.out.println("Product가 구현한 abstractMethod()");
  }
}
