package com.ohgiraffers.section01.generic;
/* 제네릭
* - 데이터의 타입을 일반화한다는 의미
* - 제네릭 선언은 <> 다이아몬드 연산자를 활용
* - <> 내부에 작성되는 문자는 관례에 맞춰 대문자로 기입
*   -> T(Type), E(Element), K(Key), V(Value), ....
* - */


public class GenericTest<T> {
  private T value;
  // T:이 자리에 타입이 기록될거다.
  // 내가 타입을 고정함.
  public void setValue(T value) {
    this.value = value; //현재 value에 전달받은 value를 넣음
  }

  public T getValue() {
    return value;
  }




}
