package section05.time;

import java.time.*;

public class Application3 {
  public static void main(String[] args) {

    // localTime(시분초 + micro_s + nano_s)
    // now() : 자신의 PC의 현재 시간 기준으로 LocalTime 객체 반환
    // of() : 매개변수로 받은 시간 기준으로 LocalTime 객체 반환

    LocalTime timeNow = LocalTime.now();
    System.out.println("timeNow = " + timeNow);

    LocalTime timeOf = LocalTime.of(12,50,10);
    System.out.println("timeOf = " + timeOf);

    //localDate(년월일)
    LocalDate dateNow = LocalDate.now();
    LocalDate dateOf = LocalDate.of(2022, 1, 1);
    System.out.println("dateNow = " + dateNow);
    System.out.println("dateOf = " + dateOf);

    // LocalDateTime(년월일시분초)
    LocalDateTime dateTimeNow = LocalDateTime.now();
    LocalDateTime dateTimeOf = LocalDateTime.of(dateNow, timeNow);
    System.out.println("dateTimeNow = " + dateTimeNow);
    System.out.println("dateTimeOf = " + dateTimeOf);

    //ZonedDateTime(특정 지역을 기준으로)
    ZonedDateTime zonedDateTimeNow = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(dateOf, timeOf, ZoneId.of("America/Los_Angeles"));
    System.out.println("zonedDateTimeNow = " + zonedDateTimeNow);
    System.out.println("zonedDateTimeOf = " + zonedDateTimeOf);
  }
}
