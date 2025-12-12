package com.ohgiraffers.section04.additional;

import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

/* @Order 어노테이션 기능 활성화를 위해 클래스 레벨에 추가하는 구문 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdditionalAnnotationTests {

  //@Disabled // 비활성화
  @Order(4)
  @Test
  void test1(){
    System.out.println("test1 수행");
  }

  @Order(3)
  @Test
  void test2(){
    System.out.println("test2 수행");
  }

  @Order(2)
  @Test
  void test3(){
    System.out.println("test3 수행");
  }

  @Order(1) // 테스트 실행 순서
  @Test
  void test4(){
    System.out.println("test4 수행");
  }

  @Disabled
  @Test
  @Timeout(value = 1000, unit = TimeUnit.MILLISECONDS)
  void testTimeout(){
    System.out.println("Time Out Test - Start");

    // 테스트 수행에 2초가 걸렸다고 가정
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Time Out Test - End");

  }

  @Disabled
  @RepeatedTest(10) // 테스트 10회 반복
  void testRepeated(){
    System.out.println("반복 테스트");
  }



}
