package com.mycompany.section06.classandobject.level02.normal.book.run;

import com.mycompany.section06.classandobject.level02.normal.book.model.dto.BookDTO;

public class Application {
  public static void main(String[] args) {
    // 기본 생성자를 이용하여 인스턴스 생성 후 필드값 출력
    BookDTO constructor1 = new BookDTO();
    constructor1.printInformation();

    // 필드 3가지를 초기화 하는 생성자를 이용하여 생성 후 필드 값 출력
    BookDTO constructor2 = new BookDTO("자바의 정석", "도우출판", "남궁성");
    constructor2.printInformation();

    //모든 필드를 초기화 하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
    BookDTO constructor3 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
    constructor3.printInformation();
  }
}
