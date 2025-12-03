package com.ohgiraffers.section02.protect;

import com.ohgiraffers.section02.finalkeyword.SuperClass;

public class Child2 {

    public void method() {
        SuperClass s = new SuperClass();
        // Child2 클래스는 SuperClass를 상속받지 않았기 때문에 protected에 접근 불가
        s.test4();
    }
}
