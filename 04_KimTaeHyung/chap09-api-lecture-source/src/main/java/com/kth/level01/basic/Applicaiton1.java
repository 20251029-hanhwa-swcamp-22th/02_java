package com.kth.level01.basic;

import java.util.Scanner;

public class Applicaiton1 {
  public static void main(String[] args) {
    /* ----- 입력 예시 -----
     *
     * 문자열 입력 : I will be a good developer.
     *
     * ----- 출력 예시 -----
     *
     * 변환된 문자열: I Will Be A Good Developer.
     * 총 단어 개수: 6
     */

    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 입력 : ");
    String input = sc.nextLine();

    // 공백을 기준으로 문자열 분리 (배열로 저장)
    String[] words = input.split(" ");
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < words.length; i++) {
      String word = words[i];

      // 빈 문자열이 아닐 때
      if (word.length() > 0) {
        char firstChar = Character.toUpperCase(word.charAt(0));
        String rest = word.substring(1);

        result.append(firstChar).append(rest);

        if(i < words.length-1){
          result.append(" ");
        }
      }
    }
    System.out.println("변환된 문자열 : " + result.toString());
    System.out.println("총 단어 개수 : " + words.length);
  }
}
