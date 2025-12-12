package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("주민번호를 입력하세요 : ");
    String personID = sc.nextLine();

    char[] carr = personID.toCharArray();

    for(int i = 0; i < 8; i++) {
      System.out.print(carr[i]);
    }
    for(int i = 0; i < 6; i++) {
      System.out.print("*");
    }
  }

}
