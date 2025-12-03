package com.kth.section01.file;

import java.io.File;
import java.io.IOException;

public class Applicaiton {
  public static void main(String[] args) {

    /*
    * * java.io 패키지
    * - java의 입/출력 관련 클래스를 모아둔 패키지
    *
    * * java.io.File 클래스
    * - 파일을 다루기 위한 클래스
    * - 실제로 존재하는 파일, 존재하지 않는 파일 모두 다룰 수 있음
    * */

    File file = new File("src/main/java/com/kth/section01/file/test.txt");

    /* 파일을 새롭게 생성할 수 있다. */
    try {
      /* 파일 생성 후 성공 실패 여부를 boolean으로 리턴한다. */
      boolean createSuccess = file.createNewFile();

      /* 최초 실행하면 새롭게 파일이 만들어 지기 때문에 true을 반환하지만,
       * 파일이 한 번 생성되고 난 이후는 새롭게 파일을 만들지 않기 때문에 false를 반환한다.
       * */
      System.out.println("createSuccess : " + createSuccess);
    } catch (IOException e) {
      e.printStackTrace();
    }

    /* 생성한 파일의 크기 */
    System.out.println("파일의 크기 : " + file.length() + "byte");
    System.out.println("파일의 경로 : " + file.getPath());
    System.out.println("현재 파일의 상위 경로 : " + file.getParent());
    /* 절대 경로란 최상위 루트 위치부터의 경로를 의미한다. */
    System.out.println("파일의 절대 경로 : " + file.getAbsolutePath());

    /* 파일 삭제(삭제 후 성공 실패 여부를 boolean으로 반환한다.) */
    boolean deleteSuccess = file.delete();

    /* 삭제 이후에는 삭제가 되기 때문에 매번 실행할 때마다 파일 생성 결과는 true로 나오게 되니 참고할 것 */
    System.out.println("deleteSuccess : " + deleteSuccess);

  }
}
