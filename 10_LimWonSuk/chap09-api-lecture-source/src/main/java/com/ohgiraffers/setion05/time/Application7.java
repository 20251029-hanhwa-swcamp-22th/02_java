package com.ohgiraffers.setion05.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application7
{
    public static void main(String[] args) {

        String timeNow = "14:05:10";
// 문자열로 시간 정보 저장

        String dateNow = "2022-10-12";
// 문자열로 날짜 정보 저장

        LocalTime localTime = LocalTime.parse(timeNow);
// 문자열 timeNow를 LocalTime 객체로 변환

        LocalDate localDate = LocalDate.parse(dateNow);
// 문자열 dateNow를 LocalDate 객체로 변환

        LocalDateTime localDateTime = LocalDateTime.parse(dateNow + "T" + timeNow);
// 문자열 결합(date + 'T' + time)을 LocalDateTime 객체로 변환

        System.out.println("localTime = " + localTime);
// LocalTime 객체 출력

        System.out.println("localDate = " + localDate);
// LocalDate 객체 출력

        System.out.println("localDateTime = " + localDateTime);
// LocalDateTime 객체 출력

        dateNow = "221005";
// 날짜 문자열을 새로운 형식(yyMMdd)으로 저장

        timeNow = "14-05-10";
// 시간 문자열을 새로운 형식(HH-mm-ss)으로 저장

        System.out.println("Pattern = " + LocalDate.parse(dateNow, DateTimeFormatter.ofPattern("yyMMdd")));
// 지정한 패턴(yyMMdd)으로 dateNow 파싱 후 LocalDate 객체 생성 및 출력

        System.out.println("Pattern = " + LocalTime.parse(timeNow, DateTimeFormatter.ofPattern("HH-mm-ss")));
// 지정한 패턴(HH-mm-ss)으로 timeNow 파싱 후 LocalTime 객체 생성 및 출력

        LocalDate localDate1 = LocalDate.now();
// 현재 날짜를 LocalDate 객체로 생성

        LocalTime localTime1 = LocalTime.now();
// 현재 시간을 LocalTime 객체로 생성

        String dateFormat = localDate1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
// LocalDate 객체를 지정한 포맷(yyyy-MM-dd)으로 문자열 변환

        String timeFormat = localTime1.format(DateTimeFormatter.ofPattern("HH시 mm분"));
// LocalTime 객체를 지정한 포맷(HH시 mm분)으로 문자열 변환

        System.out.println("dateFormat = " + dateFormat);
// 포맷된 날짜 문자열 출력

        System.out.println("timeFormat = " + timeFormat);
// 포맷된 시간 문자열 출력


    }
}
