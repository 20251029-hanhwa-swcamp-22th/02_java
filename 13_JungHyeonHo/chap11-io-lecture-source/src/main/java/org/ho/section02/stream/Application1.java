package org.ho.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class Application1 {
  public static void main(String[] args) {
/*
1. FileInputStream
  - File을 읽어오는 바이트 기반 스트림
  - 1byte 단위로 읽어옴
*/
    FileInputStream fis = null;
    try {
      // 지정된 파일의 내용을 바이트 단위로 읽어올 스트림 연결
      fis = new FileInputStream("testInputStream.txt");

//// 1) 1byte씩 읽어오기
//      int value = 0;
//      while((value=fis.read())!=-1){
//        System.out.print((char)value);
//      }
//    }
//    catch(FileNotFoundException e){
//      e.printStackTrace();
      // 2) byte 배열로 읽어오기
      byte[] barr = new byte[1000];
      fis.read(barr);

      System.out.println(Arrays.toString(barr));
      // 음수가 나오는 이유는 글자가 깨졌다는 의미
      // 0은 빈칸이라는 의미
      String result = new String(barr); // 바이트 배열 저장 값으로 문자열 생성
      System.out.println(result);

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        /* 자원 반납을 해야 하는 이유
         *  1. 장기간 실행중인 프로그램에서 스트림을 닫지 않는 경우 다양한 리소스에서 누수(leak)가 발생한다.
         *  2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야 한다.
         *     만약 잔류 데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
         *     판단하기 어렵고 의도하지 않는 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에는 flush()를
         *     무조건 실행해주는 것이 좋다.
         *     close()메소드는 자원을 반납하며 flush()를 해 주기 때문에 close()만 제대로 해 줘도 된다.
         *     따라서 close() 메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야 한다.
         * */
        /* try with resource 구문을 사용하면 마지막에 close를 자동으로 호출해준다. */
        fis.close();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
