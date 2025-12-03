package com.mycompany.section01.section2.set;

import java.util.*;

public class Application3 {
  public static void main(String[] args) {

    Random random = new Random();

    /* 로또 번호 생성기 */
    Set<Integer> lotto = new TreeSet<>();

    while(lotto.size() < 6) {
      int num = random.nextInt(45) + 1;
      lotto.add(num);
    }
    System.out.println(lotto);
  }
}
