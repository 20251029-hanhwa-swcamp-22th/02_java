package com.ohgiraffers.section02.protect;
import com.ohgiraffers.section02.finalkeyword.Super;
public class Child2
{
    public void method()
    {
        Super s = new Super();
        /*Child2 클래스는 SuperClass를 상속 받지 않아
        * protected 접근 불가*/
        //test3();
        s.test4(); // public
    }
}
