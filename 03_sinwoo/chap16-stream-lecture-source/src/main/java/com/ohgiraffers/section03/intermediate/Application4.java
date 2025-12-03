package com.ohgiraffers.section03.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {

    public static void main(String[] args) {
        /* Stream 중간 연산: sorted()
        *   - 정렬된 스트림을 만들어서 반환하는 메서드.
        * */
        List<Integer> integerList =
                IntStream.of(5, 10, 99, 2, 1, 35)
                        .boxed()
//                        .sorted() : 기본 정렬 방식
                        .sorted((a,b) -> b-a) // 추가 정렬 방식
                        .toList();

        System.out.println(integerList);

        /* skip(), Limit() */
        IntStream intStream2 = IntStream.range(1, 10);
        intStream2.skip(2).limit(5).forEach(System.out::println);

    }

}
