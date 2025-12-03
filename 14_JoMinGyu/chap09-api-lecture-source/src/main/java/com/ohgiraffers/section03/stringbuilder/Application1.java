package com.ohgiraffers.section03.stringbuilder;

public class Application1 {
  public static void main(String[] args) {

    String str1 = "java";
    System.out.println(System.identityHashCode(str1));

    str1 = str1 + "mariaDB";
    System.out.println(System.identityHashCode(str1));

    System.out.println("===== StringBuilder =====");
    StringBuilder sb = new StringBuilder();
    System.out.println(System.identityHashCode(sb));

    sb.append("java");
    System.out.println("sb.toString() = " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("java");
    System.out.println("sb.toString() = " + sb.toString());
    System.out.println(System.identityHashCode(sb));


  }
}
