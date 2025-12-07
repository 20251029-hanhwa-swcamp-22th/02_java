package com.mycompany.section10.exception.level01.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
  public static void main(String[] args) {
    /* ----- 입력 예시 -----
     *
     * 분자 입력 : 10
     * 분모 입력 : 2
     *
     * ----- 출력 예시 -----
     *
     * 결과 : 5
     * 실행이 완료되었습니다.
     *
     * ----- 입력 예시 -----
     *
     * 분자 입력 : 십
     *
     * ----- 출력 예시 -----
     *
     * 오류 : 유효한 정수를 입력하세요.
     * 실행이 완료되었습니다.
     *
     * ----- 입력 예시 -----
     *
     * 분자 입력 : 10
     * 분모 입력 : 0
     *
     * ----- 출력 예시 -----
     *
     * 오류 : 0으로 나누는 것은 허용되지 않습니다.
     * 실행이 완료되었습니다.
     */

    Scanner sc = new Scanner(System.in);

    System.out.print("분자 입력 : ");
    try {
      int numerator = sc.nextInt();
      sc.nextLine();

      System.out.print("분모 입력 : ");
      int denominator = sc.nextInt();
      sc.nextLine();

//      double result = (double) numerator / denominator;
      int result = numerator / denominator;
      System.out.println("결과 : " + result);
    } catch (InputMismatchException e) {
      System.out.println("오류 : 유효한 정수를 입력하세요.");
    } catch (ArithmeticException e) {
      System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
    } finally {
      System.out.println("실행이 완료되었습니다.");
    }
    // 정수 아니면 InputMismatchException 발생함
    //? 왜 0넣어서 그냥 하면 에러가 안뜨고 infinity로 뜨지 ? -> double에서는 0으로 나누면 infinity로 나오게 되어있네
    // 그럼 그냥 문제에 맞게 정수로 두자
    // ArithmeticException 발생
  }
}
