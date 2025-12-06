package com.ohgiraffers.section01.jupiter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/* src/test/java 폴더
* - 테스트를 위한 클래스를 작성하고 모아두는 폴더
* */
public class JupiterAssertionsTests {

    // 테스트 코드 사용 해 보기
    @Test
    public void testMethod(){
        int a = 10;
        int b= 20;

       // Assertions.assertEquals(30, a + b);
        Assertions.assertEquals(40, a + b);
        // a+b의 결과가 30과 같으면 테스트 성공
        // 다른 값일경우 실패 메세지 출력




    }
    /* 1. Assertions.assertEquals() : 예상 값과 실제 값이 일치하는 판단*/

    @Test
    @DisplayName("값이 같은지 확인하는 테스트")
    public void testAssertEquals() {
        int firstNum = 100;
        int secondNum = 200;
        //int expectedNum = 500;
        int expectedNum = 300;

        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);

        Assertions.assertEquals(expectedNum, result);



        }
    /* 2. assertNull : null 여부 테스트
     * assertNotNull : Notnull 여부 테스트
     * */
    @Test
    @DisplayName("null 여부 테스트")
    void testAssertNull(){
        String str = null;
        Assertions.assertNull(str);

        String str2 = "Hello World";
        Assertions.assertNotNull(str2);
    }

    /* 3. AssertAll : 한 번에 여러 검증을 수행할 수 있는 메서드 */
    @Test
    @DisplayName("동시에 여러값에 대한 검증 테스트")
    void testAssertAll(){
        Person person = new Person("길동", "홍");
        Assertions.assertAll(
                "그룹화된 테스트의 이름(heading), 실패시 보여짐",
                () -> Assertions.assertEquals("길동", person.getFirstName()),
                //() -> Assertions.assertEquals("고", person.getLastName())
                () -> Assertions.assertEquals("홍", person.getLastName())
        );
    }

    /* 4. assertThrows : 예외가 던져지면 성공
    *       assertInstanceof : 타입이 맞으면 성공
    * */

    @Test
    @DisplayName("exception 발생 테스트")
    // 예외가 던져지면 반환
    void testAssertThrows(){
        int a = 10;
        int b = 0;
        //int b = 2; // 10 /2 가 예외가 안던져져서 실패

        NumberValidation validation = new NumberValidation();

       Exception exception = Assertions.assertThrows(
               // Exception 은 exception 타입인데
               //  IllegalArgument 에 Exception이 타입이 바뀌는것
                IllegalArgumentException.class,
                () -> validation.checkDividableNumbers(a, b)
        );
       Assertions.assertInstanceOf
              // (IllegalArgumentException.class, exception);
               (IOException.class, exception); // 실패구문 원하는 값이 아님


    }


}
