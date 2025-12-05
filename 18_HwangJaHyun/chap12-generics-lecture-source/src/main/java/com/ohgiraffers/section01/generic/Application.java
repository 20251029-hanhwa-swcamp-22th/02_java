package com.ohgiraffers.section01.generic;

public class Application {
  public static void main(String[] args) {
    /* 제네릭 프로그래밍
    * - 데이터 형식의 의존 없이 여러 데이터 타입을 가질 수 있는 기술
    *   -> 재사용성 증가 (타입이 다른 같은 형태 클래스를 여러개 만들 필요 X)
    *
    * [특징]
    * 1. 컴파일 단계에서 강력한 타입 검사를 수행하여 타입 안정성 확보
    * 2. 반환 값의 타입 변환 코드 생략(다운 캐스팅 생략)
    * */

    /* Integer 타입으로 객체 생성 */
    GenericTest<Integer> gt1 = new GenericTest<Integer>();

    gt1.setValue(100); // auto boxing (int -> Integer)
    //gt1.setValue("백"); // 타입 오류

    int num = gt1.getValue(); // auto unboxing (Integer -> int)


    /* String 타입으로 객체 생성 */
    GenericTest<String> gt2 = new GenericTest<String>();
    gt2.setValue("백");
    //gt2.setValue(100); // 타입 오류

    String str = gt2.getValue();
    
    
    /* 제네릭 없이 객체 생성 
    * -> T(타입)가 정해지지 않았기 때문에 자동으로 Object로 설정됨
    * */
    GenericTest gt3 = new GenericTest();

    gt3.setValue(100); // 업캐스팅
    Integer i = (Integer)gt3.getValue(); // 다운 캐스팅

    gt3.setValue("백"); // 업캐스팅
    String s = (String)gt3.getValue(); // 다운 캐스팅

  }
}
