package com.ohgiraffers.section02.enumtype;

public enum FoodsEnum {

    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),

    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DRINK_RAW_CUTTLEFISH_SHAKE(2);

    // 추가된 필드
    private final int var = 10;

    // 추가된 필드
    private final int value;

    // 추가된 생성자
    /* 상수명 옆 ()에 작성된 값이 순서대로 생성자 매개 변수로 전달되어 value를 초기화함 */
    FoodsEnum(int value) {
        this.value = value;
    }

    // 추가된 메서드
    public int getValue(){
        return value;
    }

    // 추가된 메서드
    public void printVar() {
        System.out.println("print var : " + var);
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }

}
