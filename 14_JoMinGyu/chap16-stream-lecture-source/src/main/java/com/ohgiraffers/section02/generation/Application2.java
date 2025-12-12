package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
  public static void main(String[] args) {

    /* 기본 자료형 스트림 생성하기 */

    IntStream intStream = IntStream.range(5, 10); // 5 이상 10 미만 정수 스트림 생성
    intStream.forEach(i -> System.out.print(i + " "));
    System.out.println();

    LongStream longStream = LongStream.rangeClosed(5, 10); // 5 이상 10 미만 long 스트림 생성
    longStream.forEach(i -> System.out.print(i + " "));
    System.out.println();

    /* Wrapper 클래스 자료형의 스트림이 필요한 경우 boxing 관련 메서드도 사용 */
    /* Stream은 auto boxing이 되지 않아, 수동 boxed 필요 */
    Stream<Double> boxedDoubleStream = new Random().doubles(5).boxed();
    boxedDoubleStream.forEach(i -> System.out.print(i + " "));
    System.out.println();

    IntStream intStream2 = "Hello Stream World".chars();
    intStream2.forEach(ch -> System.out.print((char)ch + " "));
    System.out.println();


    /* 스트림 합치기 */
    // Stream
    Stream<String> stringStream1 = Stream.of("Hello", "Stream", "World");
    Stream<String> stringStream2 = Stream.of("Java", "Spring", "SpringBoot");



  }
}
