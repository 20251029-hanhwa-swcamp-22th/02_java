package com.wjdqudwls.section02.finalkeyword;

/* final 클래스 : */
public class SuperClass {

  /* protected 접근제어자
   * - 같은 패키지 + 상속관계 까지 범우
   * */
  private void test1(){}
  void test2(){}
  protected void test3(){}
  public void test4(){}
/* final 메서드 확인
* final 메서드 == 오버라이딩 불가
* */
  public void methodA(){}
  final public void methodB(){}
}
