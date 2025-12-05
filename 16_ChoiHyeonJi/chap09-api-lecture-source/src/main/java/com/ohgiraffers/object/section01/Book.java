package com.ohgiraffers.object.section01;

/* 클래스 선언 시 extends 구문이 미작성되면
* 컴파일러가 extends object를 자동 추가 */

import java.util.Objects;

public class Book {
  /* 책 정보를 관리할 수 있는 Book클래스를 작성 */
  private int number;
  private String title;
  private String author;
  private int price;

  // ctrl + spacebar
  // alt + insert 생성자 만들기

  /* 기본 생성자 */
  public Book() {
    super();
  }

  /* 모든 필드를 초기화하는 생성자 */
  public Book(int number, String title, String author, int price) {
    this.number = number;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  /* setter/getter */
  public void setNumber(int number) {
    this.number = number;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPrice(int price) {
    this.price = price;
  }


  // toString() 메서드의 목적 : 인스턴스의 정보를 문자열로 반환
  // -> 오버라이딩 시 인스턴스의 모든 필드 값을 반환하도록 함.
  @Override
  public String toString() {
    return "Book{" +
        "number : " + number
        + ", title : " + title
        + ", author : " + author
        + ", price : " + price
        + "}";
  }


  /* equals 오버라이딩 */
  @Override
  public boolean equals(Object obj) {
    if (obj == null || getClass() != obj.getClass()) return false;

    /* 다운캐스팅 진행*/
    Book ohter = (Book) obj;
    return this.number == ohter.number && this.title.equals(ohter.title)
        && this.author.equals(ohter.author) && this.price == ohter.price;
  }




  /* hashCode() 오버라이딩
   * - 동등한 객체는 동등한 hashCode()를 가져야 한다.
   * -
   * */

  @Override
  public int hashCode() {
    return Objects.hash(number, title, author, price);
  }




}
