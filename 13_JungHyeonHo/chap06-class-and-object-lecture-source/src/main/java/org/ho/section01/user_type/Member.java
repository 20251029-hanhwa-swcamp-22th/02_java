package org.ho.section01.user_type;

public class Member {
  /* 클래스 : 객체의 속성과 기능을 정의하는 문서
   * (객체를 만들기 위한 설계도 개념)
   */
  /* 필드(field) 또는 멤버 변수
   * - 클래스 범위에 선언된 변수
   * - 클래스 내 전역에서 사용 가능하다 (
   */
  String id;
  String pwd;
  String name;
  int age;
  char gender;
  String[] hobby;

  public void test(){
    System.out.println(id);
  }
}
