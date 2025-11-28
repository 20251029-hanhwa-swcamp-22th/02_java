package com.mycompany.section03.interfaceimplements;

/* 인터페이스 */
public interface InterProduct {

  // 상수형 필드 (public static final을 작성하지 않아도 자동으로 붙음)
  public static final int MAX_NUM = 100;
  int MIN_NUM = 0;

  // 생성자는 가질 수 없다.
//  public InterProduct(){}

  // 추상 메서드 (묵시적으로 모든 메서드는 public abstract)
  public abstract void nonStaticMethod();
  void abstractMethod();

  /* jdk 1.8(java 8)에서 추가된 기능 */
  // 1) static 메서드 선언, 정의가 가능하다.
  public static void staticMethod(){
    System.out.println("InterProduct에 정의된 staticMethod");
  }

  /* 2) default 메서드 선언, 정의할 수 있다.
  *  - default 키워드를 명시
  *  - non-static 메서드만 가능
  *  - overriding이 강제되지 않는다.
  *  "이 인터페이스를 상속 받으면 이 기능은 기본적으로 가지고 있다" 라는 뜻.
  * */

  // 여기에서 default는 접근제한자가 아니다. 그냥 기본이라는 뜻
  // "인터페이스가 기본 동작을 제공하는 메서드" 라는 뜻
  public default void defaultMethod(){
    System.out.println("interProduct에 정의된 defaultMethod");
  }
}
