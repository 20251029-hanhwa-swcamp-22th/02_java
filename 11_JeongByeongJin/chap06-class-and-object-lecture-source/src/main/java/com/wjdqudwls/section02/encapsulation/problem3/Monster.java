package com.wjdqudwls.section02.encapsulation.problem3;

public class Monster {
  /* 문제 원인 : 객체 필드를 직접 접근하는 것이 문제다 !!
  *  해결 방법 : 외부 클래스 / 객체에서 직접 접근 자체를 차단
  *  -> 접근 제어자(접근 제한자) : private, default, protected, public
  *
  *  단, 클래스 선언 시에는 public, (default)만 사용 가능
  * */
  /* name 필드명을 수정(유지보수) 상황이 발생했다고 가정 */

  // private은 같ㅇ느 클래스/객체 내부에서만 접근 가능 O
  private String kinds; // 기존 name을 직접 접근하던 코드에서 모두 오류가 발생함
  private int hp;

  public void setHp(int hp) {
    if (hp > 0) {
      /* this 참조 변수 : 만들어진 인스턴스의 주소를 저장하는 참조형 변수
       *  - 생성된 객체가 자신을 참조할 때 사
       * */
      this.hp = hp;
      System.out.println("양수 값이 입력되어 몬스터의 체력을 입력 값으로 변경");
    } else {
      this.hp = 0;
      System.out.println("영 이하의 값이 입력되어 몬스터의 체력이 0으로 변경");
    }
  }
  public int getHp(){
    return this.hp;
  }
 public void setInfo(String info){

    this.kinds = info;
 }
 public String getInfo(){

    return this.kinds;
 }

}