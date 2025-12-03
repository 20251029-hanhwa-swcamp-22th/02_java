package com.mycompany.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {
  public static void main(String[] args) {

    /* FileOutputStream
    * - 바이트 기반 파일 출력 스트림
    *  (Java -> 파일)
    * */

    /* 파일 출력 스트림의 대상이 존재하지 않는다면
    * 자동으로 파일이 생성된다.
    * 단, 경로가 잘못되면 FileNotFoundException 발생
    * 
    * - append option 
    *   - true로 설정 하면 이어쓰기
    *   - false로 설정 하면 덮어쓰기(default)
    * */

    try(FileOutputStream fos = new FileOutputStream("testOutputStream.txt",false)){

      // 1) 1-byte씩 출력하기
//      fos.write('A');
//      fos.write('B');
//      fos.write('\n');
//      fos.write('C');
//      fos.write('D');
//      fos.write('가');
//      fos.write('나');
//      fos.write('다');

      // 2) byte[] 출력하기
      // - 1byte 단위로 출력하지만,
      //   배열로 묶어서 출력하면 글자가 깨지지 않음
      byte[] bytes = {97,98,99,100,101};
      bytes = "최연후".getBytes();
      fos.write(bytes);

      fos.write(new byte[]{65,66,67,68,69,70}, 1,3);
      // 66,67,68만 출력, (한칸 이후부터, 3개만)

      System.out.println("===== 파일 출력 완료 =====");


    }
    catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}
