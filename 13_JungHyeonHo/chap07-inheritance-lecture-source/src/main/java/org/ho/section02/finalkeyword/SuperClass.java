package org.ho.section02.finalkeyword;

/* final 클래스 : 상속 불가 클래스 */
// final을 붙이면 SubClass, Child, Child2에서 extends 구문에 오류가 생기는 것을 확인할 수 있다.
// final method는 일부분 수정을 막지만, final class는 모든 수정 및 상속을 막는다.
public /*final*/ class SuperClass {

  /* protected 접근 제어자
   * - 같은 패키지 + 상속 관계까지 범위*/
  private void test1() {
  }

  void test2() {
  }

  protected void test3() {
  }

  public void test4() {
  }

  /*final 메서드 확인
  * final 메서드 == 오버라이딩 불가
  * */
  public void methodA(){}
  final public void methodB(){}

}
