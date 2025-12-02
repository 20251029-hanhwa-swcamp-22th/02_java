package com.beyond.section04.wrapper;

public class Application2 {
  public static void main(String[] args) {

    /* Wrapper Class 종류 == 기본 자료형 종류 */

    /* parsing :
      문자열(String) 값을 다른 원하는 자료형/형태로 바꾸는 것
      */

    /* 문자열 -> 기본 자료형 parsing */
    byte b = Byte.parseByte("1"); // "1"  ->  (byte) 1
    short s = Short.parseShort("2"); // "2"  ->  (byte) 2
    int i = Integer.parseInt("4"); // "4" ->  4
    long l = Long.parseLong("8"); // "8"  ->  8L
    float f = Float.parseFloat("4.0"); //
    double d = Double.parseDouble("8.0"); //
    boolean isTrue = Boolean.parseBoolean("true"); // "true"  -> true

    /* Character는 parsing 기능을 제공하지 않는다. */
    // char ch = Character.parseChar("c");
    char ch = "c".charAt(0);


  }
}
