package org.ho.section02.protect;

import org.ho.section02.finalkeyword.SuperClass;

public class Child2 extends SuperClass{

  public void method() {
    SuperClass s = new SuperClass();

    // Child2 클래스는 SuperClass를 상속 받지 않아
    // protected 접근 불가

    //protected
//    s.test3(); //오류, 'test3()' has protected access in 'org.ho.section02.finalkeyword.SuperClass'
    test3(); //ok

    //public
    s.test4();  //public
  }

}
