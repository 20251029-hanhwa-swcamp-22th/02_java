package com.mycompany.section02.protectedkeyword;

import com.mycompany.section02.finalkeyword.SuperClass;

public class Child2 {

  public void method(){

    SuperClass s = new SuperClass();

    // Child2는 SuperClass를 상속받지 않아
    // protected 접근 불가

    /* 상속 받은 부모 메서드 접근제어자 확인 */
//    s.test1(); // private
//    s.test2(); // default
//    s.test3(); // protected
    s.test4();; // public
  }
}
