package com.mycompany.section03.filterstream;

import java.io.*;

public class Application2 {
  public static void main(String[] args) {

    /* inputStreamReader
    * - 형변환 보조스트림
    * - 입력되는 byte(InputStream)를 char(Reader)로 변환하는 스트림 */


    /* 표준 스트림
    * - System.In, System.Out, System.Err
    * - byte 기반 스트림
    * - Java에서 콘솔 출력, 키보드 입력을 위한 기본 스트림
    * */
    // 최종적으로 bufferedReader형태를 띄어야 함
    try(BufferedReader br
            = new BufferedReader(new InputStreamReader(System.in))
    ){
      System.out.print("문자열 입력 : ");
      String input = br.readLine();
      System.out.println("입력 받은 문자열 : " + input);

    }
    catch (IOException e){
      System.out.println(e.getMessage());
    }

    /* 버퍼를 이용한 콘솔 출력 */
    // System.out 콘솔과 연결된 바이트 기반 스트림
    try(BufferedWriter bw
            = new BufferedWriter(new OutputStreamWriter(System.out))
    ){
      bw.write("버퍼를 이용한 출력 테스트\n");
      bw.write("System.out.println() 아님\n");
    }
    catch (IOException e){
      System.out.println(e.getMessage());
    }
  }
}
