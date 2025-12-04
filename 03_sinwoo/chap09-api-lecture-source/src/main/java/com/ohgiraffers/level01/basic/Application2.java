package com.ohgiraffers.level01.basic;

import java.util.HashMap;
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

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String input = sc.nextLine();
        // 소문자변환
        input = input.toLowerCase();
        // 영문자, 공백만 남기고 나머지 제거
        input = input.replaceAll("[^a-zA-Z ]", "");
        String[] words = input.split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        String mostWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostWord = entry.getKey();
            }
        }

        System.out.println("\n===== 단어 빈도 =====");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("가장 빈도 높은 단어 : " + mostWord + " (" + maxCount + " 번)");


    }
}