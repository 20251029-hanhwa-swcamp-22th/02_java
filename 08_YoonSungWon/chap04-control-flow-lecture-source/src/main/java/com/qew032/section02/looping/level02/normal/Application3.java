package com.qew032.section02.looping.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 정수를 입력받아 1부터 입력받은 정수까지
         * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 수박수박수
         * */

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int input = sc.nextInt();

        String output = "";

        for (int i = 1; i <= input; i++) {

            if(i % 2 == 0) {
                output += '박';
            } else {
                output += '수';
            }

        }

        System.out.println(output);

    }

}
