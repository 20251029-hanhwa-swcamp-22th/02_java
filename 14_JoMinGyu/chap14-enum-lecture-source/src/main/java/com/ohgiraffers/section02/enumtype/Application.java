package com.ohgiraffers.section02.enumtype;

public class Application {
  public static void main(String[] args) {

    /* 1. 열거 타입은 싱글톤 방식으로 구현되기 때문에
      인스턴스의 생성이나 확장이 되지 않는다. */
    System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
    System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW.ordinal());

    boolean isTrue = enumTest(
        FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW,
        FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);

    System.out.println("isTrue = " + isTrue);
  }

  private static boolean enumTest(
      FoodsEnum foodsEnum1, FoodsEnum foodsEnum2){

    System.out.println("foodsEnum1: " + foodsEnum1);
    System.out.println("foodsEnum1.getValue(): " + foodsEnum1.getValue());

    System.out.println("foodsEnum2: " + foodsEnum2);
    System.out.println("foodsEnum2.getValue(): " + foodsEnum2.getValue());

    if(foodsEnum1 == foodsEnum2) return true;
    return false;
  }
}
