package com.my.section01.list.service;

import com.my.section01.list.comparator.AscendingPrice;
import com.my.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
  private List<BookDTO> bookList;

  public BookService(){
    bookList = new ArrayList<BookDTO>();

    /* 도서 정보 추가 */
    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
  }

  // getter
  public List<BookDTO> getBookList(){
    return bookList;
  }

  /**
   * 책 목록에서 번호(number)가 일치하는 책을 찾아서 반환
   * @param bookNumber
   * @return BookDTO 또는 null
   */
  public BookDTO selectBookNumber(int bookNumber) {

    // 반복문을 이용해서 모든 책 인스턴스에 접근
    for (BookDTO book : bookList) {
      if (book.getNumber() == bookNumber) {
        return book; //얕은 복사
      }
    }
    return null; // 번호가 일치하는 책이 없음
    
    // print구문같은 거 없이 기능들만 모아둠
    // -> service로 분리
    // 비즈니스 로직
  }

  /**
   * 책 목록에 새로운 책 추가
   * 단, "제목"이 중복되는 책은 추가 X
   * @param newBook
   * @return number 또는 0
   */
  public int addBook(BookDTO newBook) {
    for (BookDTO book : bookList) {
      if(book.getTitle().equals(newBook.getTitle())){
        return 0;
      }
    }

    // 다음 번호 생성
    int nextNumber = bookList.get(bookList.size()-1).getNumber() + 1;

    // 책 정보를 목록에 추가
    newBook.setNumber(nextNumber);
    bookList.add(newBook);

    return nextNumber;
    // return newBook.getNumber(); // 생성된 책 번호 반환
  }

  /**
   * 도서 목록에서 번호가 일치하는 책 제거
   * @param bookNumber
   * @return 제거된 BookDTO 또는 null
   */
  public BookDTO deleteBook(int bookNumber) {
    // 반복문을 이용해서 모든 책 인스턴스에 접근
    // -> 똑같은 번호의 책을 목록에서 제거 후 반환
    for (int i = 0; i < bookList.size(); i++) {
      if(bookList.get(i).getNumber() == bookNumber){
        return bookList.remove(i);
      }
    }
//    for(BookDTO book : bookList){
//      if(book.getNumber() == bookNumber){
//        bookList.remove(book);
//        return book;
//      }
//    }
    return null;
  }

  /**
   * 책 제목 중 일부라도 keyword와 일치하는 책을 모두 반환
   * @param keyword
   * @return searchBookList
   */
  public List<BookDTO> searchBook(String keyword) {
    List<BookDTO> searchBookList = new ArrayList<>();
    for (BookDTO book : bookList) {
      if(book.getTitle().contains(keyword)){
        searchBookList.add(book); // 검색된 책 목록에 keyword 포함 책 추가
      }
    }
    return searchBookList;
  }

  /**
   *
   * @param sortingNumber
   * @return sortedBookList
   */
  public List<BookDTO> sortBookList(int sortingNumber) {
    // stream을 이용한 List 깊은 복사
                              //스트림으로 변환 //새스트림생성
    List<BookDTO> sortedList = bookList.stream().map(BookDTO::new).collect(Collectors.toList());

    if(sortingNumber == 1){
      //이름 오름차순(기본정렬)
      Collections.sort(sortedList);
    }else{
      Collections.sort(sortedList, new AscendingPrice());
    }
    return sortedList;
  }
}
