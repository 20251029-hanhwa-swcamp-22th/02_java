package com.ohgiraffers.section03.intermediate;

import java.util.stream.IntStream;

public class Application2 {
  public static void main(String[] args) {

    /* 스트림 중간 연산 : map()
    * - 원본 스트림의 데이터를 가공하여 새 스트림을 만드는
    *   중간 연산 메서드
    * */

    IntStream intStream = IntStream.range(0,9);
    intStream
        .filter(i -> i % 2 == 0)
        .map(i -> i * 5)
        .forEach(System.out::println);

  }
}
