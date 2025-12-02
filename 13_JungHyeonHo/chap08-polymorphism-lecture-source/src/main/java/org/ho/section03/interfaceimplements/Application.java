package org.ho.section03.interfaceimplements;

import org.ho.section01.polymorphism.Tiger;

public class Application {
  public static void main(String[] args) {

    /* 인터페이스는 인스턴스를 생성할 수 없다 */ /* etc. 내부클래스 바로 구현가능하긴함. 람다에서 학습 예정 */
    // InterProduct p = new InterProduct(); 'InterProduct' is abstract; cannot be instantiated

    /* 인터페이스는 부모 타입 참조 변수가 될 수 있다 (업캐스팅) */
    InterProduct p = new Product();

    /* 오버라이딩된 메서드 호출 */
    p.nonStaticMethod();
    p.abstMethod();

    /* 인터페이스 제공 default 메서드 호출 */
    p.defaultMethod();

    /* 상수형 필드 확인 (인터페이스명.필드명) */
    System.out.println(InterProduct.MAX_NUM);
    System.out.println(InterProduct.MIN_NUM);

    /* static 메서드 호출 확인 (인터페이스명.메서드명())*/
    InterProduct.staticMethod();


  }
}
