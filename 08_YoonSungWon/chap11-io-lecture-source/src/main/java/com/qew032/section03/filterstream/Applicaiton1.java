package com.qew032.section03.filterstream;

import java.io.*;

public class Applicaiton1 {
  public static void main(String[] args) {

    /* 보조(필터) 스트림
    * - 기반 스트림에 추가되어 성능 향상, 기능 추가하는 스트림 클래스
    *
    * * BufferedReader/Writer
    * - 버퍼 공간을 이용해서 데이터를 쌓아 두었다가 한 번에 입/출력하는 스트림
    * - 입/출력 횟수를 줄여서 성능을 향상 시킴
    * */

    // BufferedWriter 인스턴스 bw는 보조 스트림 역할을 하고 단독으로 파일과 연결될 수 없기 때문에, 파일 시스템과 실제 연결하는
    // 기반 스트림인 FileWriter의 새로운 인스턴스를 생성하여 생성자를 통해 제공한다.
    try(BufferedWriter bw = new BufferedWriter(new FileWriter("testbuffered.txt"))){

      bw.write("안녕하세요.\n");
      bw.write("반갑습니다.\n");
      bw.write("점심 뭐드세요?\n");
      bw.write("메가스터디요.\n");
      bw.write("오후에 두고 보겠습니다.\n");

    }catch(IOException e){
      System.out.println(e.getMessage());
    }
    // finally + close() 생략(try with resources 구문 사용 중)


    /* BufferedReader를 이용해서 바로 읽어오기
    *
    *  String BufferedReader.readLine()
    *  - 버퍼에서 한 줄을 읽어와 반환
    *  - 더 이상 읽어올 내용이 없다면 null 반환
    * */

    try(BufferedReader br = new BufferedReader(new FileReader("testBuffered.txt"))){

      System.out.println("==== 파일 내용 읽어오기 ====");

      String str;
      // 문자열을 읽었을때 null값이 아니라면 str을 출력하겠다
      while( (str = br.readLine()) != null ){
        System.out.println(str);
      }

    }catch(IOException e){
      System.out.println(e.getMessage());
    }

  }
}
