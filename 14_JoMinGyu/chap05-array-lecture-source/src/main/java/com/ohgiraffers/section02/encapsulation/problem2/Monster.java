package com.ohgiraffers.section02.encapsulation.problem2;

public class Monster {
  //String name;
  String kinds; //name->kinds로 이름변경
  int hp;

  public void setHp(int hp){
    if(hp > 0){
      this.hp = hp;
      System.out.println("양수 값이 입력되어 몬스터의 체력을 입력 값으로 변경");
    } else {
      this.hp = 0;
      System.out.println("0 이하의 값이 입력되어 몬스터의 체력을 0으로 변경");
    }
  }

  public void setInfo(String info) {
    this.kinds = info;
  }

  public String getInfo() {
    return this.kinds;
  }
}
