package com.qew032.section01.list.dto;

/* **************************************************************************************
 *  import
 * **************************************************************************************/

import java.io.Serializable;



/* **************************************************************************************
 *  class
 * **************************************************************************************
 *  Serializable: 객체를 파일에 저장하거나 네트워크로 보낼 수 있게 만드는 기능.
 *  Comparable: 책 객체끼리 정렬할 때 어떤 기준으로 비교할지 정해주는 기능.
 * **************************************************************************************/

// 도서 정보를 저장할 DTO 클래스.
public class BookDTO implements Comparable<BookDTO>, Serializable {

    // 파일로 저장된 내용과 지금 클래스가 동일한지 확인하는 번호.
    private static final long serialVersionUID = 1L;

    private int number;                       // 책 고유 번호
    private String title;                     // 책 제목
    private String author;                    // 저자 이름
    private int price;                        // 책 가격

    // BookDTO 기본 생성자
    public BookDTO() {
    }

    /**
     * BookDTO 메서드 생성자
     * - 책 정보 한번에 기입
     *
     * @param number 책 고유 번호 입력
     * @param title  책 제목 입력
     * @param author 책 저자 입력
     * @param price  책 가격 입력
     */
    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    /* 객체 복사 생성자 */
    public BookDTO(BookDTO other) {
        this.number = other.number;
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    public int getNumber() {                                            // 책 고유 번호 getter
        return number;
    }

    public void setNumber(int number) {                                 // 책 고유 번호 setter
        this.number = number;
    }

    public String getTitle() {                                          // 책 제목 getter
        return title;
    }

    public void setTitle(String title) {                                // 책 제목 setter
        this.title = title;
    }

    public String getAuthor() {                                         // 책 저자 getter
        return author;
    }

    public void setAuthor(String author) {                              // 책 저자 setter
        this.author = author;
    }

    public int getPrice() {                                             // 책 가격 getter
        return price;
    }

    public void setPrice(int price) {                                   // 책 가격 setter
        this.price = price;
    }

    @Override
    public String toString() {
        return "도서번호 [" + number + "] " + "제목: " + title + ", 저자: " + author + ", 가격: " + price + "원";
    }

    /*
     *  Comparable<T> 인터페이스
     *  >> 같은 인스턴스 끼리의 기본 비교 방법을 정의하는.
     *  >> compareTo 메서드 제공 인터페이스.
     *
     *  compareTo : 두 책 가격을 비교하여 정렬 기준을 정하는 메서드.
     *
     *  이름 순서 (String의 compareTo() 활용)
     *  >> this.title.compareTo(o.title);
     *
     *  가격 순서
     *  >> this.price - o.price;
     *  >> 결과값이 음수이면 this가 더 싸다 (앞에 온다).
     *  >> 결과값이 양수이면 this가 더 비싸다 (뒤에 온다).
     *  >> 결과값이 0이면 가격이 같다.
     *
     * */
    @Override
    public int compareTo(BookDTO o) {

        return this.price - o.price;                                    // 가격 순서

    }
}
