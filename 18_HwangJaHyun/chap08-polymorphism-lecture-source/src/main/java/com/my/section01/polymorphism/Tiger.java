package com.my.section01.polymorphism;

public class Tiger extends Animal {
  @Override
  public void eat() {
    System.out.println("호랑이는 고기를 뜯어먹습니다.");
  }

  @Override
  public void move() {
    System.out.println("호랑이는 위엄있게 움직입니다.");
  }
  
  @Override
  public void sleep(){
    System.out.println("호랑이는 귀엽게 잠을 잡니다. 쿨쿨");
  }
  public void bite(){
    System.out.println("호랑이는 이빨로 물어뜯습니다. 앙");
  }
}
