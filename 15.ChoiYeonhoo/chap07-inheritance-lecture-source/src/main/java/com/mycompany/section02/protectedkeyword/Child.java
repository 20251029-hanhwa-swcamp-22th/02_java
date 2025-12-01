package com.mycompany.section02.protectedkeyword;

import com.mycompany.section02.finalkeyword.SuperClass;

public class Child extends SuperClass {

  public void method(){

    /* 상속 받은 부모 메서드 접근제어자 확인 */
//    test1(); // private
//    test2(); // default
    test3(); // protected
    test4(); // public
  }
}
