package com.my.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {

  public static void main(String[] args) {
    /* 1. FileInputStream
    * File을 읽어오는 바이트 기반 스트림
    * 1byte 단위로 읽어옴.
    * */
    FileInputStream fis = null;

    // 지정된 파일의 내용을 바이트 단위로 읽어올 스트림 연결
    try {
      fis = new FileInputStream("testInputStream.txt");
      // 1) 1byte씩 읽어오기
//      int value = 0;
//      while ((value = fis.read()) != -1) {
//        System.out.print((char)value); // 개행문자까지
//      }

      // 2) byte 배열로 읽어오기
      byte[] barr = new byte[100];
      fis.read(barr);

      System.out.println(Arrays.toString(barr));
      String result = new String(barr); // 바이트 배열 저장 값으로 문자열 생성
      System.out.println(result);

    }catch (IOException e){
      e.printStackTrace();
    }finally {
      try {
        /* 자원(스트림) 반납이 필수적인 이유?
         * 1. 장기간 실행 중인 프로그램에서 스트림을 닫지 않으면 누수(leak)가 발생한다.
         * 2. 버퍼의 잔류 데이터가 남은 상태에서 추가로 스트림을 사용하면 데드락(deadlock)이 발생한다.
         * */
          fis.close();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
    }
  }
}
