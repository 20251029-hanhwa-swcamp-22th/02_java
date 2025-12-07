package com.mycompany.section09.api.level01.basic;

import java.util.Scanner;

public class Application1 {
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

    // 스페이스바 기준으로 문자 나누기
    String[] words = input.split("\\s");

    StringBuilder sb = new StringBuilder();

    // 단어 하나씩 돌기
    for (int i = 0; i < words.length; i++) {
      String word = words[i];

      // 해당 단어에서 첫번째[j=0] 글자는 대문자로, 나머지는 그대로
      for (int j = 0; j < word.length(); j++) {
        char ch = word.charAt(j);

        if (j == 0) {
          sb.append(Character.toUpperCase(ch));
        } else {
          sb.append(ch);
        }
      }
      sb.append(" ");
    }
    System.out.println("변환된 문자열 : " + sb);
    System.out.println("총 단어 개수 : " + words.length);
  }
}

