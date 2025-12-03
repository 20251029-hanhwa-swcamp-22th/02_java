package com.my.section02.protect;

import com.my.section02.finalkeyword.SuperClass;

public class Child2 {
  public void method(){
    SuperClass s = new SuperClass(); // public

    // Child2 클래스는 SuperClass를 상속 받지 않아
    // protected 접근 불가
    // s.test3();

    s.test4();
  }
}
