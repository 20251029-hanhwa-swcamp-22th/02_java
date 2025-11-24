package com.qew032.level01.basic;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // 메소드 호출 확인용 메소드 호출
        calculator.checkMethod();

        // 함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        int result = calculator.sum1to10();
        System.out.println("2. 1 ~ 10까지의 합은 = " + result + " 입니다.");

        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        calculator.checkMaxNumber(10,20);

        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        int sumresult = calculator.sumTwoNumber(10,20);
        System.out.println("4. 두 정수의 합은 = " + sumresult + " 입니다.");

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int minusresult = calculator.minusTwoNumber(10,5);
        System.out.println("5. 두 정수의 차는 = " + minusresult + " 입니다.");

    }

}
