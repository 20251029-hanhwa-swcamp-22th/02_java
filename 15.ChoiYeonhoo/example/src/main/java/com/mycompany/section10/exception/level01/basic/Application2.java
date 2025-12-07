package com.mycompany.section10.exception.level01.basic;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {

    /* ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
     *
     * ----- 출력 예시 -----
     *
     * 만 20세 미만은 입장 불가입니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
     *
     * ----- 출력 예시 -----
     *
     * 입장하셔도 됩니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
     *
     * ----- 출력 예시 -----
     *
     * 날짜 양식을 잘못 입력하셨습니다.
     */
    Scanner sc = new Scanner(System.in);

    // 출력 종류
    /*
     * 1. 입장 하여도 됩니다
     * 2. 만 20세 미만은 입장 불가입니다. -> InvalidAgeException 발생
     * 3. 날짜 양식을 잘못 입력하셨습니다. -> 입력 형식 비교 해서 에러 띄우나? 그러면 제일 먼저 발생
     * */
    System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
    String input = sc.nextLine();

    try {
      // 입력 받을때도 오류발생하니까 여기부터 try/catch 구문
      LocalDate inputDate = LocalDate.parse(input); // yyyy-MM-dd 양식이 아니라면 DateTimeParseException 던짐
      LocalDate now = LocalDate.now();

      int age = Period.between(inputDate, now).getYears();

      if (age < 20) {
        throw new InvalidAgeException("만 20세 이상은 입장 불가 입니다.");
      }

      System.out.println("입장 하셔도 됩니다.");
    } catch (DateTimeException e) {
      System.out.println("날짜 양식을 잘못 입력하셨습니다.");
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }


  }

  private static class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
      super(message);
    }
  }
}
