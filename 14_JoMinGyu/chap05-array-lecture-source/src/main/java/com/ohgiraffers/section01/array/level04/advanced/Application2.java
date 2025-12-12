package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {

  public static void main(String[] args) {

    /* 숫자 야구게임 만들기
     * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
     * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
     * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
     * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
     *
     * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
     * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
     *
     * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
     * 횟수는 차감하지 않는다.
     *
     * -- 프로그램 예시 (난수 7416 의 경우) --
     *
     * 10회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 1234
     * 아쉽네요 0S 2B 입니다.
     * 9회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 5678
     * 아쉽네요 0S 2B 입니다.
     * 8회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 7416
     * 정답입니다.
     * */

    int[] answer = new int[4];
    int isDuplicated;
    for(int i = 0; i < answer.length; i++) {
      isDuplicated = 0;
      answer[i] = (int)(Math.random()*10);

      for(int j = 0; j < i; j++) {
        if(answer[i] == answer[j]) {
          isDuplicated = 1;
          break;
        }
      }

      if(isDuplicated == 1) {
        i--;
      }
    }

    Scanner sc = new Scanner(System.in);

    int strike;
    int ball;
    int[] guessArr = new int[4];
    int guess;

    for(int life = 10; life > 0; life--) {
      System.out.println(life + "회 남으셨습니다.");
      System.out.print("4자리 숫자를 입력하세요 : ");
      guess = sc.nextInt();
      sc.nextLine();
      if(guess < 1000 || guess >= 10000) {
        System.out.println("4자리의 정수를 입력해야 합니다.");
        life++;
      } else {
        strike = 0;
        ball = 0;

        for(int j = 3; j >= 0; j--) {
          guessArr[j] = guess % 10;
          guess /= 10;
        }

        for(int j = 0; j < 4; j++) {
          for(int k = 0; k < 4; k++) {
            if(guessArr[j] == answer[k]) {
              if(j == k) strike++;
              else ball++;
            }
          }
        }

        if(strike == 4) {
          System.out.println("정답입니다.");
          return;
        } else {
          System.out.println("아쉽네요 "+strike+"S "+ball+"B 입니다.");
        }
      }
    }
    System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    return;

  }

}
