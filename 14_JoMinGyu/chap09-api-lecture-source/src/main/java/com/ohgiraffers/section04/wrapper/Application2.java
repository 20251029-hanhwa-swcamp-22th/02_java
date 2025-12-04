package com.ohgiraffers.section04.wrapper;

public class Application2 {
  public static void main(String[] args) {

    byte b = Byte.parseByte("1");
    System.out.println("b = " + b);
    short s = Short.parseShort("2");
    System.out.println("s = " + s);
    int i = Integer.parseInt("4");
    System.out.println("i = " + i);
    long l = Long.parseLong("8");
    System.out.println("l = " + l);
    float f = Float.parseFloat("4.0");
    System.out.println("f = " + f);
    double d = Double.parseDouble("8.0");
    System.out.println("d = " + d);
    boolean isTrue = Boolean.parseBoolean("true");
    System.out.println("isTrue = " + isTrue);
    //char ch = Character.parseChar("c");
    char ch = "chick".charAt(0);
    System.out.println("ch = " + ch);
    boolean isT = Boolean.parseBoolean("true");
    System.out.println("isT = " + isT);
  }
}
