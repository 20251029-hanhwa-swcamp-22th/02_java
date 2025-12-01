package org.ho.practice;

public class Tiger extends Animal{

  @Override
  public void sound() {
    System.out.println("그르렁");
  }

  @Override
  public void move() {
    System.out.println("호랑이 움직임");
  }
}
