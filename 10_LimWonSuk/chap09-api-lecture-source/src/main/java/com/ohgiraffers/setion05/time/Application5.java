package com.ohgiraffers.setion05.time;

import java.time.LocalDateTime;

public class Application5
{
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
// 현재 날짜와 시간을 가져와서 localDateTime 객체 생성

        LocalDateTime localDateTime1 = localDateTime.plusMinutes(30);
// 현재 시간에서 30분 더한 새 객체 생성 → localDateTime1

        LocalDateTime localDateTime2 = localDateTime.minusHours(3);
// 현재 시간에서 3시간 뺀 새 객체 생성 → localDateTime2

        LocalDateTime localDateTime3 = localDateTime.withDayOfYear(1);
// 현재 연도의 1번째 날로 변경한 새 객체 생성 → localDateTime3

        LocalDateTime localDateTime4 = localDateTime.plusDays(10);
// 현재 날짜에서 10일 더한 새 객체 생성 → localDateTime4

        LocalDateTime localDateTime5 = localDateTime.minusYears(2);
// 현재 연도에서 2년 뺀 새 객체 생성 → localDateTime5

        System.out.println("localDateTime = " + localDateTime);
// 원본 객체 출력 (현재 날짜 + 시간)

        System.out.println("분 변경 = " + localDateTime1);
// 30분 더한 시간 출력

        System.out.println("시 변경 = " + localDateTime2);
// 3시간 뺀 시간 출력

        System.out.println("일 변경 = " + localDateTime3);
// 연도의 1번째 날 출력

        System.out.println("일 변경 = " + localDateTime4);
// 10일 더한 날짜 출력

        System.out.println("년 변경 = " + localDateTime5);
// 2년 뺀 연도 출력

    }
}
