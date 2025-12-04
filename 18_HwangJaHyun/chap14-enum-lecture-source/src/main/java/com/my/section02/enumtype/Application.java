package com.my.section02.enumtype;

public class Application {
  public static void main(String[] args) {

    // 1. 열거 타입은 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다.
    /* 2. 열거 타입은 컴파일 타임 타입 안전성을 높여준다.
          enumTest() 는 `FoodsEnum` 타입으로 받도록 선언해 두었기 때문에
          다른 타입의 매개변수가 들어오는 경우 컴파일 에러를 발생시켜 준다.*/

    System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
    System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW.ordinal());

    //boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.DRINK_WOOLUCK_SMOOTHIE);
    boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);

    System.out.println("isTrue = " + isTrue);

    // 3. 열거 타입은 상수 이름을 문자열로 출력할 수 있다.
    // 4. 열거 타입도 클래스이기 때문에 toString() 을 재정의하여 사용할 수 있다.
    System.out.println();
    System.out.println("===== 열거타입 상수 이름 문자열로 출력 =====");
    System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
    System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);
    System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);
    System.out.println(FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);
    System.out.println(FoodsEnum.DRINK_WOOLUCK_SMOOTHIE);
    System.out.println(FoodsEnum.DRINK_RAW_CUTTLEFISH_SHAKE);

    // 5. 열거 타입에 메서드나 필드를 추가 할 수 있다.
    // 추가로 열거 타입은 근본적으로 불변이라 모든 필드는 final 이어야 한다(생략가능)
    System.out.println("==== 5. 추가 메서드, 필드 확인 ====");
    FoodsEnum.MEAL_BUNGEOPPANG_SUSHI.printVar();
    // FoodsEnum은 상수의 나열이다 (FoodsEnum == FoodsEnum.MEAL_BUNGEOPPANG_SUSHI)
    // 특정 상수에서 메소드를 호출해야 사용할 수 있다

    // 6. 열거 타입에 선언된 상수 하나를 제거하더라도 클라이언트에 영향을 주지 않는다.
    //혹시나 삭제된 상수를 참조하고 있는 곳이 있다면 컴파일 에러를 출력해주기 때문에 안전하다.

    // 7. 열거 타입 내에 선언된 상수들을 순회할 수 있다
    System.out.println("===== 7. 상수 순회 =====");
    for (FoodsEnum food : FoodsEnum.values()) {
      System.out.println("food = " + food);
      System.out.println("food.getValue() = " + food.getValue());
      food.printVar();
    }

  }

  private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2) {

    System.out.println("foodsEnum1 = " + foodsEnum1);
    System.out.println("foodsEnum1.getValue() = " + foodsEnum1.getValue());
    System.out.println("foodsEnum2 = " + foodsEnum2);
    System.out.println("foodsEnum2.getValue() = " + foodsEnum2.getValue());

    if(foodsEnum1 == foodsEnum2) return true;
    return false;
  }
}
