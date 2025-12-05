package com.wjdqudwls.section01.polymorphism;

public class Application3 {

  public static void main(String[] args) {

    feed(new Animal());
    feed(new Tiger());
    feed(new Goat());
    feed(new Rabbit());

  }
  /* 매개 변수 + 다형성(업캐스팅) */
  public static void feed(Animal animal) {
    animal.eat();
  }
}
