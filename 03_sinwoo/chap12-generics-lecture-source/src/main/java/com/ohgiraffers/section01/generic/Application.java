package com.ohgiraffers.section01.generic;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 제네릭 프로그래밍
        *   - 데이터 형식의 의존 없이 여러 데이터 타입을 가질 수 있는 기술
        *       -> 재사용성 증가 (타입이 다른 같은 형태 클래스를 여러개 만들 필요가 없다)
        * [특징]
        * 1. 컴파일 단계에서 강력한 타입 검사를 수행하여 타입 안정성 확보
        * 2. 반환 값의 타입 변환 코드 생략(다운 캐스팅 생략)
        * */

        /* Integer 타입으로 객체 생성 */
        GenericTest<Integer> gt1 = new GenericTest<Integer>();

        gt1.setValue(12345); // auto boxing int -> Integer
        int num = gt1.getValue();
        System.out.println(num);

        /* String 타입으로 객체 생성 */
        GenericTest<String> gt2 = new GenericTest<String>();

        gt2.setValue("Hello World");
        String str = gt2.getValue();
        System.out.println(str);

        /* 제네릭 없이 객체 생성
        *   -> T가 정해지지 않았기 때문에 자동으로 Object로 설정됨 */
        GenericTest gt3 = new GenericTest();

        gt3.setValue(100);
        Integer i = (Integer) gt3.getValue();
        System.out.println("i = " + i);

        gt3.setValue("Hello");
        String s = (String) gt3.getValue();
        System.out.println("s = " + s);


    }
}
