package com.ohgiraffers.section01.generic;


/* Generic
*   - 데이터의 타입을 일반화 한다는 의미
*   - 제네릭 선언은 <> 다이아몬드 연산자를 활용
*   - <T> "T"에 작성되는 문자는 관례에 맞춰 대문자로 기입
*   -> T(type), E(element), K(key), V(value), .....
*   -  */
public class GenericTest<T> {

    private T value;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
