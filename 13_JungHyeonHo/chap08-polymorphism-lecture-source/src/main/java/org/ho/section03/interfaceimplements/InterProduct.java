package org.ho.section03.interfaceimplements;


/* 인터페이스 */
public interface InterProduct {

  // 상수형 필드 (묵시적으로 모든 필드는 public static final)
  public static final int MAX_NUM = 100;
  public static final int MIN_NUM = -100;
  int MAX = 0;


  // 생성자는 가질 수 없다!!!. 객체 생성에는 관여 x
  // public InterProduct(); //Constructor is not allowed in interface

  // 추상 메서드(묵시적으로 모든 메서드는 public abstract)
  public abstract void nonStaticMethod();
  void abstMethod();

  /* jdk 1.8(java 8)에서 추가된 기능 */
  /* 1) static 메서드 선언, 정의가 가능하다 */
  public static void staticMethod(){
    System.out.println("InterProduct에 정의된 staticMethod()");
  }

  /* 2) default 메서드 선언, 정의가 가능하다.
   *  - default 키워드를 명시
   *  - non-static 메서드만 가능
   *  - 오버라이딩이 강제되지 않는다
   *  - interface를 implements 받은 클래스의 객체에서 바로 사용이 가능
   *  - public default <- 접근제어자의 default가 아닌 키워드이다 */
  public default void defaultMethod(){
    System.out.println("InterProduct에 정의된 defaultMethod()");
  }
}
