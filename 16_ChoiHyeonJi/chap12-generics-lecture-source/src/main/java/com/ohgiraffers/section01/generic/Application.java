package com.ohgiraffers.section01.generic;

public class Application {
  public static void main(String[] args) {
    /* 제네릭 프로그래밍
    * - 데이터 형식의 의존 없이 여러 데이터 타입을 가질 수 있는 기술
    * -> 재사용성 증가 (타입이 다른 같은 형태 클래스를 여러개 만들 필요 x)
    * [특징]
    * 1. 컴파일 단계에서 강력한 타입 검사를 수행하여 타입 안정성 확보
    * 2. 반환 값의 타입 변환 코드를 생략(다운 캐스팅 생략)
    * */
    /* 다형성과 관련 있음 ( 다양한 형태 지닌 성질 ) -> 인스턴스 적용 부모 자식됐다
    * 프로그래밍 관점 다형성 제네릭 -> 이 타입도 되고 저 타입도 된다는 뜻 */

    /* Integer 타입으로 객체 생성 */
    GenericTest<Integer> gt1 = new GenericTest<Integer>(); // 새 객체 만듦 generic 클래스를 보고 그대로 메모리 할당하겠다.
    // <Integer> 만 받기로 함.

    gt1.setValue(100); // auto boxing (int -> Integer) 포장 자동으로 바뀜

    //gt1.setValue("백"); // 타입 오류 발생
    int num = gt1.getValue(); // auto unboxing (Integer -> int )

    /* String 타입으로 객체 생성 */
    GenericTest<String> gt2 = new GenericTest<String>();
    gt2.setValue("백");
    // gt2.setValue(100); // 타입 오류

    String str = gt2.getValue(); // string 반환

    /* 제네릭 없이 객체 생성 */ // 모든 객체 다 들어감
    // -> T(타입)가 정해지지 않았기 때문에
    // 자동으로 Object로 설정됨.


    GenericTest gt3 = new GenericTest();
    gt3.setValue(100); // 업캐스팅  -> 100쓰면 integer니까 자동으로 업캐스팅
    Integer i = (Integer) gt3.getValue(); //다운 캐스팅
    gt3.setValue("백");
    String s = (String)gt3.getValue(); // 다운캐스팅 (String)
    //gt3.setValue(new int[]{1,2,3,4});


  }
}
