package com.ohgiraffers.section01.intenum;

public class Application {

    public static void main(String[] args) {

        /* 1. 타입 안전성 보장 방법이 없어 디버깅이 어렵다. */
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;        // 상수값 : 0
        // food = Foods.DRINK_RADISH_KIMCHI_LATTE;             // 상수값 : 0

        /* 두 상수의 값이 모두 0 이기 때문에 if 조건은 만족하나 정확히 무엇을 나타내는 상수인지 앓 수 없다. */
        // if(food == 0) { }
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW){
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }


    }
}
