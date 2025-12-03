package com.ohgiraffers.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
  public static void main(String[] args) {
    /* FileOutputStream
    *
    * (java -> 파일)
    * */

    /* 파일 출력 스트림의 대상이 존재하지 않는다면
    * 자동으로 파일이 생성된다!
    * 단, 경로가 잘못되면 FileNotFoundException 발생
    *
    * - append option
    *   - true : 이어쓰기
    *   - false : 덮어쓰기 (기본값)
    * */
    try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt", true)) {
      // 1) int 출력하기
      fos.write('A');
      fos.write('B');
      fos.write('\n');
      fos.write('C');
      fos.write('D');
      fos.write('\n');

      // 2) byte[] 출력하기
      // - 1바이트 단위로 출력하지만
      //   배열로 묶어서 출력하면 글자가 깨지지 않음
      byte[] bytes = {97,98,99,100,101};
      bytes = "조민규".getBytes();
      fos.write(bytes);

      fos.write(new byte[]{65,66,67,68,69,70}, 1, 3);

      System.out.println("===== 파일 출력 완료 =====");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}
