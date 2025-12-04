package com.ohgiraffers.section01.jupiter;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* src/test/java 폴더는 테스트를 위한 클래스를 작성하고 모아두는 폴더 */
public class JupiterAssertionsTests {

    @Test
    public void testMethod() {
        int a = 10;
        int b = 20;

        Assertions.assertEquals(40,a+b);
    }

    /* 1. Assertions.assertEquals() : 예상 값과 실제 값이 일치하는지 판단 */
    @Test
    @DisplayName("값이 같은지 확인하는 테스트")
    public void testAssertEquals() {
        int firstNum = 100;
        int secondNum = 200;
        int expectedNum = 300;

        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum,secondNum);
        Assertions.assertEquals(expectedNum,result);
    }

    /* 2. assertNull: null 여부 테스트 */
    @Test
    @DisplayName("Null 여부 테스트")
    void testAsserNull() {
        String str = null;
        Assertions.assertNull(str);

        String str2 = "hello world";
        Assertions.assertNotNull(str2);
    }

    /* 3. assertAll(): 한 번에 여러 검증을 수행할 수 있는 메서드 */
    @Test
    @DisplayName("동시에 여러 값에 대한 검증")
    void testAssertAll() {
        Person person = new Person("길동","홍");
        Assertions.assertAll(
                "그룹화된 테스트의 이름(heading), 실패시 보여줌",
                () -> Assertions.assertEquals("길동",person.getFirstName()),
                () -> Assertions.assertEquals("홍",person.getLastName())
        );
    }

    /* 4. assertThrows: 예외가 던져지면 성공
    *     assertInstanceof: 타입이 맞으면 성공
    *  */
    @Test
    @DisplayName("Exception 발생 테스트")
    void testAssertThrows() {
        int a = 10;
        int b = 0;
        NumberValidation validation = new NumberValidation();

        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> validation.checkDividableNumbers(a,b));

        Assertions.assertInstanceOf(NullPointerException.class, exception);

    }

}
