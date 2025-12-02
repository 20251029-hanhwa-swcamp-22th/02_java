package org.ho.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass{
  /* 오버라이딩 성립 요건
  * - 반환형 동일
  * - 메서드명 동일
  * - 매개 변수(개수, 순서, 타입) 동일
  * - final 메서드는 오버라이딩 불가능
  * - private 메서드도 오버라이딩 불가능
  * - 접근 제어자는 같거나 넓은 범위
  * - 예외 처리 구문은 같거나 좁은 범위
  *   (넓은 범위 예외 == 추상적, 좁은 범위 예외 == 구체적)
  * */


  /*접근 제어자 좁은 범위 불가*/
  /*'methodA()' in 'org.ho.section04.override.SubClass' clashes with 'methodA()' in 'org.ho.section04.override.SuperClass'; attempting to assign weaker access privileges ('private'); was 'protected'*/
//  @Override
//  private void methodA() throws IOException{}

  /* 예외 처리 구문 넓은 범위 불가*/
  /*'methodA()' in 'org.ho.section04.override.SubClass' clashes with 'methodA()' in 'org.ho.section04.override.SuperClass'; overridden method does not throw 'java.lang.Exception'*/
//  @Override
//  protected void methodA() throws Exception{}

  @Override
  public void methodA() throws FileNotFoundException {}
}
