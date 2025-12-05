package com.my.section05.time;

import java.util.Date;

public class Application {
  public static void main(String[] args) {
    
    /* 기본 생성자 */
    Date today = new Date();  // 해당 라인이 해석되는 시간이 기록됨.
    System.out.println("today = " + today);

    /* 매개 변수 있는 생성자 */
    //Date date = new Date(0L);
    //Date date = new Date(1000L); // 1초
    //Date date = new Date(1000L * 60); // 1분
    //Date date = new Date(1000L * 60 * 60); // 1시간
    //Date date = new Date(1000L * 60 * 60 * 24); // 1일
    Date date = new Date(1000L * 60 * 60 * 24 * 31); // 1달

    System.out.println("date = " + date);
  }
}
