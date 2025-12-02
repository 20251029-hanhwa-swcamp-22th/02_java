package com.ohgiraffers.section03.interfaceimplements;

/* 부모 클래스 - 상속(extends) - 클래스간의 상속
* 부모 인터페이스 - 상속(implements) - 자식클래스
* 부모 인터페이스 - 상속(extends) - 자식인터페이스
* 부모 클래스 - 상속(불가 x) - 자식인터페이스
*
* - 클래스는 단일 상속만 가능
* - 인터페이스는 다중 상속이 가능함
* */

public class Product
        extends Object
        implements InterProduck, java.io.Serializable
{
    @Override
    public void nonStaticMethod()
    {
        System.out.println("Product가 구현한 nonStaticMethod");
    }

    @Override
    public void abstMethod()
    {
        System.out.println("Product가 구현한 abstMethod");
    }
}
