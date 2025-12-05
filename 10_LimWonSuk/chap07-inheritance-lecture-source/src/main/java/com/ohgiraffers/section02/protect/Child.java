package com.ohgiraffers.section02.protect;
import com.ohgiraffers.section02.finalkeyword.Super;

public class Child
extends Super
{
    public void method()
    {
        /* 상속 받은 부모 메서드 접근제어자 확인*/
        test3(); // protected
        test4(); // public
    }
}
