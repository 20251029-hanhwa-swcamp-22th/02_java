package org.ho.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    String ans = "";
    for (int i = 0; i < 4; i++) {
      ans += rand.nextInt(10);
    }
    for (int i = 10; i > 0; i--) {
      System.out.printf("%d회 남으셨습니다.\n", i);
      System.out.print("4자리 숫자를 입력하세요 : ");
      String input = sc.nextLine();
      int s = 0;
      int b = 0;
      boolean[] chk = new boolean[4];//strike로 이미 조사가 되어있으면 ball 조사시 제외
      // strike 조사
      for (int cs = 0; cs < 4; cs++) {
        if (input.charAt(cs) == ans.charAt(cs)) {
          s += 1;
          chk[cs] = true;
        }
      }
      //이제 ball 확인 구현
      for (int ins = 0; ins < 4; ins++) { //input 조사
        for (int bs = 0; bs < 4; bs++) { //ans의 각 글자를 input 한글자에 대해 조사하기
          if (chk[ins]) continue;
          if (input.charAt(ins) == ans.charAt(bs)) {
            b += 1;
            break;
          }
        }
      }
      if (s == 4) {
        System.out.println("정답입니다.");
        return;
      } else System.out.printf("아쉽네요 %dS %dB 입니다.\n", s, b);
    }
    System.out.printf("정답은 %s입니다.", ans);
  }
}
