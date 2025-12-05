package org.ho.section05.overloading;

public class OverloadingTest {
  /*오버로딩
  * - 같은 클래스 내에서 같은 이름의 메서드를 작성하는 기법
  *
  * 사용 이유
  * - 매개 변수의 종류에 따라서 메서드 동작이 조금씩 달라지는 경우
  *   서로 다른 이름으로 메서드를 관리하면 어렵기 때문에
  *   하나의 이름으로 관리
  *
  * 성립 요건
  * 1. 메서드 이름 같음
  * 2. 매개변수 타입, 순서, 개수 중 하나라도 달라야 함
  * 3. 접근제어자, 반환형, 예외처리 신경 X
  * */
  public static void main(String[] args) {
    OverloadingTest overloadingTest = new OverloadingTest();

  }
  public void test(){}
  public void test(int num){}
  public void test(double num){}
  public void test(String name, double num){}
  public void test(double num,String name){}
  public void test(String a,String b){}

  //변수명이 달라져도 타입, 순서, 개수가 모두 일치
//  public void test(String b,String a){} //타입 다름 오류 발생
//  private void test(String name, double num){} //오류

}
