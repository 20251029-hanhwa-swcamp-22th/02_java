package org.ho.section01.literal;

import java.util.Random;

public class Allpication2 {
  public static void main(String[] args) {
    /*
    갑 연산해서 결과 출력
     */
    System.out.println(123+456);
    System.out.println(123/10);
    System.out.println(123*10);
    System.out.println(123-23);
    /*
    컴퓨터의 값 처리 원칙
    - 같은 타입(형식)끼리만 연산 가능
     */
    System.out.println(1.23/0.5);
    /*
    3. 정수와 실수 연산 데스
     */
    System.out.println("=====정수와 실수=====");
    System.out.println(123+0.5);
    System.out.println(123*0.5);
    System.out.println(123/0.5);
    System.out.println(123%0.5);

    /*
    4. 문자와 문자 연산
     */
    System.out.println("-----문자와 문자 연산-----");
    System.out.println("A"+"B");
    System.out.println('A'+'B');
    System.out.println('A'+"B");
    System.out.println('A'+5);
    System.out.println('A'+'1');
    System.out.println('A'*5);
    System.out.println("A" + 5);

    /*
    5. 문자와 정수
     */
    System.out.println("=======문자와 정수=======");
    System.out.println('A'+0);
    System.out.println('A'+1);
    System.out.println('B'-'A');
    System.out.println('A'/5);
    System.out.println('A'+0);
    System.out.println('A'+1);
    System.out.println('a'-'A');


    /*
    6. 문자와 실수 연산
     */
    System.out.println("========문자와 실수==========");
    System.out.println('A'*5*10*9999999L);
    Random r=new Random(1231312);
    for (int i = 0; i < 10; i++) {
      System.out.println(r.nextInt());
    }
    /*
    7. 문자열 연산
    +연산만 가능
    -, *, /, %는 연산 자체가 안됨!
     */
    System.out.println("hello"+ " "+"world");
    /*
    8. 문자열과 다른 리터럴 연산
     - '+' 연산에 문자열이 포함되면 최종 결과는 무조건 문자열
     */
    System.out.println("hello"+1+2+'a');

    /*
    9. 논리 값의 연산
    - true/false
     */
    System.out.println("A"=="A");
    System.out.println("1".equals(1));
    System.out.println(true==false);
    System.out.println(true==true);
    /*
    10. 이어붙이기
     */
  }
}
