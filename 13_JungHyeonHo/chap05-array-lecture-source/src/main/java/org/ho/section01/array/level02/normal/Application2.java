package org.ho.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("주민등록번호를 입력하세요 : ");
    String s = sc.nextLine();
    char[] ca = s.toCharArray();
    for (int i = 0; i < ca.length; i++) {
      if(i>=8) ca[i]='*';
      System.out.print(ca[i]);
    }
  }
}
