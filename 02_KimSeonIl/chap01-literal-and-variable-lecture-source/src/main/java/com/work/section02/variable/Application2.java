package com.work.section02.variable;

public class Application2 {
  public static void main(String[] args) {

    /* 변수 명명 규칙 확인*/
    // 1-1. 동일한 범위 ({}, 블럭) 내에 동일한 변수명 사용 불가!
    int age;
//    int age; //에러
    // 1-2 예약어 사용 불가
//    int true; //에러
//    int long; //에러

//    1-3 대소문자를 구분한다.
    int inum;
    int Inum;

    // 1-4 변수명은 숫자로 시작할 수 없다.
//    int 1age; //에러
      int age1; //가능
      int age2age;

//     1-5 특수기호는 _(언더스코어), $(달러)만 사용 가능
      int _age;
      int $age;
//    int -age; //에러

//    /* java&개발자들의 약속(규약)*/
//    2-1. 변수명의 길이 제한은 없다.
      int dskfjaoisehjtalkdfjgopizxcuhjvblkasdjgdgfskldfjsdlkf = 10;
    System.out.println("dskfjaoisehjtalkdfjgopizxcuhjvblkasdjgdgfskldfjsdlkf = " + dskfjaoisehjtalkdfjgopizxcuhjvblkasdjgdgfskldfjsdlkf);

//    2-2. 여러단어의 합성어는 Camel-Case 형식으로 작성한다.
//    Camel-Case(낙타 표기법)
//    모든 단어를 붙여 쓰되, 연결되는 단어의 첫 글자를 대문자로 표현 하는 방식
      int maxAge = 40;
      int showMeTheMoney = 10000;
//     2-3 단어와 단어 사이를 연결할 때 _(언더스코어)를 사용하지 않는다
//    ->  Snake-Case : 연결되는 단어 사이를 _로 연결
//    다른 언어 또는 DB와 연결 시 모호함을 발생시킬 수 있음

    int user_name; // 에러는 아니지만 쓰지 말자
    int userName;

//    2-4. 한글로 변수명을 설정할 수 있지만 권장 X
    // 한글 한자 등은 호환 문제가 발생할 수 있기 때문에...
    int 나이 = 30;
    String 이름;
    double 몸무게;;

//    2-5. 변수명은 어떤 의미를 가지는지 알 수 있게 작명
    int s = 100; // 변수 선언과 동시에 초기화
    int score = 100;

//    2-6 전형적인 변수명이 있다면 사용하자
    int sum = 0;
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    double avg = 3.14159265368739;

//    2-7 변수명은 명사로 작성할수 있도록 한다.
    String goHome; //동사 권장 X, 동사는 method 이름으로 권장
    String home;

//    2-8 boolean 변수 이름은 가급적 의문문으로 작명하자
    boolean isTrue = true;
    boolean isFalse = false;
    boolean isAlive = false;
    boolean isDead = true;
  }

}
