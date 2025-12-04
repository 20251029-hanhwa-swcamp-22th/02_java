package com.ohgiraffers.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
  public static void main(String[] args) {
    /* FileOutputStream
    *  - 바이트 기반 파일 출력 스트림(java-> 파일)
    *  - append option을
    *     - true로 설정하면 이어쓰기
    *     - false 설정: 덮어쓰기(기본값)
    * */

    /* 파일 출력 스트림의 대상이 존재하지 않는다면
    * 자동으로 파일이 생성된다!
    * 단, 경로가 잘못되면 FileNotFoundException 발생 */

    // 기존 파일에 덮어쓰기 //append -> false 기존파일에 덮어짐 //true -> 기존 파일에 이어쓰기 진행됨
    try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt", false)) {

      // 1) 1 byte 씩 출력하기
//      fos.write('A'); // 유니코드 숫자라서 출력 가능
//      fos.write('B');
//      //fos.write('\n');
//      fos.write('C');
//      fos.write('D');
//      fos.write('가');
//      fos.write('나');
//      fos.write('백'); // 한글 깨짐
//      System.out.println("===== 파일 출력 완료 =====");

      // 2) byte[] 출력하기  // write -> bytes
      // - 1바이트 단위로 출력하지만
      // 배열로 묶어서 출력하면 글자가 깨지지 않는다.
      byte[] bytes = {97, 98, 99, 100, 101}; //a,b,c,d,e
      bytes = "최현지".getBytes();
      fos.write(new byte[]{65,66,67,68,69,70}, 1,3); //BCD 출력


    }catch (IOException e){
      System.out.println(e.getMessage());
    }

  }
}
