package com.my.section02.enumtype;

public enum FoodsEnum {
  MEAL_AN_BUTTER_KIMCHI_STEW(0),
  MEAL_MINT_SEAWEED_SOUP(1),
  MEAL_BUNGEOPPANG_SUSHI(2),
  DRINK_RADISH_KIMCHI_LATTE(0),
  DRINK_WOOLUCK_SMOOTHIE(1),
  DRINK_RAW_CUTTLEFISH_SHAKE(2);
  
  // 필드
  private int value;
  private final int var = 10;

  // 생성자
  FoodsEnum(int value){
    this.value = value;
  }

  // getter
  public int getValue(){
    return value;
  }

  @Override
  public String toString() {
    // name() : 상수명 반환
    return name().toLowerCase();
  }

  public void printVar(){
    System.out.println("var = " + var);
  }

}
