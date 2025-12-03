package com.mycompany.section02.finalkeyword;

// final 클래스 : 상속 불가 클래스
public /*final*/ class SuperClass {

  /* protected 접근 제어자
  * - 같은 패키지 + 상속 관계까지 범위
  * */
  private void test1(){}
  void test2(){}
  protected void test3(){}
  public void test4(){}

  /* final 메서드 확인
  * - final method == 오버라이딩 불가능 키워드 */
  public void methodA(){}
  public final void methodB(){}


}
