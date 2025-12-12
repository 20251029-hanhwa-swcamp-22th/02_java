package com.ohgiraffers.mgjo.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application1 {
  public static void main(String[] args) {

    /* 기본 람다 실습
    1. List<Integer>를 생성하고 짝수만 필터링하는 람다 작성 */
    List<Integer> list = new ArrayList<>(
        Arrays.asList(10, 5, 3, 4, 7, 6, 1, 8, 2, 9)
    );

    List<Integer> evenList = list.stream()
        .filter(n -> n % 2 == 0)
        .collect(Collectors.toList());

    System.out.println("evenList = " + evenList);

    /* 2. 같은 리스트에서 모든 값을 2배로 변환하는 map 람다 작성 */
    List<Integer> doubleList = evenList.stream()
        .map(n -> n*2)
        .collect(Collectors.toList());

    System.out.println("doubleList = " + doubleList);

    /* 3. 같은 리스트에서 모든 값을 2배로 변환하는 map 람다 작성 */


    int n1 = 10;
    int n2 = n1++ * 2;
    int result = (++n1 % 2 != 0 || n2++ == 20 && ++n1 >= 12 )? n2++ : ++n2;

    System.out.println(result);

  }
}
