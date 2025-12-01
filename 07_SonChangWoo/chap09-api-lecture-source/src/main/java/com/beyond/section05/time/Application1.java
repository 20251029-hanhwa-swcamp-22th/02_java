package com.beyond.section05.time;


import java.util.Date;

public class Application1 {
  public static void main(String[] args) {

    /* 기본 생성자 */
    Date today = new Date(); // 해당 라인이 해석되는 시간이 기록됨
    System.out.println("today = " + today);

    /* 매개 변수 있는 생성자 */
    Date date = new Date(1000L * 60 * 60 * 24 * 31);
    System.out.println("date = " + date);

  }
}
