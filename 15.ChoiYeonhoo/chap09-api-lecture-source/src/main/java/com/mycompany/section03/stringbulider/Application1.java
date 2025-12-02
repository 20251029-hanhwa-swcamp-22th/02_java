package com.mycompany.section03.stringbulider;

public class Application1 {
  public static void main(String[] args) {

    // String 불변성 확인
    String str1 = "java";
    System.out.println(System.identityHashCode(str1)); // 메모리 주소로 만들어진 HashCode 출력

    str1 = str1 + "mariaDB"; // +=
    System.out.println(System.identityHashCode(str1)); //
    // -> 결과 다름 == 서로 다른 곳을 참조

    System.out.println("========== StringBuilder =============");
    StringBuilder sb = new StringBuilder();
    System.out.println(System.identityHashCode(sb));
    // StringBuilder.append(값) : 값을 제일 뒤에 추가(덧붙이기)
    sb.append("Java");
    System.out.println("sb = " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("Java");
    System.out.println("sb = " + sb.toString());
    System.out.println(System.identityHashCode(sb));

    sb.append("Java");
    System.out.println("sb = " + sb.toString());
    System.out.println(System.identityHashCode(sb));
  }
}
