package com.ohgiraffers.section02.finalkeyword;

public class SubClass extends SuperClass{

  @Override // 오버라이딩 성립 요건이 맞는지 검사
  public void methodA(){} // 오류 없음

  //@Override
  // public void methodB(){} // 오류 발생(final 재정의 못함)
}
