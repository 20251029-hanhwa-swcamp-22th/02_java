package com.my.section05.time;

import java.time.*;

public class Application3 {
  public static void main(String[] args) {
    // localTime_시분초(나노초단위까지)
    // now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
    // of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환
    
    LocalTime timeNow = LocalTime.now();

    System.out.println("timeNow = " + timeNow); // 11:17:54.242343100 나노초까지

    LocalTime timeOf = LocalTime.of(12, 50, 0);
    System.out.println("timeOf = " + timeOf);

    //localDate(년월일)
    // now() : 자신의 PC의 현재 날짜 기준으로 LocalDate 객체 반환
    // of() : 매개변수로 받은 날짜 기준으로 LocalDate 객체 반환
    LocalDate dateNow = LocalDate.now();
    LocalDate dateOf = LocalDate.of(2022, 1, 1);
    System.out.println("dateNow = " + dateNow);
    System.out.println("dateOf = " + dateOf);

    //LocalDateTime(년월일시분초)
    // now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDate 객체 반환
    // of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDate 객체 반환
    LocalDateTime dateTimeNow = LocalDateTime.now();
    LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
    System.out.println("dateTimeNow = " + dateTimeNow);
    System.out.println("dateTimeOf = " + dateTimeOf);

    //ZonedDateTime
    // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime 객체를 반환
    // of() : 매개변수로 java.util.TimeZone 의 getAvailableIDs() 메소드가 반환하는 값을 넣어 ZoneId 반환 받을 수 있다
    ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
    ZonedDateTime zonedDateTimeNowLA = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
    System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
    System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
    System.out.println("zonedDateTimeNowLA = " + zonedDateTimeNowLA);

    System.out.println("====================================================");
    LocalTime localTime = LocalTime.now();
    System.out.println("localTime = " + localTime);
    System.out.println("초 : " + localTime.getSecond());
    System.out.println("분 : " + localTime.getMinute());
    System.out.println("시간 : " + localTime.getHour());

    System.out.println();

    LocalDate localDate = LocalDate.now();
    System.out.println("localDate = " + localDate);
    System.out.println("일년 중 몇 번째 일 : " + localDate.getDayOfYear());
    System.out.println("월 중 몇 번째 일 : " + localDate.getDayOfMonth());
    System.out.println("월(영어) : " + localDate.getMonth());
    System.out.println("월 : " + localDate.getMonthValue());
    System.out.println("년 : " + localDate.getYear());
    System.out.println("요일(영어) : " + localDate.getDayOfWeek());

    System.out.println();

    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println("zonedDateTime = " + zonedDateTime);
    System.out.println("UTC와 시차 : " + zonedDateTime.getOffset());
    System.out.println("Zone 정보 : " + zonedDateTime.getZone());
  }
}
