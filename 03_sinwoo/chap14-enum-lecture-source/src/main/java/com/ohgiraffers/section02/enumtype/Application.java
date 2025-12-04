package com.ohgiraffers.section02.enumtype;

public class Application {

    public static void main(String[] args) {
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW.ordinal());


        System.out.println(enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW));

        for (FoodsEnum foodsEnum : FoodsEnum.values()) {
            System.out.println("foodsEnum = " + foodsEnum);
            System.out.println("foodsEnum.getValue() = " + foodsEnum.getValue());
            foodsEnum.printVar();
        }
    }

    private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2) {
        System.out.println("foodsEnum1 = " + foodsEnum1);
        System.out.println("foodsEnum1.getValue() = " + foodsEnum1.getValue());

        System.out.println("foodsEnum2 = " + foodsEnum2);
        System.out.println("foodsEnum2.getValue() = " + foodsEnum2.getValue());

        return foodsEnum1 == foodsEnum2;
    }
}
