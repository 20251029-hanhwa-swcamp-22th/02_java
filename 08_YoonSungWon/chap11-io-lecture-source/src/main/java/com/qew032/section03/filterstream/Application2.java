package com.qew032.section03.filterstream;

import java.io.*;

public class Application2 {
  public static void main(String[] args) {


    /* InputStreamReader
    * - 형변환 보조 스트림
    * - 입력되는 byte(InputStream)를 char(Reader)로 변환하는 스트림
    * */


    /* 표준 스트림
    * - System.in, System.out, System.err
    * - 바이트 기반 스트림
    * - 자바에서 콘솔 출력, 키보드 입력을 위한 기본 스트림
    * */
    try(
        // new 연산자와 생성자를 중첩 호출하여, 키보드 System.in 기반 스트림을 문자 단위로 읽는 InputStreamReader 보조스트림으로 변환한 뒤
        // 다시 BufferedReader으로 연결하여 br 인스턴스를 초기화한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    ){
      System.out.print("문자열 입력 : ");
      String input = br.readLine();
      System.out.println("입력 받은 문자열 : " + input);

    }catch(IOException e){
      System.out.println(e.getMessage());
    }

    /* 버퍼를 이용한 콘솔 출력 */
    try(BufferedWriter bw
        = new BufferedWriter(new OutputStreamWriter(System.out))){

      bw.write("버퍼를 이용한 출력 테스트\n");
      bw.write("System.out.println() 아님\n");

    }catch (IOException e){
      System.out.println(e.getMessage());
    }

  }
}
