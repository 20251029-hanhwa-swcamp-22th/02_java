package com.mycompany.section03.list.service;

import com.mycompany.section03.list.comparator.AscendingPrice;
import com.mycompany.section03.list.dto.BookDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookService {
  private List<BookDTO> bookList;


  public BookService() {
    this.bookList = new ArrayList<>();

    /* 도서 정보 추가 */
    /* 외부 파일에 해당 정보 저장 및 불러오기 */

    loadBookDataFromCSV("C:\\SWCAMP22\\02_java\\15.ChoiYeonhoo\\example\\src\\main\\resources\\bookList.csv");

//    bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
//    bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
//    bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
//    bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
//    bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
  }

  //getter
  public List<BookDTO> getBookList() {
    return bookList;
  }

  /**
   * 책 목록에서 번호(number) 일치하는 책을 찾아서 반환
   *
   * @param bookNumber
   * @return BookDTO 또는 Null
   */
  public BookDTO selectBookNumber(int bookNumber) {

    // 반복문을 사용해서 모든 책 인스턴스에 접근
    for (BookDTO book : bookList) {
      if (book.getNumber() == bookNumber) {
        return book;
      }
    }
    return null;
  }

  /**
   * 책 목록에 새로운 책 추가
   * 단, "제목이" 중복되는 책은 추가 X
   * 반환 되는 number는 마지막 number + 1
   *
   * @param newBook
   * @return number 또는 0
   */
  public int addBook(BookDTO newBook) {
    // 중복 체크
    for (BookDTO book : bookList) {
      if (book.getTitle().equals(newBook.getTitle())) {
        return 0;
      }
    }

    // 다음 번호 생성
    int nextNumber = bookList.get(bookList.size() - 1).getNumber() + 1;

    // 책 정보를 목록에 추가
    newBook.setNumber(nextNumber);
    bookList.add(newBook);
    return nextNumber;

    // 바뀐 리스트 정보 CSV 파일에 저장

  }

  /**
   * 도서 목록에서 번호가 일치하는 책 제거
   *
   * @param bookNumber
   * @return 제거된 bookDTO 또느 null
   */
  public BookDTO deleteBook(int bookNumber) {

    // 반복문을 사용해서 모든 책 인스턴스에 접근
    // -> 똑같은 번호의 책을 목록에서 제거 후 반환
    for (int i = 0; i < bookList.size(); i++) {
      if (bookList.get(i).getNumber() == bookNumber) {

        return bookList.remove(i);
      }
    }
    return null;
    
    // 바뀐 리스트 정보 CSV 파일에 저장
  }

  /**
   * 책 제목 중 일부라도 keyword와 일치하는 책을 모두 반환
   *
   * @param keyword
   * @return searchBookList 또는 null
   */
  public List<BookDTO> searchBook(String keyword) {

    List<BookDTO> searchBookList = new ArrayList<>();

    for (BookDTO book : bookList) {

      // 제목에 keyword가 포함되어 있으면 true
      if (book.getTitle().contains(keyword)) {
        searchBookList.add(book); // 검색된 책 목록에 keyword 포함 책 추가
      }
    }
    return searchBookList;
  }

  /**
   * List 복사본을 만들어서 정렬 후 반환
   *
   * @param sortingNumber
   * @return sortedBookList
   */
  public List<BookDTO> sortBookList(int sortingNumber) {

    // 스트림을 이용한 List 깊은 복사
    List<BookDTO> sortedBookList = bookList.stream().map(BookDTO::new).collect(Collectors.toList());

    if (sortingNumber == 1) { // 기본 정렬 : 이름 오름차순
      Collections.sort(sortedBookList);
    } else {
      Collections.sort(sortedBookList, new AscendingPrice()); // 가격 오름 차순 정렬 (추가 정렬 기준)
    }

    return sortedBookList;
  }

  private void loadBookDataFromCSV(String filePath) {

    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

      String line;
      boolean isFirstLine = true;

      while ((line = reader.readLine()) != null) {

        if (isFirstLine) { // 첫 줄은 Header → 건너뛰기
          isFirstLine = false;

          continue;
        }

        String[] data = line.split(",");

        int number = Integer.parseInt(data[0]);
        String title = data[1];
        String author = data[2];
        int price = Integer.parseInt(data[3]);

        bookList.add(new BookDTO(number, title, author, price));
      }

      System.out.println("📚 CSV 파일 로드 완료: " + filePath);

    } catch (FileNotFoundException e) {
      System.out.println("⚠ CSV 파일을 찾을 수 없습니다: " + filePath);
      e.printStackTrace();
    } catch (IOException | NumberFormatException e) {
      System.out.println("⚠ CSV 파일 읽기 중 오류 발생!");
      e.printStackTrace();
    }
  }
}
