package org.ho.section01.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class Application1 {
  public static void main(String[] args) {
    Random rand=new Random();
    int[] lotto = new int[6];
    for (int i = 0; i < lotto.length; i++) {
      lotto[i] = rand.nextInt(45)+1;
    }
    Arrays.sort(lotto);
    System.out.println(Arrays.toString(lotto));
  }
}
