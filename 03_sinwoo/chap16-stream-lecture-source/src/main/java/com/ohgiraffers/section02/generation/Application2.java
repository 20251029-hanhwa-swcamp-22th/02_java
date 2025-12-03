package com.ohgiraffers.section02.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {

    public static void main(String[] args) {
        /* 기본 자료형 스트림 생성하기 */

        IntStream intStream = IntStream.range(5, 10);           // 5, 6, 7, 8, 9
        intStream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1, 3);   // 1, 2, 3
        longStream.forEach(l -> System.out.print(l + " "));
        System.out.println();

        /* Wrapper class 자료형이 필요한 경우 boxing 관련 메서드 사용 */
        Stream<Double> boxedDoubleStream = new Random().doubles(5).boxed();
        boxedDoubleStream.forEach(d -> System.out.print(d + " "));
        System.out.println();

        /* 문자열을 IntStream으로 변환 */
        IntStream intStream2 = "Hello Stream World".chars();
        intStream2.forEach(i -> System.out.print((char)i + " "));
        System.out.println();

        Stream<String> stringStream = Pattern.compile(",").splitAsStream("Hello,Stream,World");
        stringStream.forEach(s -> System.out.print(s + " "));
        System.out.println();

        /* Stream 합치기 */
        Stream<String> stringStream1 = Stream.of("Hello", "Stream", "World");
        Stream<String> stringStream2 = Stream.of("Java", "Spring", "SpringBoot");
        Stream<String> concatStream = Stream.concat(stringStream1, stringStream2);
        concatStream.forEach(s -> System.out.print(s + " "));


    }

}
