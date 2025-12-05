package org.ho.section03.interfaceimplements;

/* 부모 클래스     --상속(extends)-----> 자식 클래스
 * 부모 인터페이스  --상속(implements)--> 자식 클래스
 * 부모 인터페이스  --상속(extends)-----> 자식 인터페이스
 * 부모 클래스(구현체)------상속불가능------ 자식 인터페이스(미구현체)
 *
 * - 클래스는 단일 상속만 가능 (1개만 상속가능함) => Class cannot extend multiple classes
 * - 인터페이스는! 다중 상속이 가능 (2개 이상 상속 가능)
 *        => 클래스의 다중 상속 문제를 해결하기 위해 나타남
 * */
public class Product extends Object implements InterProduct, java.io.Serializable{

  @Override
  public void nonStaticMethod() {
    System.out.println("Product가 구현한 nonStaticMethod()");
  }

  @Override
  public void abstMethod() {
    System.out.println("Product가 구현한 abstMethod()");
  }

}
