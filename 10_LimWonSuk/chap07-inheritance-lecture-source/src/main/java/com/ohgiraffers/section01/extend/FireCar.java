package com.ohgiraffers.section01.extend;

public class FireCar
        extends Car // Car class를 상속
{
    /*기본 생성자*/
    public FireCar()
    {
        /* super() 생성자
         *- 자식 객체 생성 시 부모 객체를 생서아기 위하여
        * 부모의 생성자를 호출하는 메서드
        * - 항상 자식 생성자 첫 번째 줄에 작성햐여 험 (줄바꾸면 오류남)
        * - 미잗성시 컴파일러가 자동으로 추가
        * */
        super(); // (super == 부모 ) 생성자
        System.out.println(" FireCar 기본생성자 호출됨 " );
    }
    /*FireCar만의 메서드*/
    public void sprayWater()
{
    System.out.println(" 물을 뿌립니다. " );
}
/* 오버라이딩
* - 부모로 상속받은 메서드를 자식이 재정의 하는 것(덮어쓰기)
* - 성립 요건 :
* 1) 매서드명, 매개변수, 반환형 모두 동일
* 2) 접근 제어자는 같거나 넓은 범위 만 가능
* */

    /*@Override = 어노테이션 (Annotation)
    * - 역할 1 : 개발하는 사람들이 한눈에 보기쉽게 확인하는 용도
    * - 역할 2 : 컴파일러에게 오버라이딩 성립 요건이 맞는지 확인하라는 명령
    * *** 어노테이션 이란? ***
    * - @(At) 으로 시작
    * - 컴파일러를 위한 주석
    * - 컴파일러에게 설명, 상황, 또는 추가 명령을 내리는 구문
    * */
    @Override // 컴파일러를 위한 주석
    public void soundHorn()
    {
        System.out.println(" 빠앙 " );
    }

}
