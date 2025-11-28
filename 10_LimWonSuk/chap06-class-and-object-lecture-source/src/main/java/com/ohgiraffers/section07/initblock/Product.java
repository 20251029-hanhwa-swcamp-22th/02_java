package com.ohgiraffers.section07.initblock;

import java.util.PrimitiveIterator;

public class Product
{
    /* 필드(멤버 변수)종류
    * 1. 인스턴스 변수 (non-static)
    * - 생성 : new 연산자에 의해서 생성
    * - 소멸 : 참조되지 않을 때 GC에 의해 제거
    *
    * 2. 클래스 변수 (static)
    * - 생성 : 프로그램 실행 시
    * - 생성 : 프로그램 종료 시
    * */

    /* 1.JVM 기본 값 */
    private int productNumber; // 0

    /* 2. 명시적 초기화 */
    private String name = "텀블러"; // 변수에 직접 값 대입

    private int price = 40000;

    private static String brand = "스타벅스";

    /*3. 초기화 블럭*/
    /* 인스턴스 초기화 블럭*/
    {
        price = 50000;
        System.out.println(("인스턴스 초기화 블럭 동작함"));
    }

    /* static 초기화 블럭 (클래스 변수 초기화 용도)
    *프로그램 실행시 단 1회만 동작함
    * */
    static
    {
   //  price = 100000; 아직 프로그램 시작전이라 prodeuct 인스턴스가 생성이안되어서 -> 인스턴스 price 초기화 불가능
     brand = "메머드ㅋ커피"; // 얘는 stacic이 붙어서 가능
        System.out.println(" static 초기ㅏ화 불럭동작하ㅓㅁ ");

    }

    /* 4. 생성자 */
    /* 4-1 기본생성자*/
    public Product()
    {
        System.out.println(" 기본 생성자 동작함 " );
    }
    public Product(int price)
    {
        this.price = price;
        System.out.println(" 매개변수 잇는 생성자 동작함 " );
    }


    /*
    * 객체에 저장된 필드값을 하나의 문자열로 만들어서 반환하는 메서드
    * @return
    * */

    public String getInformation()
    {
        // String.format("") : (printf=화면 콘솔에 출력) 처럼 문자열을 패턴으로 입력하여 완성된 문자열 반환
        return String.format(
                "productNumber: %d ," +
                        " name: %s ," +
                        " price: %d ," +
                        " brand: %s",
                productNumber,
                name,
                price,
                Product.brand);
    }



}
