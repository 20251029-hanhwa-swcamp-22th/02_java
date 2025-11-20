package org.ho.section02.variable;

public class Application2 {
  public static void main(String[] args) {

    /* 변수 명명 규칙 확인 */

    // 1-1. 동일한 범위 ({}, 블럭) 내에서는 동일한 변수명 사용 불가!
    int age;
    // int age;   //에러 발생

    // 1-2. 예약어 사용 불가
    // int true;  //에러 발생
    // int long;  //에러 발생

    // 1-3. 변수명은 대소문자를 구분한다
    int Alpha;
    int alpha;    //쌉가능

    // 1-4. 변수명은 숫자로 시작할 수 없다
    // int 1age;     //불가능
    int a1ge;     //가능

    // 1-5. 특수기호는 _(언더스코어), $(달러)만 사용 가능하다.
//    int !age; //에러
//    int age!; //에러
    int a_ge;
    int _age;
    int $age;
    int a$ge;
//    int %age; //에러
//    int a%ge; //에러

    /* java & 개발자들의 약속(규약) */
    // 2-1. 변수명의 길이 제한은 없다.
    int asdhfsadjfhsbadhfjbsadhjfvjxkhzcgvxlkzhuiweragthiwabfklbsadfklj = 10;
    System.out.println("asdhfsadjfhsbadhfjbsadhjfvjxkhzcgvxlkzhuiweragthiwabfklbsadfklj = " + asdhfsadjfhsbadhfjbsadhjfvjxkhzcgvxlkzhuiweragthiwabfklbsadfklj);

    // 2-2. 여러 단어의 합성어는 Camel-Case 형식으로 작성한다.
    // Camel-Case(낙타 표기법)
    // - 모든 단어를 붙여 쓰되, 연결되는 단어의 첫 글자를 대문자로 표현
    int maxAge = 40;
    int showMeTheMoney = 100000;
    String myNameIsJungHyeonHo = "내이름은 정현호";

    // 2-3. 단어와 단어 사이를 연결할 때 _(언더스코어)를 사용하지 않는다
    // Snake-case : 연결되는 단어 사이를 _로 연결
    // -> 다른 언어 또는 DB와 연결 시 모호함 발생시킬 수 있음

    int a_x = 10; // 언더스코어 쓰지 마라!
    int aX = 10; // 오케이요

    // 2-4. 한글로 변수명을 설정할 수 있지만 권장 X
    // 영어 제외한 언어(한글 포함)들 중 호환이 안되는 경우가 많음...
    int 나이 = 20;
    String 이름 = "정현호";
    double 몸무게 = 70.1;

    System.out.println("나이 = " + 나이);
    System.out.println("이름 = " + 이름);
    System.out.println("몸무게 = " + 몸무게);

    //2-5. 변수명은 저장된 값이 어떤 의미를 가지는지 알 수 있게 작명
    int s = 100; // 변수 선언과 동시에 초기화
    int score = 100; // 점수가 100

    //2-6. 전형적인 변수명이 있다면 사용하자
    int sum = 0;
    int max = Integer.MAX_VALUE; //int 최대값
    int min = Integer.MIN_VALUE; //int 최소값
    double avg = 2.434;

    //2-7. 변수명은 명사로 작성할 수 있도록 한다.
    String goHome;  //동사 권장 X, 동사는 method 이름으로 권장
    String home;

    //2-8. boolean 변수 이름은 가급적 의문문으로 작명하자.
    boolean isTrue = true;
    boolean isFalse = false;
    boolean isAlive = true;
    boolean isDead;
    boolean isPassionate = true;


  }
}
