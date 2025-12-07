package com.ohgiraffers.sextion00.homework;

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

        System.out.println(" 문자열 입력 : ");
        String input    = sc.nextLine();

      //  String[] word = input.toLowerCase().
        // Map<String >
        System.out.println("\n =========== 단어 빈도 ============");

        String maxword  =   null;
        int maxcount = 0;

        // map을 써야하는거같은데 사용방법을 잘모르겠습니;다..
        // 또 특수문자를 제거하는 방법을 몰라서 풀지못하네요 ㅠㅠ..

       if(maxword !=null){
           System.out.println(" 가장 빈도 높은 단어 : hello (2 번) ");
       }

    }
}
