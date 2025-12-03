package org.ho.section00.missions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaMission {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for(int i=0;i<=10;i++){list.add(i);}
    Integer[] array = (Integer[])list.stream().filter(num -> num % 2 == 0).toArray();
    int reduce = Arrays.stream(array).reduce(now->)
  }
}
