package com.ohgiraffers.section04.terminal;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {
        /* 스트림 최종 연산
         *   - 가공된 스트림을 이용해서 결과를 반환 하는 메서드
         *
         * calculating 최종 연산 : sum(), max(), min(), count(), average(), ....
         * */

        long count = IntStream.range(1, 10).count();
        System.out.println("count = " + count);

        long sum = IntStream.range(1, 10).sum();
        System.out.println("sum = " + sum);

        double od = IntStream.range(1, 10).average().getAsDouble();
        System.out.println("od = " + od);

        int max = IntStream.range(1, 10).max().getAsInt();
        System.out.println("max = " + max);

        int min = IntStream.range(1, 10).min().getAsInt();
        System.out.println("min = " + min);

        int OddSum = IntStream.range(1, 10)
                .filter(i -> i % 2 == 1)
                .sum();
        System.out.println("OddSum = " + OddSum);
    }

}
