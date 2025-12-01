package com.my.section02.finalkeyword;

public class SubClass extends SuperClass{
  @Override // 오버라이딩 성립 요건이 맞는지 검사
  public void methodA(){
  }

//  @Override
//  public void methodB(){
//  } // 오류 발생(final 재정의 못함)
}
