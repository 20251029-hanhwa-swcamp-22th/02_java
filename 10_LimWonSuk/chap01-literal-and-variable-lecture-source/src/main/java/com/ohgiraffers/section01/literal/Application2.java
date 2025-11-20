package com.ohgiraffers.section01.literal;

public class Application2 {
  public static void main(String[] args) {
    // main + ztrl + enter 해도됨

    /*값을 연산하여 결과를 출력할 수 있다.
     * 이 때, 값의 결과는 연산에 사용된 값에 형 태에 따라
     * 또는 연산자의 종류에 따라 달라진다.
     * */

    /*1. 숫자와 숫자 연산*/
    System.out.println("====== 정수왕 정수 ========");
    System.out.println(123 + 456); // 579 (정수)
    System.out.println(123 - 23); // 100 (정수)
    System.out.println(123 * 10); // 1230 (정수)
    System.out.println(123 / 10); // 12
    System.out.println(123 % 10); // 3 (정수) --%(modulo, mod) : 나머지 연산

    /*컴퓨터의 값 처리 원칙
     * - 같은 타입(형식)끼리만 연산 가능
     * - 같은 타입 연산의 결과는 꼭 같은 타입이 된다
     * */


    /*2. 실수와 실수 연산 -> 결과도 실수*/
    System.out.println("==== 실수와 실수 ====");
    System.out.println(1.23 + 1.23);
    System.out.println(1.23 - 0.5);
    System.out.println(1.23 * 0.5);
    System.out.println(1.23 / 0.5);
    System.out.println(1.23 % 1.0); // 예상: 0.23, 실제: 0.229999999998

    /*java에서 실수(float, double)는 실제 딱 떨어지는 값이 아닌 근사치*/

    /*3.정수와 실수 연산*/
    System.out.println("===== 정수와 실수 =====");
    System.out.println(123 + 0.5); // 123.5(실수)
    System.out.println(1.23 - 0.5);
    System.out.println(1.23 * 0.5);
    System.out.println(1.23 / 0.5);
    System.out.println(1.23 % 0.5); // 0.0 (실수)
    // 자동 형변화에 의해 정수 -> 실수로 변환됨

    /* 4. 문자와 문자 연산* */
    System.out.println("===== 문자와 문자 =====");
    // a = 97
    System.out.println('a' + 0); // 97(정수) == '' 안의 문잔은 정수로 저장됨을 확인!
    System.out.println('a' + 'b');
    System.out.println('a' - 'b');
    System.out.println('a' * 'b');
    System.out.println('a' / 'b');
    System.out.println('a' % 'b');

    /* 5. 문자와 정수 */

    // A = 65
    System.out.println("===== 문자와 정수 =====");
    System.out.println('A' + 0);
    System.out.println('A' + 1);
    System.out.println('A' - 0);
    System.out.println('A' * 0);
    System.out.println('A' + 2);
    System.out.println('A' - 2);
    System.out.println('A' * 2);

    /* 6. 문자와 실수 연산*/
    System.out.println("===== 문자와 실수 =====");
    System.out.println('A' + 1.0);
    System.out.println('A' - 1.0);
    System.out.println('A' / 1.0);
    System.out.println('A' - 1.3);
    System.out.println('A' * 1.3);
    System.out.println('A' / 1.3);


    /* 7. 문자열과 문자열 연산
     * - 문자열A + 문자열B = 문자열A문자열B ?(이어쓰기,+ 연산)
     * - 나머지 산술 연산자 (-,*,/,%) 연산 자체가 안됨! (오류)
     */
    System.out.println("===== 문자와 실수 =====");
    System.out.println("Hello" + "World");
    System.out.println("Hello" + " " + "World");
/*    System.out.println("Hello" - "World"); //에러
    System.out.println("Hello" * "World"); //에러
    System.out.println("Hello" / "World"); //에러 */



    /* 8. 문자열과 다른 리터럴 연산
     * - '+' 연산에 문자열이 포함되면 최종 결과는 무조건 문자열
     */
    System.out.println("helloworld" + 123);
    System.out.println("helloworld" + 123.456);
    System.out.println("helloworld" + 'a');
    System.out.println("helloworld" + true);
    System.out.println("123" + "456");

    /* 9. 논리 값의 연산
     * - true(참) / false(거짓)
     * - true == 1 / false == 0
     * - 기본적인 산술 연산은 사용 불가
     * - 대신 비교 연산(==, !=), 논리 연산을 사용
     */
    // System.out.println(true + true); // 에러
    System.out.println(true == true); // 결과: true


  }
}