package com.ohgiraffers.section03.lifecycle;

import org.junit.jupiter.api.*;

public class LifeCycleAnnotationTests {
    /* 테스트 수행 전 후에 동작하는 어노테이션 확인 */

    /* 테스트 수행 전 필요한 자원을 설정하는 역할로 주로 사용 */
    @BeforeAll
    static void setup() {
        System.out.println("@@@@@beforeAll@@@@@");
    }

    /* 테스트 수행 후 사용한 자원을 반한하는 역할로 많이 사용 */
    @AfterAll
    static void afterAll() {
        System.out.println("@@@@@afterAll@@@@@");
    }

    /* 각 테스트가 수행되기 전 */
    @BeforeEach
    void beforeEach() {
        System.out.println("@@@@@beforeEach@@@@@");
    }

    /* 각 테스트가 수행된 후 */
    @AfterEach
    void afterEach() {
        System.out.println("@@@@@afterEach@@@@@");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

}
