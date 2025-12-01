package com.kth.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {

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

  /* 접근 제어자 좁은범위 불가*/
  //@Override
  //private void methodA() throws FileNotFoundException {}

  /* 예외 처리 구문 넓은 범위 불가 */
  //@Override
  //protected void methodA() throws FileNotFoundException {}


  /* 오버라이딩 가능
  * - 접근 제어자 -> 넓은 범위로 변경 -> 가능
  * - 예외 처리 구문 -> 좁은 범위(구체적)로 변경 -> 가능
  * */
  @Override
  public void methodA() throws FileNotFoundException {}

}
