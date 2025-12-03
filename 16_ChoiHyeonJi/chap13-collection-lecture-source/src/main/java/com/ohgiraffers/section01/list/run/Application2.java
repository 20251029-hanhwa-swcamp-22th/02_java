package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
  public static void main(String[] args) {
    /* 여러 권의 책 목록을 관리할 ArrayList 인스턴스 생성 */
    List<BookDTO> bookList = new ArrayList<>(); // List 인터페이스  BookDTO 참조변수 타입 ArrayList 자식 타입 다르면 업캐스팅
    //bookList는 BookDTO 참조 변수 묶음

    /* 도서 정보 추가 */
    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

    // 향상된 for문
    for(BookDTO book : bookList){
      System.out.println(book); //book.toString() 안해도 자동으로 알아서 추가해줌.
    }

    // 모든 책의 합계, 평균 가격 구하기
    int sum = 0;
    for(BookDTO book : bookList){
      sum += book.getPrice(); // 합계
    }


    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + ((double) sum/bookList.size())); //소수점 필요 double

    System.out.println("===== 기본 오름 차순 정렬 =====");

    Collections.sort(bookList);

    // 향상된 for문
    for(BookDTO book : bookList){
      System.out.println(book);
    }

    System.out.println("===== 다른 조건의 정렬 =====");

    Collections.sort(bookList, new AscendingPrice());

    // 향상된 for문
    for(BookDTO book : bookList){
      System.out.println(book); // 가격순으로 출력되는지 보기
    }

  }
}
