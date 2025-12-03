package com.kth.section02.protect;

import com.kth.section02.finalkeyword.SuperClass;

public class Child extends SuperClass {

  public void method(){

    /* 상속 받은 부모 메서드 접근제어자 확인 */
    test3(); // protected
    test4(); // public

  }

}
