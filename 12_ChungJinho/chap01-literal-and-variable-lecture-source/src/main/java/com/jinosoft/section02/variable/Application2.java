package com.jinosoft.section02.variable;

public class Application2 {
  public static void main(String[] args) {

    // 변수 명명 규칙

    // 1-1. 동일한 범위 ({}, 블럭) 내에서는 동일한 변수명 사용 불가!
    int age;
    // int age; error
    // int long; // 에러
    // int true; // 에러

    // 1-3 대소문자를 구분한다.
    int inum;
    int Inum;

    // 1-4 변수명은 숫자로 시작할 수 없다
    int age1;
    int age2age;

    // 1-5 특수기호는 _(언더스코어)와 $만 사용가능
    int $age;
    int _age;
    int a_g$e;

    // 2-1 변수명의 길이 제한은 없다.
    int qwer45tyuioazsxdcfghjukilzxcdvfbnm12345678ui9o = 10;
    System.out.println("qwer45tyuioazsxdcfghjukilzxcdvfbnm12345678ui9o = " + qwer45tyuioazsxdcfghjukilzxcdvfbnm12345678ui9o);

    // 2-2 여러 단어의 합성어는 camelCase 형식으로 작성한다.
    // 모든단어를 붙여 쓰되, 연결되는 단어의 첫글자를 대문자로 표현
    int camelCase;

    // 2-3 단어와 단어 사이를 연결할 때 _를 사용하지 않는다.
    int user_name;
    int userName;

    // 2-4 한글로 변수명을 설정할 수 있지만 권장 X
    int 나이 = 26;
    System.out.println("나이 = " + 나이);

    String 이름 = "정진호";
    System.out.println("이름 = " + 이름);

    double 몸무게 = 70.1;
    System.out.println("몸무게 = " + 몸무게);

    // 2-5 변수명은 저장된 값이 어떤 의미를 가지는지 알 수 있게 작명
    int s = 100;
    int score = 100;

    // 2-6 전형적인 변수명이 있다면 사용하자
    int sum = 0;
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    double avg = 2.345;

    // 2-7 변수명은 명사로 작성할 수 있도록 한다.
    String go; // 동사는 권장 X, 동사는 메서드 이름으로 권장
    String home;

    // 2-8 boolean 변수 이름은 가급적 의문문으로 작명
    boolean isTrue;
    boolean isFalse;
    boolean isAlive;
    boolean isDead;

  }
}
