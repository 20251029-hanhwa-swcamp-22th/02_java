package com.ohgiraffers.section03.filterstream;

import java.io.*;
import java.nio.Buffer;

public class Application1 {
  public static void main(String[] args) {

    /* 보조(필터) 스트림
    * - 기반 스트림에 추가되어 성능향상, 기능 추가하는 스트림 클래스
    * BufferedReader/Writer
    * - 버퍼 공간을 이요해 데이터를 쌓아 두었다가
    * 한 번에 입/출력하는 스트림
    * - 입/출력 횟수를 줄여서 성능을 향상시킴.
    *  */

    try(BufferedWriter bw
        = new BufferedWriter(new FileWriter("testBuffered.txt"))) {

      bw.write("안녕하세요.\n");
      bw.write("반갑습니다.\n");
      bw.write("점심 뭐드세요?\n");
      bw.write("메가스터디요.\n");
      bw.write("오후에 두고 보겠습니다.\n");

    }catch (IOException e){
      System.out.println(e.getMessage());
    }
    // finally + close() 생략(try with resources 구문 사용 중)

    /* BufferedReader를 이용해서 바로 읽어오기
    * - String BufferedReader.readLine()
    * - 버퍼에서 한 줄을 읽어와 반환
    * - 더 이상 읽어올 내용이 없다면 null 반환
    *  */

    try(BufferedReader br
            = new BufferedReader(new FileReader("testBuffered.txt"))) {
      System.out.println("===== 파일 내용 읽어오기 =====");
      String str;
      while ((str = br.readLine())!=null){
        System.out.println(str);
      }


    } catch (IOException e) {
      System.out.println(e.getMessage());
    }


  }
}
