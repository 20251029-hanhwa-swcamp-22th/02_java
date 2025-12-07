package com.qew032.section01.list.service;

/* **************************************************************************************
 *  import
 * **************************************************************************************/

import com.qew032.section01.list.comparator.AscendingPrice;
import com.qew032.section01.list.dto.BookDTO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



/* **************************************************************************************
 *  class
 * **************************************************************************************
 *  실제 책 데이터를 저장하고 관리하는 핵심 클래스.
 *  책 추가 | 수정 | 삭제 | 검색 | 정렬 | 파일 저장까지 모든 기능 담당
 * **************************************************************************************/

public class BookService1 {

    private List<BookDTO> bookList;                                                                                     //  책 목록을 저장하는 리스트(책 여러 권을 저장하는 책장 역할)

    private static final String FILE_PATH = "books.dat";                                                                //  상수) 책 정보를 파일로 저장할 경로

    public BookService1() {                                                                                              //  BookService 기본 생성자

        bookList = new ArrayList<>();                                                                                   //  1. 빈 리스트 준비

        boolean isFileExists = loadFromFile();                                                                          //  2. 저장된 파일이 있는지 확인하며 불러오기

        if (!isFileExists) {                                                                                            //  3. 파일이 없을 때만 기본 책 데이터를 등록
            initDefaultData();
        }
    }

    private void initDefaultData() {                                                                                    //  초기 책 데이터 넣기

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 46000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));
        saveToFile();                                                                                                   //  초기 데이터를 파일로 저장

    }

    private boolean loadFromFile() {

        File file = new File(FILE_PATH);                                                                                //  파일 경로를 통해 파일 유/무 정보 가져오기

        if(!file.exists()) return false;                                                                                //  파일 자체가 없다면 처음 실행하는 것 >> false 반환

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){                                  //  파일이 있으면 읽기 시도
            bookList = (List<BookDTO>) ois.readObject();
            System.out.println(">> 파일에서 " + bookList.size() + "개 도서 불러옴");
        }catch(Exception e){                                                                                            //  파일이 깨졌거나 오류가 난 경우
            System.out.println("파일 읽기 오류: " + e.getMessage());
            bookList = new ArrayList<>();                                                                               //  안전하게 빈 리스트로 시작
        }
        return true;
    }

    public void saveToFile() {                                                                                          //  책 목록 전체를 파일에 저장

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
            oos.writeObject(bookList);
        }catch(IOException e){
            System.out.println("파일 저장 실패: " + e.getMessage());
        }

    }

    // getter
    public List<BookDTO> getBookList() {
        return bookList;
    }

    /**
     * 책 목록에서 번호(number)가 일치하는 책을 찾아서 반환
     *
     * @param bookNumber 찾고자 하는 책의 번호
     * @return BookDTO 또는 null
     */
    public BookDTO selectBookNumber(int bookNumber) {

        // 반복문을 이용해서 모든 책 인스턴스에 접근
        for (BookDTO book : bookList) {
            if (book.getNumber() == bookNumber) return book;
        }

        return null; // 번호가 일치하는 책이 없음
    }


    /**
     * 책 목록에 새로운 책 추가
     * 단, "제목"이 중복되는 책은 추가 X
     * 반환되는 number는 마지막 number + 1
     *
     * @param newBook
     * @return number 또는 0
     */
    public int addBook(BookDTO newBook) {

        // 중복 체크
        for (BookDTO book : bookList) {
            if (book.getTitle().equals(newBook.getTitle())) // 중복인 경우
                return 0;
        }

        // 다음 번호 생성
        int nextNumber = bookList.isEmpty() ? 1 : bookList.get(bookList.size() - 1).getNumber() + 1;

        // 책 정보를 목록에 추가
        newBook.setNumber(nextNumber);
        bookList.add(newBook);

        return newBook.getNumber(); // 생성된 책 번호 반환

    }

    /**
     * 도서 목록에서 번호가 일치하는 책 제거
     *
     * @param bookNumber
     * @return 제거된 BookDTO 또는 null
     */
    public BookDTO deleteBook(int bookNumber) {

        // 반복문을 이용해서 모든 책 인스턴스에 접근
        // -> 똑같은 번호의 책을 목록에서 제거 후 반환
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getNumber() == bookNumber) {
                return bookList.remove(i);
            }
        }

        return null;
    }


    /**
     * 책 제목 중 일부라도 keyword와 일치하는 책을 모두 반환
     *
     * @param keyword
     * @return searchBookList
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

        // Collections.sort() -> 원본 정렬

        // 스트림을 이용한 List 깊은 복사
        List<BookDTO> sortedList = bookList.stream().map(BookDTO::new).collect(Collectors.toList());

        if (sortingNumber == 1) { // 이름 오름차순(기본 정렬)
            Collections.sort(sortedList);
        } else { // 가격 오름차순(추가 정렬 기준)
            Collections.sort(sortedList, new AscendingPrice());
        }

        return sortedList;
    }
}
