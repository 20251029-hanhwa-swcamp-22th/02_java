package com.mycompany.section01.literal;

public class Application2 {
  public static void main(String[] args) {
    /*
     값을 연산하여 값을 출력할 수 있다.
     이 때, 값의 결과는 연산에 사용된 값에 형태에 따라
     또는 연산자의 종류에 따라 달라진다.
    */

    /*
      정수와 정수 연산
    */
    System.out.println("=============== 정수와 정수 ================");
    System.out.println(123 + 456); // 579 (정수)
    System.out.println(123 - 12); // 100 (정수)
    System.out.println(123 * 10); // 1230 (정수)
    System.out.println(123 / 10); // 12 (정수), 정수와 정수 연산
    System.out.println(123 % 10); // %(modulo, mod) 나머지 연산, 3

    /* 컴퓨터의 값 처리 원칙
     * - 같은 타입(형식)끼리만 연산 가능
     * - 같은 타입 연산의 결과는 같은 타입이 된다
     * */

    /* 실수와 실수 연산 == 실수 */
    System.out.println("=============== 실수와 실수 ================");
    System.out.println(1.23 + 1.23); // 2.46
    System.out.println(1.23 - 0.5); // 0.73
    System.out.println(1.23 * 0.5); // 6.15
    System.out.println(1.23 / 0.5); // 2.46
    System.out.println(1.23 % 1.0); // 예상 0.23, 0.22999999999999998

    /* Java에서 실수(float, double)는 실제 딱 떨어지는 값이 아니라, 근사치 */

    /* 3. 정수와 실수 연산 */
    System.out.println("===========정수와 실수==================");
    System.out.println(123 + 0.5); // 123.5 (실수)

    /* 자동 형변화에 의해 정수가 실수로 변환된 뒤 연산*/
    System.out.println(123 - 0.5);
    System.out.println(123 * 0.5);
    System.out.println(123 / 0.5);
    System.out.println(123 % 0.5);

    /* 4. 문자와 문자 연산 */
    System.out.println("===========정수와 실수==================");
    System.out.println('a' + 0); // 97(정수) == '' 문자는 정수로 저장됨을 확인
    System.out.println('a' + 'b'); // 195(정수)
    System.out.println('a' - 'b'); // -1
    System.out.println('a' * 'b'); // 9506
    System.out.println('a' / 'b'); // 0
    System.out.println('a' % 'b'); // 97

    /* 5. 문자와 정수 */
    System.out.println("===========문자와 정수==================");
    System.out.println('A' + 0); // 65
    System.out.println('A' + 1); // 66
    System.out.println('A' - 1); // 64
    System.out.println('A' * 2); // 130
    System.out.println('A' / 2); // 32
    System.out.println('A' % 2); // 1

    /* 6. 문자와 실수 */
    System.out.println("===========문자와 정수==================");
    System.out.println('a' + 1.0); // 98.0
    System.out.println('a' - 1.0); // 96.0
    System.out.println('a' * 1.2); // 116.39999999999999
    System.out.println('a' / 0.5); // 194.0
    System.out.println('a' % 0.5); // 0.0


    /* 7. 문자열 연산 */
    // 문자열 연산은 + 연산만 가능하며, 연산 결과는 문자열 합치기(이어 붙이기)가 된다.
    // 문자열A + 문자열B = 문자열A문자열B (이어쓰기, + 연산)
    // 나머지 산술 연산 (-, *, /, %) 연산 자체가 안됨. 오류 발생

    System.out.println("hello" + "world"); // helloworld
    //System.out.println("hello" - "world");  //에러 발생
    //System.out.println("hello" * "world");  //에러 발생
    //System.out.println("hello" / "world");  //에러 발생
    //System.out.println("hello" % "world");  //에러 발생

    /* 8. 문자열과 다른 literal 연산 */
    // - '+' 연산에 문자열이 포함되면, 최종 결과는 무조건 문자열

    System.out.println("helloworld" + 123); // helloworld123
    System.out.println("helloworld" + 123.456); // helloworld123.456
    System.out.println("helloworld" + 'a'); // helloworlda
    System.out.println("helloworld" + true); // helloworldtrue
    System.out.println("123" + "456"); // 123456

    /* 9. 논리 값의 연산
     * - true(참)/false(거짓)
     * - 기본적인 산술 연산은 사용 불가
     * - 대신 비교 연산(==, !=, >=,<=,>,<), 논리 연산을 사용
     * */

//    System.out.println(true + false);				//에러 발생
    System.out.println(true == true);        //에러 발생

  }
}
