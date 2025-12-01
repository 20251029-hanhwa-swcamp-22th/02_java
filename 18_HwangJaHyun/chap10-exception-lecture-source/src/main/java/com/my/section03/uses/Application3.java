package com.my.section03.uses;

import java.io.*;

public class Application3 {
  public static void main(String[] args) {
    /* IO 패키지는 예외처리를 많이 사용한다.
     * 아직 IO를 수업하지 않았기 때문에 예외처리 구문을 위주로 보기
    * */
    BufferedReader br = null;

    try{
      FileReader fr = new FileReader("test.txt");
      br = new BufferedReader(fr);

      String s = null;
      while(true){
        s = br.readLine();
        if(s == null) break;
        System.out.println(s);
      }
    }catch(FileNotFoundException e){
      e.printStackTrace();
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      try {
        br.close(); // 스트림 해제 (메모리 반환)
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
