package com.mycompany.section01.list.run;

import com.mycompany.section01.list.comparator.AscendingPrice;
import com.mycompany.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
  public static void main(String[] args) {

    /* 여러 권의 책 목록을 관리할 ArrayList 인스턴스 생성 */
    List<BookDTO> bookList = new ArrayList<>();
    // bookList는 BookDTO의 참조변수 묶음

    /* 도서 정보 추가 */
    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

    for (BookDTO book : bookList) {
      System.out.println(book/*.toString()*/); // 컴파일러가 자동 변환
    }

    // 모든 책의 합계, 평균 가격 구하기
    int sum = 0;

    for(BookDTO book : bookList){
      sum += book.getPrice();
    }
    System.out.println("sum = " + sum);

    double avg = (double)sum / bookList.size();
    System.out.println("avg = " + avg);

    System.out.println("===== 기본 오름 차순 정렬 ====="); // BookDTD 클래스에 CompareTo를 override한 것이 기본이 됨

    Collections.sort(bookList);
    for (BookDTO book : bookList) {
      System.out.println(book/*.toString()*/); // 컴파일러가 자동 변환
    }

    System.out.println("===== 다른 조건의 정렬 =====");
    Collections.sort(bookList, new AscendingPrice());
    for (BookDTO book : bookList) {
      System.out.println(book/*.toString()*/); // 컴파일러가 자동 변환
    }

  }
}
