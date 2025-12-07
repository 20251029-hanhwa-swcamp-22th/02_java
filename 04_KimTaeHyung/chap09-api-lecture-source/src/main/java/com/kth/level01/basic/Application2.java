package com.kth.level01.basic;


import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {

    /* ----- 입력 예시 -----
     *
     * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
     *
     * ----- 출력 예시 -----
     *
     * ===== 단어 빈도 =====
     * hello: 2
     * world: 1
     * everyone: 1
     * 가장 빈도 높은 단어 : hello (2 번)
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("문자열 입력 : ");
    String str = sc.nextLine();

    // 1. 일단 소문자로 변환 (Hello -> hello)
    str = str.toLowerCase();

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);


      if ((ch >= 'a' && ch <= 'z') ||
          (ch >= '0' && ch <= '9') ||
          (ch >= '가' && ch <= '힣') ||
          (ch == ' ')) {

        sb.append(ch); // 조건에 맞으면 이어 붙이기
      }
    }

    // 문지기를 통과한 깨끗한 문자열 완성
    String cleanedStr = sb.toString();

    // 3. 공백을 기준으로 쪼개기
    String[] inputs = cleanedStr.split(" ");

    // 4. 단어와 횟수 저장용 배열
    String[] names = new String[inputs.length];
    int[] counts = new int[inputs.length];
    int n = 0;

    for (int i = 0; i < inputs.length; i++) {
      String word = inputs[i];

      // 공백 여러 개 때문에 생긴 빈 문자열 건너뛰기
      if (word.isEmpty()) continue; // length() == 0 과 같음

      // 중복 검사
      int idx = -1;
      for (int k = 0; k < n; k++) {
        if (names[k].equals(word)) {
          idx = k;
          break;
        }
      }

      // 저장
      if (idx != -1) {
        counts[idx]++;
      } else {
        names[n] = word;
        counts[n] = 1;
        n++;
      }
    }

    // 결과 출력
    System.out.println("\n===== 단어 빈도 =====");
    String bestWord = "";
    int max = 0;

    for (int i = 0; i < n; i++) {
      System.out.println(names[i] + ": " + counts[i]);
      if (counts[i] > max) {
        max = counts[i];
        bestWord = names[i];
      }
    }

    System.out.println("가장 빈도 높은 단어 : " + bestWord + " (" + max + " 번)");


  }
}
