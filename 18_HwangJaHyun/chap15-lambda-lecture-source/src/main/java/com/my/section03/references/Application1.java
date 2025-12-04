package com.my.section03.references;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
  public static void main(String[] args) {
    /* 메서드 참조를 이해하고 사용할 수 있다
    * @@@@@@ 매개변수 그대로 전달 @@@@@@@
    * */
    //BiFunction<String, String, Boolean> biFunction = (str1, str2) -> s1.equals(s2);
    BiFunction<String, String, Boolean> biFunction;
    String str1 = "METHOD";
    String str2 = "METHOD";

    /* 람다식 버전 */
    biFunction = (s1,s2) -> s1.equals(s2);
    boolean result = biFunction.apply(str1, str2);
    System.out.println("result = " + result);

    /* 익명 내부 클래스 */
    biFunction = new BiFunction<String, String, Boolean>() {
      @Override
      public Boolean apply(String s, String s2) {
        return s.equals(s2); // s의 equals(), 매개변수 s2
      }
    };

    /* 메서드 참조 버전 */
    biFunction = String::equals; // 정적...
    result = biFunction.apply(str1, str2);

    System.out.println("============================================");
    /* 람다식 버전 */
    //Predicate<Object> predicate = value -> value.equals(매개변수);
    Predicate<String> predicate;
    String sample = "hello World";
    predicate = str -> sample.equals(str);
    result = predicate.test("bye guys");
    System.out.println("result : " + result);

    /* 메서드 참조 버전 */
    predicate = sample::equals; // 인스턴스(sample) 메서드 참조
    result = predicate.test("bye guys");
    System.out.println("result : " + result);
  }
}
