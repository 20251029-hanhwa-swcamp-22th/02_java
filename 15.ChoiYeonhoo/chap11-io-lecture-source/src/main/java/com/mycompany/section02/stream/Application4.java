package com.mycompany.section02.stream;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application4 {
  public static void main(String[] args) {

    /* FileWriter
    * - 문자 기반 파일 출력 스트림
    * - String 출력 제공
    * */

    // ; 구분으로 여려개 스트림 동작 가능
    // try 안에 구문이 있으면 close는 자동으로 됨
    try(FileWriter fw = new FileWriter("testWriter.txt");
        Scanner sc = new Scanner(System.in)
    ){
      System.out.println("====== 원하는 문자열을 입력 후 엔터(종료는 !wq) ======");

      StringBuilder sb = new StringBuilder();
      String input = null;

      do{
        input = sc.nextLine();
        if (input.equals("!wq")) break;

        sb.append(input);
        sb.append("\n");
      }
      while(true);

      fw.write(sb.toString());
      System.out.println("===== 파일 출력 완료 ======");

    }catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}
