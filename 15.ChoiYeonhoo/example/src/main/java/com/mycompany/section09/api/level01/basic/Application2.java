package com.mycompany.section09.api.level01.basic;

import java.util.LinkedHashMap;
import java.util.Map;
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

    // 1. 스페이스를 기준으로 나눔
    // 2. 특수 기호는 제거 (everyone!이 아니라 everyone이라고 하는걸 보니)
    // 3. 영어는 대소문자 구분 없으므로, 전부 소문자로 변경
    // 4. 같은 글자 있으면 카운트 증가

    // 같은 글자 카운트 하러면 어떻게 할까. 일단 Map으로 해서 Key를 단어, Value를 카운트로 하면 좋을거 같은데

    // 1. 문장 입력 받기
    Scanner sc = new Scanner(System.in);
    System.out.print("문자열 입력 : ");
    String input = sc.nextLine();

    // 2. 입력 문자 소문자로 변경하기
    input = input.toLowerCase();

    // 3. 특수 기호 제거하기
    input = input.replaceAll("[^a-zA-Z가-힣0-9\\s]", "");

    // 4. 공백 기준 단어 분리하기
    String[] words = input.split("\\s");

    // 5. Map에 데이터 넣기
    Map<String, Integer> wordsCountMap = new LinkedHashMap<>();

    for (String word : words) {
      // .getOrDefault(Key, DefaultValue)
      // Key 값이 Map에 있으면 해당 값을 반환, 없다면 defaultValue를 반환
      wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
    }

    System.out.println("===== 단어 빈도 =====");
    // 6. 단어 카운트 하기
    int maxCount = 0; // 빈도 수
    String maxWord = ""; // 가장 빈도 높은 단어

    // 단어별로 키 밸류 출력하기
    for (Map.Entry<String, Integer> entry : wordsCountMap.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());

      // 밸류 값이 maxCount 보다 높으면
      // maxCount에 현재 Value 저장하고
      // maxWord에 해당 단어 저장하기
      if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxWord = entry.getKey();
      }

    }

    System.out.println("가장 빈도 높은 단어 : " + maxWord + "(" + maxCount + " 번)");

  }
}
