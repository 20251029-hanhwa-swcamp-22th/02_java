package com.ohgiraffers.section03.lifecycle;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationTests {
    /* 테스트 수행 전/후에 동작하는 어노테이션 확인 */

    /* 테스트 수행 전 필요한 자원을 설정하는 역할로 주로 사용 */
    @BeforeAll
    static void setup()
    // static 하는 이유는 모든 수행 전에 실행 해야하기 때문
    {
        System.out.println("@@@@ BeforeAll 동작 @@@@");
    }
    @AfterAll
    static void afterAll()  {
        System.out.println("@@@@ AfterAll 동작 @@@@");
    }


    /* 각 테스트가 수행되기 전*/
    @BeforeEach
    void beforeEach(){
        System.out.println("####### BeforeEach동작 ########");
    }

    @AfterEach
    void afterEach(){
        System.out.println("####### AfterAll동작 ########");
    }
    @Test
    void test1(){
        System.out.println("테스트 코드 1");
    }

    @Test
    void test2(){
        System.out.println("테스트 코드 2");
    }

    @Test
    void test3(){
        System.out.println("테스트 코드 3");
    }
}
