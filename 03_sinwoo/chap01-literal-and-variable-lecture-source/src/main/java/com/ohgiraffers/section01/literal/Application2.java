package com.ohgiraffers.section01.literal;

public class Application2 {
    public static void main(String[] args) {
        /* 값을 연산하여 결과를 출력할 수 있다
        * 이 때, 값의 결과는 연산에 사용된 값이 형태에 따라
        * 또는 연산자의 종류에 따라 달라진다.
        */

        System.out.println("==== 정수와 정수======");
        System.out.println(123+456); // 579
        System.out.println(123-23); // 100
        System.out.println(123*10);
        System.out.println(123/10);
        System.out.println(123%10);

        /* 컴퓨터의 값 처리 원칙
        *  같은 타입 끼리만 연산이 가능.
        * 같은 타입 연산의 결과는 꼭 같은 타입이 된다
        * */


        /* 2. 실수와 실수 연산 == 결과도 실수 */
        System.out.println("=========== 실수와 실수 ============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23-0.5);
        System.out.println(1.23 * 0.5);
        System.out.println(1.23/0.5);
        System.out.println(1.23%0.5);

        /* 자바에서 실수는 실제값이 아닌 근사치가 저장됨 */
        /* 정수와 실수 */
        System.out.println("=== 정수와 실수 ===");
        System.out.println(123 + 1.23); // 자동 형변환.
        System.out.println(123 - 1.23); // 자동 형변환.
        System.out.println(123 / 1.23); // 자동 형변환.
        System.out.println(123 * 1.23); // 자동 형변환.
        System.out.println(123 % 0.7); // 자동 형변환.

        /* 4. 문자와 문자 연산의 */
        System.out.println("=====문자와 문자=====");
        System.out.println('a' + 0); // ' '문자는 정수로 저장됨을 확인
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 5. 문자와 정수 */
        System.out.println("=====문자와 정수=====");
        System.out.println('A' + 1);
        System.out.println('A' - 1);
        System.out.println('A' * 2);
        System.out.println('A' / 2);
        System.out.println('A' % 2);

        /* 6. 문자와 실수 */
        System.out.println("======문자와 실수=====");
        System.out.println('A' + 1.23);
        System.out.println('A' - 1.23);
        System.out.println('A' / 1.23);
        System.out.println('A' * 1.23);
        System.out.println('A' % 1.23);


        /* 7. 문자열 연산 */
        System.out.println("hello" + "world");

        /* 8. 문자열과 다른 리터럴 연산 */
        System.out.println("=====문자열과 다른 리터럴=====");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");


        /* 9. 논리값
        *  기본적인 산술연산은 사용 불가하다.
        * 대신 비교연산 논리연산 사용
        * */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || false);
            
    }
}