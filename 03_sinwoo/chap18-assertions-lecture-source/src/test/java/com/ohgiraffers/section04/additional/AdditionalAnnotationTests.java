package com.ohgiraffers.section04.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

    @Test
    @Order(4)
    void test1() {
        System.out.println("test1 수행");
    }

    @Test
    @Order(3)
    void test2() {
        System.out.println("test2 수행");
    }

    @Test
    @Order(2)
    void test3() {
        System.out.println("test3 수행");
    }

    @Test
    @Order(1) // 테스트 실행 순서
    void test4() {
        System.out.println("test4 수행");
    }


    @Disabled
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout() {
        System.out.println("time out test - Start");

        // 테스트 수행에 2초가 걸렸다고 가정
        try {
            Thread.sleep(950);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("time out test - End");
    }

    @Disabled
    @RepeatedTest(10) // 테스트 10회 반복
    void testRepeated() {
        System.out.println("반복테스트");
    }


}
