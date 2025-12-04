package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        /* 내부 인터페이스를 람다식으로 구현 */

        /* 익명 내부 클래스로 구현하기 */
        OuterInterface.Sum sum = new OuterInterface.Sum() {
            @Override
            public int sumTwoNumber(int a, int b) {
                return a + b;
            }
        };
        System.out.println(sum.sumTwoNumber(10, 20));

        /* 람다식 사용 */
        /* {} 내부 코드가 한 줄인 경우 {} 생략 가능
        *   단, 한 줄인 코드가 return 구문이면 return도 생략 가능
        * */
        OuterInterface.Sum sum2 = (a, b) -> a + b;
        System.out.println("sum2 = " + sum2.sumTwoNumber(10, 20));
        
        OuterInterface.Minus minus = (a, b) -> a - b;
        System.out.println("minus.minusTwoNumber(20,10) = " + minus.minusTwoNumber(20,10));

        OuterInterface.Multiple multiple = (a, b) -> a * b;
        System.out.println("multiple.multipleTwoNumber(10,20) = " + multiple.multipleTwoNumber(10,20));

        // {} 내 코드가 한 줄 초과 시 {} 생략 불가
        OuterInterface.Devide devide = (a, b) -> {
            if (b == 0) {
                return 0;
            }else {
                return a / b;
            }
        };
        System.out.println("devide.devideTwoNumber(20,10) = " + devide.devideTwoNumber(20,10));
    }
}
