package com.mycompany.section02.finalkeyword;

public class SubClass extends SuperClass {

  @Override
  public void methodA(){} //오류 없음

//  @Override
//  public void methodB(){} //오류 발생(final 재정의 못함)
}
