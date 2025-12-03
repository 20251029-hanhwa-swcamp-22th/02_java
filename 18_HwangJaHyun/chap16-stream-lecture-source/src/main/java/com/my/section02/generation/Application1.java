package com.my.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
  public static void main(String[] args) {
    /* 배열, 컬렉션을 이용한 스트림 생성 방법 */
    String[] strArr = new String[]{"hello","stream","world"};
    Stream<String> strStream = Arrays.stream(strArr);

    // str을 전달받아서 str을 println으로 전달
    //strStream.forEach(str -> System.out.println(str));//consumer오버라이딩 내부클래스로 구현..
    strStream.forEach(System.out::println);


    /* 컬렉션으로 스트림 생성하기 */
    List<String> stringList = Arrays.asList("hello", "stream","world");
    Stream<String> strStream2 = stringList.stream();
    strStream2.forEach(System.out::println);

    /* Builder를 이용하여 스트림 생성하기 */
    /* 원본없이 복사본*/
    System.out.println("===== builder =====");
    Stream<String> strStream3 = Stream.<String>builder()
        .add("java")
        .add("mariadb")
        .add("spring")
        .add("vue3")
        .build();

    strStream3.forEach(str -> System.out.println(str.toUpperCase()));

    // 스트림은 1회용임을 확인
    // java.lang.IllegalStateException: stream has already been operated upon or closed
    //strStream3.forEach(str -> System.out.println(str.toUpperCase()));
  }
}
