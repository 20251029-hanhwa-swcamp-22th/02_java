package com.my.section03.interfaceimplements;

/* 인터페이스 */
public interface InterProduct {

  //상수형 필드
  public static final int MAX_NUM = 100;
  int MIN_NUM = 0;

  // 추상 메서드
  // 생성자 _ 인스턴스 생성시 한번만 실행..
  // 생성자는 가질 수 없다
  // public InterProduct(){};

  // 추상 메서드
  // (묵시적으로 모든 메서드는 public abstract이기 때문에 선언 시 void 함수명() 가능)
  public abstract void nonStaticMethod();
  void abstMethod();
  
  /* jdk 1.8(java 8)에서 추가된 기능
  * 1) static 메서드 선언, 정의가 가능하다*/
  public static void staticMethod(){
    System.out.println("InterProduct에 정의된 staticMethod()");
  }
  //interface와 class 상관없이 static은 static영역에 ..

  /* 2) default 메서드 선언, 정의할 수 있다.
  * default 키워드를 명시
  * non-static 메서드만 가능
  * 오버라이딩이 강제되지 않는다.
  * */

  /* 인터페이스 내의 일반추상메서드, 디폴트메서드, 정적 메서드, 필드 모두 public
  * public을 생략해도 컴파일 과정에서 자동으로 public이 됨
  * */
  public default void defaultMethod(){
    System.out.println("InterProduct에 정의된 defaultMethod()");
  }

  /* 3) 함수형 인터페이스 -> 다음주에 */



}
