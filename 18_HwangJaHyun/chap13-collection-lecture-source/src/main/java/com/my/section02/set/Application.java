package com.my.section02.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Application {
  public static void main(String[] args) {
    /* 로또 번호 생성기 */
    // int 는 기본 자료형, 컬렉션ㄴ에 저장할 수 없음
    // Integer로 wrap
    Set<Integer> lotto = new TreeSet<>();
    Random rand = new Random();

    while(lotto.size() < 6){
      int num = rand.nextInt(45) + 1;
      lotto.add(num);
    }
    System.out.println("lotto = " + lotto);
  }
}
