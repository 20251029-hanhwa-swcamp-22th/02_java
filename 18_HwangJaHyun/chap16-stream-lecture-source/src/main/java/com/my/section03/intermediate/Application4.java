package com.my.section03.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application4 {
  public static void main(String[] args) {

    /* 스트림 중간연산 : sorted
    *  정렬된 스트림을 만들어서 반환하는 메서드
    * */
    List<Integer> integerList = IntStream.of(5, 10, 99, 2, 1, 35) //int타입 -> Integer로 boxing
        .boxed() //int-> Integer ==> Stream 반환
        .sorted() // 정렬
        .toList(); // collect(Collectors.toList());

    System.out.println(integerList);


    // 내림차순 정렬
    // Comparator 상속
    // operator
    List<Integer> integerList1 = IntStream.of(5, 10, 99, 2, 1, 35) //int타입 -> Integer로 boxing
        .boxed() //int-> Integer ==> Stream 반환
        .sorted((a,b)-> b - a) // 내림차순 정렬
        .toList(); // collect(Collectors.toList());
    System.out.println(integerList1);

    /* skip(), limit() */
    IntStream intStream2 = IntStream.range(1,8);
    intStream2.skip(2).limit(5).forEach(System.out::println);
  }
}
