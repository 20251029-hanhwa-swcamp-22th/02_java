package com.wjdqudwls.section04.terminal;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class application1 {
  public static void main(String[] args) {
    /* 스트림 최종 연산
    * - 가공된 스트림을 이용해서 결과를 반환하는 메서드
    *
    * calculating 최종 연산 : sum(), max(), min(), count(), average()
    * */
    long count = IntStream.range(1, 10).count();
    long sum = IntStream.range(1, 10).sum();

    System.out.println("count = " + count);
    System.out.println("sum = " + sum);

    OptionalDouble od = IntStream.range(1, 10).average();
    double avg = od.getAsDouble();
    System.out.println("avg = " + avg);

    OptionalInt max = IntStream.range(1, 10).max();
    OptionalInt min = IntStream.range(1, 10).min();

    System.out.println("max = " + max.getAsInt());
    System.out.println("min = " + min.getAsInt());

    int OddSum = IntStream.range(1, 10)
        .filter(i -> i % 2 == 1)
        .sum();
    System.out.println("OddSum = " + OddSum);
  }

}
