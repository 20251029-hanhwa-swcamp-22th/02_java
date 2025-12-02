package com.kang.section02.protect;

import com.kang.section02.finalkeyword.SuperClass;

public class Child2 extends SuperClass{

  public void method() {

    SuperClass s = new SuperClass(); //

    // child2 클래스는 superclass를 상속 받지 않아
    // protected 접근 불가
    // s.test3();
    s.test4(); // public
  }
}
