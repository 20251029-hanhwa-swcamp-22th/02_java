package com.ohgiraffers.section02.finalkeyword;

/* final 클래스: 더이상 상속이 불가능한 클래스. */
public /* final */ class SuperClass {

    /* Protected 접근 제어자.
    *   - 같은 패키지 + 상속 관계까지 범위
    *   -  */
    private void test1() {

    }

    void test2() {

    }

    protected void test3() {

    }

    public void test4() {

    }

    /* final method 확인 */
    /* final: Overriding 불가 */
    public void methodA() {}

    public final void methodB() {}

}
