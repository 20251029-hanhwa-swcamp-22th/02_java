package com.ohgiraffers.section01.array.level02.normal;
import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("문자열을 하나 입력하세요 : ");
    String input = sc.nextLine();

    char[] carr = input.toCharArray();

    System.out.print("검색할 문자를 입력하세요 : ");
    char ch = sc.next().charAt(0);

    int cnt = 0;
    for(char c : carr) {
      if(c == ch) {
        ++cnt;
      }
    }

    System.out.println("입력하신 문자열 "+input+"에서 찾으시는 문자 "+ch+"은(는) "+cnt+"개 입니다.");

  }



}
