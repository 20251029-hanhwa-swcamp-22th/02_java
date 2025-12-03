package com.ohgiraffers.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {

    public static void main(String[] args) {
        /* 배열, 컬렉션을 이용한 스트림 생성 방법 */

        /* 배열로 스트림 생성하기 */
        String[] strArr = new String[]{"hello", "stream", "world"};
        Stream<String> strStream = Arrays.stream(strArr);
        strStream.forEach(System.out::println);

        /* 컬렉션으로 스트림 생성하기 */
        List<String> stringList = Arrays.asList("olleh", "streamdada", "w1o1r1l1d1");
        Stream<String> strString2 = stringList.stream();
        strString2.forEach(System.out::println);

        /* 빌더를 이용하여 스트림 생성하기 */
        Stream<String> strStream3 = Stream.<String>builder().add("java").add("mariadb").add("spring").add("vue3").build();
        strStream3.forEach(str -> System.out.println(str.toUpperCase()));
        // Stream은 일회용.
        strStream3.forEach(str -> System.out.println(str.toUpperCase()));


    }

}
