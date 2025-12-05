package com.ohgiraffers.section03.interfaceimplements;

public class Application
{
    public static void main(String[] args)
    {
        /* 인터페이스는 인스턴스를 생성할 수 없다 */
        /*// InterProduck interProduck = new InterProduck();
        {

        }*/
        /* 인터페이스는 부모 타입 참조 변수가 될 수 있다 (업 캐스팅)*/
        InterProduck interProduck = new Product();

        /*오버라이딩 된 메서드 호출*/
        interProduck.nonStaticMethod();
        interProduck.abstMethod();

        /*인터페이스 제공 default 메서드 호출*/
        interProduck.defaultMethod();

        /*상수형 필드 확인*/
        System.out.println(InterProduck.MAX_NUM);
        System.out.println(InterProduck.MIN_NUM);

        /*static 메서드 호출 확인 (인터페이스명.메서드명())*/
        InterProduck.staticMethod();
    }
}
