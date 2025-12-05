package com.kang.section01.object;

public class Application {


  public static void main(String[] args) {

    Book b1 = new Book(1, "홍길동전", "허균", 50000);
    Book b2 = new Book(2, "목민심전", "정약용", 60000);
    Book b3 = new Book(3, "채식주의자", "한강", 3000);


    /* print 구문, 문자열 이어쓰기 등에
    * 참조형 변수가 사용되면
    * 컴파일러가 자동으로 .toString을 추가해 준다.
    * */
    System.out.println("b1.toString() : " + b1.toString());
    System.out.println("b1 : " + b2);
    System.out.println("b1 : " + b3);

    /* equals() 오버라이딩 확인 */
    Book b4 = new Book(3,"채식주의자", "한강", 3000);

    // b3, b4 동일 비교 ( == , 참조하고 있는 주소가 같은지 비교)
    System.out.println("동일한가? " + (b3 == b4));
    System.out.println("동일한가? " + (b3.equals(b4)) );

    // b3, b4 동등 비교 (equals(), 객체가 가지고 있는 필드 값이 모두 같은지 비교)
    System.out.println("동등한가? " + (b3.equals(b4)));

  }
}
