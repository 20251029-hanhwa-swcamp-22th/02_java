package com.ohgiraffers.section01.array.level02.normal;
import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("문자열을 하나 입력하세요 : ");
    String input = sc.nextLine();

    System.out.print("검색할 문자를 입력하세요 : ");
    char searchChar = sc.nextLine().charAt(0);

    char[] carr = input.toCharArray();

    int charcount = 0;
    for(char ch : carr) {
      if(ch == searchChar) charcount++;
    }

    //System.out.println("입력하신 문자열 %s에서 찾으시는 문자 %c은 %d개 입니다.", input, searchChar, charcount);
  }



}
