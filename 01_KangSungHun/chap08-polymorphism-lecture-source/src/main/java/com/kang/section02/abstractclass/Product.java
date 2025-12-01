package com.kang.section02.abstractclass;

/* abstract class (추상 클래스)
 * - 인스턴스로 생성 불가한 클래스
 * -
 * */


/* 상품 클래스 */
public abstract class Product {

  /* 필드 */
  // 추상 클래스는 일반적인 필드를 가질 수 있다.
  private int nonStaticField; // 인스턴스 변수
  private static int staticField; // 클래스 변수

  /*  메서드 */
  // 생성자
  // - 추상 클래스는 직접 인스턴스를 생성할 순 없지만
  // 상속 받은 자식 내 부모 부분 생성을 위해서 필요하다.
  public Product() {
  }


  // 클래스만의 메서드
  /* 추상 클래스는 일반적인 메서드를 가질 수 있따 */
  public void nonStaticMethod() {
    System.out.println("Product 클래스의 nonStaticMethod");
  }

  public static void staticMethod() {
    System.out.println("Product 클래스의 staticMethod()");
  }

  /* 추상 메서드(abstract method)
   * - 메서드 선언부만 존재하는 메서드 (정의{} 부분이 없음)
   * -> 추상 메서드임을 명시하기 위해 abstract 키워드를 반드시 붙여야 한다.
   * - 추상 메서드가 존재하는 클래스에는 반드시 abstract 키워드가 붙어야 한다. (abstract clasS)

   * - 추상 메서드는 상속 받은 자식 클래스에서 무조건 오버라이딩이 되어야 한다. (오버라이딩 강제화)
   * */
  public abstract void abstMethod();


}
