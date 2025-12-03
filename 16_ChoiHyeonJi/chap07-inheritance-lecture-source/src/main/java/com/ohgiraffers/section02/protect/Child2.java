package com.ohgiraffers.section02.protect;

import com.ohgiraffers.section02.finalkeyword.SuperClass;

public class Child2 {

  public void method(){
    SuperClass s = new SuperClass(); // 부모 객체 생성

    // Child2 클래스는 SuperClass를 상속 받지 않아
    // protected 접근 불가
    //s.test3() extends SuperClass 해야 가능
    s.test4(); // public

  }
}
