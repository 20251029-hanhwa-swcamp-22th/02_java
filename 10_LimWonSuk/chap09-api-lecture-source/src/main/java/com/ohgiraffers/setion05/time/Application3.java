package com.ohgiraffers.setion05.time;

import java.time.*;

public class Application3 {
    public static void main(String[] args) {
        /*localtime(시분초+나노초)
        *LocalDater
         * now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
         *of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환 */

        LocalTime timeNow = LocalTime.now();
        System.out.println("timeNow = " + timeNow);
        System.out.println(System.nanoTime());

        LocalTime timeOf = LocalTime.of(12,50,0);
        System.out.println("timeOf = " + timeOf);

        LocalDate dateNow = LocalDate.now();
        System.out.println("dateNow = " + dateNow);
        LocalDate dateOf = LocalDate.of(2022, 1, 1);
        System.out.println("dateOf = " + dateOf);

        //LocalDateTime
        // now() : 자신의 PC의 현재 시간과 날짜 기준으로 LocalDate 객체 반환
        // of() : 매개변수로 받은 시간과 날짜 기준으로 LocalDate 객체 반환
        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("dateTimeNow = " + dateTimeNow);

        LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
        System.out.println("dateTimeOf = " + dateTimeOf);


        //ZonedDateTime
        // now() : ZoneId를 매개변수로 넘겨주면 ZonedDateTime 객체를 반환
        // of() : 매개변수로 java.util.TimeZone 의 getAvailableIDs() 메소드가 반환하는 값을 넣어 ZoneId 반환 받을 수 있다
        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        //ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
       // ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("Asia/Suole"));
        System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);


        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);


    }
}
