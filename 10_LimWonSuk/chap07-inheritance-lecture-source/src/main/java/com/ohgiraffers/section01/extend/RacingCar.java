package com.ohgiraffers.section01.extend;

public class RacingCar
        extends Car // Car class를 상속
{
    /*기본 생성자*/
    public RacingCar()
    {
        /* super() 생성자
         *- 자식 객체 생성 시 부모 객체를 생서아기 위하여
         * 부모의 생성자를 호출하는 메서드
         * - 항상 자식 생성자 첫 번째 줄에 작성햐여 험 (줄바꾸면 오류남)
         * - 미잗성시 컴파일러가 자동으로 추가
         * */
        super(); // (super == 부모 ) 생성자
        System.out.println(" RacingCar 기본생성자 호출됨 " );
    }

    /* RacingCar만의 메서드*/
    public void useBooster()
    {
        System.out.println(" 부스터를 씁니다 " );
    }

    /*Car 상속 받은 메서드 오버라이딩*/
    @Override
    public void run()
    {
        System.out.println(" 레이싱카가 미친속도로 달린다. ");
    }

    @Override
    public void stop()
    {
        System.out.println(" 레이싱카가 미친속도를 점점 줄인다. ");

        // super 참조 변수 : 자식이 참조받은 부모 부분을 참조하는 변수
        super.stop(); // 부모 부분의 stop() 호출 (오버라이딩 전 stop()호출)
    }
}
