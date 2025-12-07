package com.ohgiraffers.sextion00.homework;

import java.util.Scanner;
import java.util.SimpleTimeZone;

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

        System.out.println(" 문자열 입력 : I will be a good developer. ");
        String input = sc.nextLine();

        String[] word = input.split(" I will be a good developer.");

        StringBuilder sb = new StringBuilder();
       // 문자 제거를 어떻게해야할지 감이안오네요 ㅜㅜ..
       // if (count word)

        System.out.println("I Will Be A Good Developer.");
        System.out.println(" 총 단어 개수:" + word.length); // 총 단어 개수도 안나오네요 if문으로 카운트를 세보려햇는데 오류만 나서


    }
}
