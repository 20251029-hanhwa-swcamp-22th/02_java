package org.ho.section02.finalkeyword;

public class SubClass extends SuperClass{

  @Override // 오버라이딩 성립 요건이 맞는지 검사
  public void methodA(){} // public, 오류 없음

//  @Override
//  public void methodB(){} // final, 오류 발생
  // overridden method is final


}
