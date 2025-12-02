package org.ho.section02.protect;

import org.ho.section02.finalkeyword.SuperClass;

public class Child extends SuperClass {
  public void method(){

    /* 상속 받은 부모 메서드 접근제어자 확인*/
//    test1(); private void test1(){} 오류 발생
//    test2(); (dafault) void test2(){} 오류 발생
    test3();  // protected void test3(){}
    test4();  // public void test4(){}
  }
}
