package com.ohgiraffers.section04.additional;

import org.junit.jupiter.api.*;

import java.util.Vector;
import java.util.concurrent.TimeUnit;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

   // @Disabled // 비활성화
@Order(4)
    @Test
    void test1(){
        System.out.println(" 테스트1 수행 ");
    }
    @Order(2)
    @Test
    void test2(){
        System.out.println(" 테스트2 수행 ");
    }
    @Order(1)
    @Test
    void test3(){
        System.out.println(" 테스트3 수행 ");
    }
    @Order(3)
    @Test
    void test4(){
        System.out.println(" 테스트4 수행 ");
    }

    @Disabled // 비활성화
    @Test
    @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
    void testTimeOut(){
        System.out.println(" Time Out Test - Start ");

        // 테스트 수행에 2초가 걸렸다고 가정
        // 테스트 수행에 0.97초가 걸렸다고 가정
        try {
            //Thread.sleep(2000);
            Thread.sleep(970);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(" Time Out Test - End ");
    }

    @Disabled // 비활성화
    @RepeatedTest(10) // 테스트 10회 반복\
    void testRepeated(){
        System.out.println("반복 테스트");
    }
}
