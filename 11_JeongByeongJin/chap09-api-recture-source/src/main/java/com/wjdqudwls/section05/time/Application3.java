package com.wjdqudwls.section05.time;

import java.time.LocalDate;
import java.time.LocalTime;

public class Application3 {
  public static void main(String[] args) {

    // localTime
    // now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
    // of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환

    LocalTime timeNow = LocalTime.now();
    System.out.println("timeNow = " + timeNow);

    LocalTime timeof = LocalTime.of(12, 50, 10);
    System.out.println("timeof = " + timeof);

    //localDate
    // now() : 자신의 PC의 현재 날짜 기준으로 LocalDate 객체 반환
    // of() : 매개변수로 받은 날짜 기준으로 LocalDate 객체 반환
    LocalDate dateNow = LocalDate.now();
    LocalDate dateOf = LocalDate.of(2022, 1, 1);
    System.out.println("dateNow = " + dateNow);
    System.out.println("dateOf = " + dateOf);
  }
}
