package com.ohgiraffers.object.section03.stringbuilder;

public class Application1 {
  public static void main(String[] args) {
    // String 불변성 확인
    String str1 = "java";
    System.out.println(System.identityHashCode(str1)); // 주소로 만들어진 해시코드 출력

    str1 = str1 + "mariaDB"; //
    System.out.println(System.identityHashCode(str1));
    // -> 결과 다름 == 서로 다른 곳을 참조

    System.out.println("===== StringBuilder ====="); //StringBuilder 자료형 // 클래스가 따로 있음
    StringBuilder sb = new StringBuilder();
    System.out.println(System.identityHashCode(sb));

    // StringBuild.append(값): 값을 제일 뒤에 추가(떳붙이기)
    sb.append("java"); //append 뒤에 붙음
    System.out.println("sb.toString() : " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("java"); //append 뒤에 붙음
    System.out.println("sb.toString() : " + sb.toString());
    System.out.println(System.identityHashCode(sb));




  }
}
