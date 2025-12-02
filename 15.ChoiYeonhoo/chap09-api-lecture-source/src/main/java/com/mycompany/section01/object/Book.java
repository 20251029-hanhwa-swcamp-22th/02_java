package com.mycompany.section01.object;

/* 클래스 선언 시 extends 구문이 미작성되면
* 컴파일러가 extends Object를 자동 추가
* */


import java.util.Objects;

public class Book {

  /* 책 정보를 관리할 수 있는 Book클래스를 작성 */
  private int number;
  private String title;
  private String author;
  private int price;

  /* 기본 생성자 */
  public Book() {
    super();
  }

  /* 매개 변수 있는 생성자 */
  public Book(int number, String title, String author, int price) {
    this.number = number;
    this.title = title;
    this.author = author;
    this.price = price;
  }

  /* getter, setter */
  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }


  // toString() 메서드의 목적 : 인스턴스의 정보를 문자열로 반환
  // -> 오버라이딩 시 인스턴스의 모든 필드값을 반환하도록 재정의
  @Override
  public String toString() {
//    return super.toString();
    return "Book { " + "number : " + number + ", title : " + title + ", author : "+ author + ", price :" + price + "}" ;
  }

  /* equals overriding */
  @Override
  public boolean equals(Object obj) {

    if (obj == null || getClass() != obj.getClass() ) return false;

    /* 비교를 위해 다운 캐스팅 진행 */
    Book other = (Book) obj;

    return this.number == other.number
        && this.title.equals(other.title)   // 여기에 equals는 title이 String타입 이라 String.equals 임
        && this.author.equals(other.author)
        && this.price == other.price;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, title, author, price);
  }

  /* hashCode overriding
  * - 동등한 객체는 동등한 hashCode()를 가져야 한다.
  * */


  // 직접 작성 안하고 alt + insert 하면 자동 생성 있음
//  @Override
//  public boolean equals(Object o) {
//    if (o == null || getClass() != o.getClass()) return false;
//    Book book = (Book) o;
//    return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(number, title, author, price);
//  }
}
