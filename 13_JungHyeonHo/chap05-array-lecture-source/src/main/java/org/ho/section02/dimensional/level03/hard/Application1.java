package org.ho.section02.dimensional.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("가로 행의 수를 입력하세요 : ");
    int c = sc.nextInt();
    System.out.print("세로 행의 수를 입력하세요 : ");
    int r = sc.nextInt();
    char[][] cArr = new char[r][c];
    for (int y = 0; y < cArr.length; y++) {
      for (int x = 0; x < cArr[y].length; x++) {
        cArr[y][x]=(char)(rand.nextInt('Z'-'A'+1)+'A');
        System.out.print(cArr[y][x]+" ");
      }
      System.out.println();
    }
  }
}
