package com.ohgiraffers.section03.uses;

import java.io.*;

public class Application4 {
  public static void main(String[] args) {

    
    /*  try-with-resource 구문
    * - jdk 1.7(java7)에서 추가된 구문
    * - try에서 사용 후
    *   finally에서 close()하여 자원을 반환해야한 인스턴스가 있다면
    *   try 옆 () 내에 작성하여 자동으로 반환(close)하게 함
    * */

    try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
      String s = null;
      while(true){
        s = br.readLine(); // 한 줄 읽기

        if(s == null) break;

        System.out.println(s);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
