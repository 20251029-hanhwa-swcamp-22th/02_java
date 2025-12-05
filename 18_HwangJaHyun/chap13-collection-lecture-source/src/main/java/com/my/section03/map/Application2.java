package com.my.section03.map;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class Application2 {
  public static void main(String[] args) {
    /* Properties
    * key value String으로 고정
    * 프로그램 환경 설정과 관련된 데이터 읽을 때 사용
    * */

    /* 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용 */
    Properties prop = new Properties();

    prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
    prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
    prop.setProperty("user", "student");
    prop.setProperty("password", "pwd1234");

    System.out.println(prop);

    try{
      // Properties를 이용하여 파일 저장하기
      prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
      prop.store(new FileWriter("driver.txt"), "jdbc driver");
      prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
